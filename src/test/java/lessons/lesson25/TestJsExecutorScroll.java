package lessons.lesson25;

import init.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestJsExecutorScroll extends WebDriverInit {

    @Test
    public void testScrollViaJs() throws InterruptedException {
        driver.get("https://rozetka.com.ua/");

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0, 1000)", "");

        TimeUnit.SECONDS.sleep(5);
    }
}
