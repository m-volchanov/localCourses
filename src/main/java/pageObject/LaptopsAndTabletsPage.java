package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LaptopsAndTabletsPage {

    public WebDriver driver;
    public WebDriverWait webDriverWait;

    public LaptopsAndTabletsPage(WebDriver driver) {
        this.driver = driver;
        this.webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public LaptopsPage goToLaptopsPage() {
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("(//a[@class='portal-navigation__link'])[1]"))).click();
        return new LaptopsPage(driver);
    }
}
