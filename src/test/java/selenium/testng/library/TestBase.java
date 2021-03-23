package selenium.testng.library;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.fluent.Configurations;

import java.io.File;

public class TestBase extends SeleniumBase {

    /*
        To-Do : Any config for Remote Selenium Server in @BeforeTest
     */
    @Parameters({ "config-file" })
    @BeforeTest
    public void initFramework(String configfile) throws Exception {
        // Initialize configuration
        Configurations configs = new Configurations();
        // Read data from this file
        File propertiesFile = new File(configfile);
        //FileBasedConfigurationBuilder<PropertiesConfiguration> builder = configs.propertiesBuilder(propertiesFile);
        PropertiesConfiguration config = configs.properties(propertiesFile);

        super.config = config;
    }
    @BeforeTest
    public void initTests() throws Exception{
        // Start Selenium Server
        //super.startSeleniumServer();
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
