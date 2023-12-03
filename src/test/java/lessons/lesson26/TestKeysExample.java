package lessons.lesson26;

import pattern.pageObject.init.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class TestKeysExample extends WebDriverInit {
    @Test
    public void testKeys() throws InterruptedException {
        driver.get("https://rozetka.com.ua/");
        WebElement searchInput = driver.findElement(By.name("search"));
        searchInput.sendKeys(Keys.chord(Keys.SHIFT, "mac"));
        sleep(5000);
        searchInput.sendKeys(Keys.ENTER);
        sleep(5000);
    }
}
