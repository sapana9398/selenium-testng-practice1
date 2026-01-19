package utilities;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
//import java.net.URL;
import java.net.URL;

//Extent report 5.x...//version

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import baseTest.BaseTest;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import baseTest.BaseTest;

public class ExtentReportManager implements ITestListener {

    public ExtentSparkReporter sparkReporter;
    public ExtentReports extent;
    public ExtentTest test;


    public void onStart(ITestContext testContext){

        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        sparkReporter = new ExtentSparkReporter(".\\reports\\+ "+ "Execution Report_"+timeStamp+".html");
        sparkReporter.config().setDocumentTitle("Automation Execution Report");
        sparkReporter.config().setReportName("Regression Testing");
        sparkReporter.config().setTheme(Theme.STANDARD);

        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);
        extent.setSystemInfo("Application Name","Amazon");
        extent.setSystemInfo("Functionality","Search");
        extent.setSystemInfo("Username",System.getProperty("user.name"));
        extent.setSystemInfo("Environment","Test");

        extent.setSystemInfo("Browser",testContext.getCurrentXmlTest().getParameter("browser"));
        extent.setSystemInfo("Groups",testContext.getCurrentXmlTest().getIncludedGroups().toString());

    }

    public void onTestSuccess(ITestResult result){

        test = extent.createTest(result.getTestClass().getName());
        test.assignCategory(result.getMethod().getGroups());
        test.log(Status.PASS, result.getMethod().getMethodName() + " Executed successfully");

    }
    public void onTestFailure(ITestResult result){
        test = extent.createTest(result.getTestClass().getName());
        test.assignCategory(result.getMethod().getGroups());
        test.log(Status.FAIL, result.getMethod().getMethodName() + "Execution failed");


        try {
            String imagePath = new BaseTest().captureScreen(result.getName());
            test.addScreenCaptureFromPath(imagePath);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void onTestSkipped(ITestResult result){
        test = extent.createTest(result.getTestClass().getName());
        test.assignCategory(result.getMethod().getGroups());
        test.log(Status.SKIP, result.getMethod().getMethodName() + "Execution has been skipped");
        test.log(Status.INFO, result.getThrowable().getMessage());
    }


    public void onFinish(ITestContext testContext){
        extent.flush();
    }
}