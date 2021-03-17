package selenium.testng.library;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class TestBase extends SeleniumBase {

    /*
        To-Do : Any config for Remote Selenium Server in @BeforeTest
     */
    @BeforeTest
    public void initFramework() throws Exception {
        // Initialize configuration
    }
    @BeforeTest
    public void initTests() throws Exception{
        // Start Selenium Server
    }

    // Create global WebDriver
    @BeforeMethod
    public void setUpTests() {
        try {
            super.openBrowser();
        } catch (Exception e) {
            //
        }
    }

    // Close WebDriver
    @AfterMethod
    public void tearDownTests() throws Exception{
        try {
            super.closeBrowser();
        } catch (Exception e) {
            //
        }
    }

    @AfterTest
    public void cleanUp() {
        try {


        } catch (Exception e) {

        }
    }

    public WebDriver getDriver() {
        return driver; // static handle to Selenium object
    }

}
