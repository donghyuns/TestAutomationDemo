package selenium.testng.tests;

import selenium.testng.library.TestLibrary;
import selenium.testng.pages.ConfirmationPage;
import selenium.testng.pages.FormPage;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

@Test
public class DemoTest extends TestLibrary {
    public void verifyFormDemo() {
        System.setProperty("webdriver.chrome.driver", "/Users/donghyun/chromedriver");

        //WebDriver driver = new ChromeDriver();
        WebDriver driver = getWebDriver("chrome");

        driver.get("https://formy-project.herokuapp.com/form");

        FormPage formPage = new FormPage();
        formPage.submitForm(driver);

        ConfirmationPage confirmationPage = new ConfirmationPage();
        confirmationPage.waitForAlertBanner(driver);

        assertEquals("The form was successfully submitted!", confirmationPage.getAlertBannerText(driver));

        driver.quit();
    }

}
