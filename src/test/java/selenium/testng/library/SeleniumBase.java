package selenium.testng.library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/* To-Do for Selenium Grid */
public class SeleniumBase {

    public static WebDriver driver;

    // To-Do : Getting parameters from external config file
    private static String browser = "chrome";
    //private static String serverport = "4444";

    public void openBrowser() {

        switch (browser) {
            default:
                driver = new ChromeDriver();
                //return new ChromeDriver();
            case "ie":
                driver = new InternetExplorerDriver();
                //return new InternetExplorerDriver();
            case "ff":
                driver = new FirefoxDriver();
                //return new FirefoxDriver();
        }
        //driver.get("http://");
    }

    public void closeBrowser() {
        try {
            driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void startSeleniumServer() throws Exception {

    //Get all the selenium server properties
        //String browser = "chrome";

    //Selenium Server
        //SeleniumServer.setEnsureCleanSession(true);
        //seleniumServer = new SeleniumServer(false, configuration);
        //seleniumServer.start();

    }

    public void stopSeleniumServer() {
        //seleniumServer.stop();
    }



}
