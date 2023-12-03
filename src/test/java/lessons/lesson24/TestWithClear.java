package lessons.lesson24;

import pattern.pageObject.init.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class TestWithClear extends WebDriverInit {
    @Test
    public void testClear() throws InterruptedException {
        driver.get("https://www.google.com.ua/");
        WebElement inputSearch = driver.findElement(By.name("q"));
        inputSearch.sendKeys("Hello world");
        sleep(5000);
        inputSearch.clear();
        sleep(5000);
    }
}
