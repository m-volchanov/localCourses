package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageObject.init.WebDriverInit;

public class LaptopsAndTabletsPage extends WebDriverInit {
    public LaptopsAndTabletsPage(WebDriver driver) {
        this.driver = driver;
    }

    public LaptopsPage goToLaptopsPage() throws InterruptedException {
        driver.findElement(By.xpath("(//a[@class='portal-navigation__link'])[1]")).click();
        Thread.sleep(5000);
        return new LaptopsPage(driver);
    }
}
