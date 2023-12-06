package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LaptopsPage {

    public WebDriver driver;

    public LaptopsPage(WebDriver driver) {
        this.driver = driver;
    }

    public CartPage addFirstProductToCart() {
        boolean isClicked = false;
        int attempts = 0;

        while (!isClicked && attempts < 3) {
            try {
                WebElement element = driver.findElement(
                        By.xpath("(//button[contains(@class, 'buy-button')])[1]"));
                element.click();
                isClicked = true;
            } catch (StaleElementReferenceException e) {
                attempts++;
            }
        }
        return new CartPage(driver);
    }
}