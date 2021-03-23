package selenium.testng.library;

import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
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
    public static PropertiesConfiguration config = null;
    //private static String serverport = "4444";

    public void openBrowser() throws MalformedURLException {
        String hubhost = config.getString("HUBHOST");
        String browser = config.getString("BROWSER");
        String baseurl = config.getString("BASEURL");

        switch (browser) {
            default: //Chrome
                /* Selenium Grid */
                ChromeOptions chromeOptions = new ChromeOptions();
                driver = new RemoteWebDriver(new URL(hubhost), chromeOptions);
                /* Local */
                //System.setProperty("webdriver.chrome.driver", "/Users/donghyun/chromedriver");
                //driver = new ChromeDriver();
            case "IE":
                driver = new InternetExplorerDriver();
            case "FF":
                driver = new FirefoxDriver();
        }

        driver.get(baseurl);
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
