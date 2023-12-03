package lessons.lesson25;

import pageObject.init.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestJsExecutorClick extends WebDriverInit {

    @Test
    public void testClickViaJs() throws InterruptedException {
        driver.get("https://rozetka.com.ua/");
        WebElement searchInput = driver.findElement(By.name("search"));
        searchInput.sendKeys("Mac");
        WebElement btnSearch = driver.findElement(
                By.xpath("//button[cintains(@class, 'search-form__submit')]"));

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click();", btnSearch);

        TimeUnit.SECONDS.sleep(5000);
    }
}
