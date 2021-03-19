package selenium.testng.library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

/* To-Do for Selenium Grid */
public class SeleniumBase {

    public static WebDriver driver;

    // To-Do : Getting parameters from external config file
    private static String browser = "chrome";
    //private static String serverport = "4444";

    public void openBrowser() throws MalformedURLException {
        //System.setProperty("webdriver.chrome.driver", "/Users/donghyun/chromedriver");
        switch (browser) {
            default:
                /* Selenium Grid */
                ChromeOptions chromeOptions = new ChromeOptions();
                driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), chromeOptions);
                /* Local */
                //driver = new ChromeDriver();
            case "ie":
                driver = new InternetExplorerDriver();
            case "ff":
                driver = new FirefoxDriver();
        }

        driver.get("http://");
    }

    public void closeBrowser() {
        try {
            driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void startSeleniumServer() throws Exception {

    }

    public void stopSeleniumServer() {
        //seleniumServer.stop();
    }



}
