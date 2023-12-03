package lessons.lesson25;

import pageObject.init.WebDriverInit;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestAlertExample extends WebDriverInit {

    @Test
    public void testWithAlert() throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("alert('Are you sure?')");

        TimeUnit.SECONDS.sleep(5);

        driver.switchTo().alert().accept();

        TimeUnit.SECONDS.sleep(5);
    }
}
