package homeworks.homework25;

import pageObject.init.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class homeworkOnAtdDe extends WebDriverInit {

    String expectedTitle = "Datenschutzerklärung";
    String expectedHandlingSituationsText = "2. Verarbeitungssituationen";

    @Test
    public void testWithPrivatePolicyOnAutodoc() {
        driver.get("https://www.autodoc.de/");

        handleCookiesNotification();
        clickLoginBtn();
        clickRegistrationBtn();
        clickPrivacyPolicyLink();
        switchToNewTab();
        checkTitle(expectedTitle);
        checkHandlingSituations(expectedHandlingSituationsText);
    }

    public void handleCookiesNotification() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement cookiesNotification = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.linkText("Alle Cookies erlauben")));
        if (cookiesNotification.isDisplayed()) {
            cookiesNotification.click();
        }
    }

    private void clickLoginBtn() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//*[@id=\"wrapper\"]/header/div/div[1]/div[2]/a")));
        loginBtn.click();
    }

    private void clickRegistrationBtn() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement registrationBtn = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//*[@id=\"login_top\"]/p/a")));
        registrationBtn.click();
    }

    private void clickPrivacyPolicyLink() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement privacyPolicy = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//*[@id=\"privacy_policy_header_modal\"]/a")));
        privacyPolicy.click();
    }

    private void switchToNewTab() {
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
    }

    private void checkTitle(String expectedTitle) {
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Тайтл не соответствует ожидаемому.");
    }

    private void checkHandlingSituations(String expectedHandlingSituationsText) {
        WebElement handlingSituationsElement = driver.findElement(
                By.xpath("//*[@id=\"content\"]/div[2]/p[20]/strong"));
        Assert.assertTrue(handlingSituationsElement.isDisplayed(), "Элемент не отображается на странице.");

        String actualHandlingSituationsText = handlingSituationsElement.getText();
        Assert.assertEquals(actualHandlingSituationsText,
                expectedHandlingSituationsText, "Текст элемента не соответствует ожидаемому.");
    }
}