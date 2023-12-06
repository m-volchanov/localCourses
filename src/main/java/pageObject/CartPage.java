package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObject.init.WebDriverInit;

import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class CartPage {

    public WebDriver driver;
    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public CartPage verifyCartItemCount(int expectedItemCount) {
        List<WebElement> cartItems = driver.findElements(
                By.xpath("//rz-icon-badge/span[@class='badge badge--green ng-star-inserted']"));
        return this;
    }

    public CartPage goToCartPage(int expectedItemCount) {
        driver.findElement(
                By.xpath("//button[@rzopencart and contains(@class, 'header__button--active')]")).click();
        return this;
    }

    public CartPage verifyProductInCart(String expectedProductName) {
        WebElement productElement = driver.findElement(By.xpath("//a[@data-testid='title']"));
        String actualProductName = productElement.getText();
        assertEquals("Название товара не совпадает", expectedProductName, actualProductName);
        return this;
    }
}
