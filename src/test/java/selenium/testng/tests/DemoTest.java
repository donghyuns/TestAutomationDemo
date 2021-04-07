package selenium.testng.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import selenium.testng.library.TestBase;
import selenium.testng.pages.ConfirmationPage;
import selenium.testng.pages.FormPage;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DemoTest extends TestBase {
    //@Test(groups = { "demo" })
    public void verifyForm() {
        //System.setProperty("webdriver.chrome.driver", "/Users/donghyun/chromedriver");
        //WebDriver driver = new ChromeDriver();

        WebDriver driver = getDriver();

        driver.get(config.getString("BASEURL") + "form");

        FormPage formPage = new FormPage();
        formPage.submitForm(driver);

        ConfirmationPage confirmationPage = new ConfirmationPage();
        confirmationPage.waitForAlertBanner(driver);

        assertEquals("The form was successfully submitted!", confirmationPage.getAlertBannerText(driver));

        //driver.quit();
    }

    //@Test(groups = { "demo" })
    public void VerifyKeyboardAndMouseInput() {

        WebDriver driver = getDriver();
        driver.get(config.getString("BASEURL") + "keypress");

        WebElement inputfield = driver.findElement(By.id("name"));
        inputfield.click();
        inputfield.sendKeys("Quality Engineer");

        WebElement button = driver.findElement(By.id("button"));
        button.click();
    }

    @Test(groups = { "demo" })
    public void VerifyAutocomplete() {
        WebDriver driver = getDriver();
        driver.get(config.getString("BASEURL") + "autocomplete");

        try {
            WebElement addr = driver.findElement(By.id("autocomplete"));
            addr.sendKeys("Seoul");
            Thread.sleep(1000);

            WebElement autocompleteResult = driver.findElement(By.cssSelector("body > div.pac-container.pac-logo.hdpi > div:nth-child(1)"));
            autocompleteResult.click();
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

}
