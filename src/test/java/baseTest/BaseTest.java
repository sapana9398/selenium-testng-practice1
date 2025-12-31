package baseTest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class BaseTest {
    public WebDriver driver;
    public Logger logger;

    @BeforeClass
    @Parameters({"browser"})
        public void setup (String browser) {

        //creation of log4j
        logger= LogManager.getLogger(this.getClass());

        switch (browser.toLowerCase()){
            case "chrome": driver = new ChromeDriver(); break;
            case "edge": driver = new EdgeDriver(); break;
            case "ie" : driver = new InternetExplorerDriver(); break;
            case "firefox" : driver = new FirefoxDriver(); break;
            default:
                System.out.println("Incorrect Browser"); break;
        }


            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            driver.get("https://tutorialsninja.com/demo/");
            driver.manage().window().maximize();
        }

    @AfterClass
    public void clear(){
        driver.quit();
    }
}
