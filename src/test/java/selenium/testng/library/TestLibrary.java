package selenium.testng.library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import selenium.testng.tests.TestBase;

public class TestLibrary extends TestBase {

    public WebDriver getWebDriver(String browser) {

        switch (browser) {
            default:
                return new ChromeDriver();
            case "ie":
                return new InternetExplorerDriver();
            case "ff":
                return new FirefoxDriver();
        }
        /*
        if (browser.equals("chrome"))
            return new ChromeDriver();
        else if (browser.equals("ie"))
            return new InternetExplorerDriver();
        else if (browser.equals("ff"))
            return new FirefoxDriver();

        //default
        return new ChromeDriver();

         */
    }
}
