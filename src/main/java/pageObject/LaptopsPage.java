package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageObject.init.WebDriverInit;

public class LaptopsPage extends WebDriverInit {
    public LaptopsPage(WebDriver driver) {
        this.driver = driver;
    }

    public CartPage addFirstProductToCart() {
        driver.findElement(By.xpath("(//span[contains(@class, 'goods-tile__title')])[1]"));
        driver.findElement(By.xpath("(//button[contains(@class, 'buy-button')])[1]")).click();
        return new CartPage(driver);
    }
}
