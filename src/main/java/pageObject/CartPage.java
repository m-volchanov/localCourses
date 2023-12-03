package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObject.init.WebDriverInit;

import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class CartPage extends WebDriverInit {
    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public CartPage verifyCartItemCount(int expectedItemCount) throws InterruptedException {
        List<WebElement> cartItems = driver.findElements(
                By.xpath("//rz-icon-badge/span[@class='badge badge--green ng-star-inserted']"));
        Thread.sleep(5000);
        return this;
    }

    public CartPage goToCartPage(int expectedItemCount) throws InterruptedException {
        driver.findElement(
                By.xpath("//button[@rzopencart and contains(@class, 'header__button--active')]")).click();
        Thread.sleep(5000);
        return this;
    }

    public CartPage verifyProductInCart(String expectedProductName) {
        WebElement productElement = driver.findElement(By.xpath("//a[@data-testid='title']"));
        String actualProductName = productElement.getText();
        assertEquals("Название товара не совпадает", expectedProductName, actualProductName);
        return this;
    }
}
