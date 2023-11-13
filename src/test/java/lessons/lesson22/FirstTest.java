package lessons.lesson22;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstTest {
    private WebDriver driver;
    private WebDriverWait webDriverWait;

    final String EXPECTED_TITTLE = "JP GROUP Bremsscheibe\nVorderachse, 211x10mm, 4, voll, beschichtet";

    @BeforeTest
    public void initDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    @Test
    public void firstTest() {
        driver.get("https://www.autodoc.de/");
        WebElement cookiesNotification = driver.findElement(By.linkText("Alle Cookies erlauben"));
        if (cookiesNotification.isDisplayed()) {
            cookiesNotification.click();
        }
        driver.manage().deleteAllCookies();

        WebElement searchInput = driver.findElement(By.name("keyword"));
        searchInput.sendKeys("Bremsscheiben");
        WebElement btnSearch = driver.findElement(
                By.xpath("//a[contains(@class, 'search_submit form-submitter')]"));
        btnSearch.click();
        WebElement tittleOfFirstProduct = driver.findElement(
                By.xpath("(//a[@class = 'ga-click'])[1]"));
        String tittle = tittleOfFirstProduct.getText().trim();

        Assert.assertEquals(tittle, EXPECTED_TITTLE, "Tittle doesn't contains searching data");
    }

    @AfterTest
    public void after() {
        driver.quit();
    }
}
