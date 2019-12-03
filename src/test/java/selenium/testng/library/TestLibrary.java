package selenium.testng.library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import selenium.testng.tests.TestBase;

public class TestLibrary extends TestBase {
    public WebDriver getWebDriver(String browser) {

        switch (browser) {
            case "chrome":
                return new ChromeDriver();
            case "ie":
                break;
            case "ff":
                break;
        }
        return new ChromeDriver();
    }
}
