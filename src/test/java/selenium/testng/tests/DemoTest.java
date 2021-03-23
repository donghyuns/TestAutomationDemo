package selenium.testng.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import selenium.testng.library.TestBase;
import selenium.testng.pages.ConfirmationPage;
import selenium.testng.pages.FormPage;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class DemoTest extends TestBase {
    @Test
    public void verifyFormDemo() {
        //System.setProperty("webdriver.chrome.driver", "/Users/donghyun/chromedriver");

        //WebDriver driver = new ChromeDriver();
        //WebDriver driver = getWebDriver("chrome");
        WebDriver driver = getDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        FormPage formPage = new FormPage();
        formPage.submitForm(driver);

        ConfirmationPage confirmationPage = new ConfirmationPage();
        confirmationPage.waitForAlertBanner(driver);

        assertEquals("The form was successfully submitted!", confirmationPage.getAlertBannerText(driver));

        driver.quit();
    }

}
