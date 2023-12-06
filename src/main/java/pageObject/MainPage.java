package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {

    public WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public MainPage openMainPage() {
        driver.get("https://rozetka.pl/");
        return this;
    }

    public MainPage handleCookies() {
        WebElement cookiesNotification = driver.findElement(
                By.xpath("//button[@class='button button_size_large button_color_green']"));
        if (cookiesNotification.isDisplayed()) {
            cookiesNotification.click();
        }
        return this;
    }

    public LaptopsAndTabletsPage goToLaptopsAndTabletsPage() {
        driver.findElement(By.xpath("(//a[@class='menu-categories__link'])[1]")).click();
        return new LaptopsAndTabletsPage(driver);
    }
}
