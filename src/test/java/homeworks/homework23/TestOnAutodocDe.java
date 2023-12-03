package homeworks.homework23;

import pattern.pageObject.init.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestOnAutodocDe extends WebDriverInit {

    final String EXPECTED_TITTLE = "TRW Fett";

    @Test
    public void homeTestOnAutodoc() {
        driver.get("https://www.autodoc.de/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement cookiesNotification = wait.until(
                ExpectedConditions.presenceOfElementLocated(By.linkText("Alle Cookies erlauben")));
        if (cookiesNotification.isDisplayed()) {
            cookiesNotification.click();
        }
        driver.manage().deleteAllCookies();
        WebElement LkwSection = driver.findElement(By.xpath("//a[contains(@class, 'header-i--truck')]"));
        LkwSection.click();
        WebElement oilsAndLiquids = driver.findElement(
                By.xpath("(//span[@class='truck-home-parts__item-title'])[1]"));
        oilsAndLiquids.click();
        WebElement btnBuyForFirstProduct = driver.findElement(
                By.xpath("(//a[contains(@class, 'still_add_to_basket')])[1]"));
        btnBuyForFirstProduct.click();
        WebElement productInTheBasket = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//span[text()='IHR WARENKORB - 1 Artikel']")));
        productInTheBasket.click();
        WebElement tittleOfFirstProduct = driver.findElement(
                By.xpath("//td[@class='info']//h3[text()='TRW Fett']"));
        String tittle = tittleOfFirstProduct.getText().trim();
        String itemCountText = driver.findElement(
                By.xpath("//input[@class='item_qty qty_1']")).getAttribute("value").trim();
        int itemCountInTheBasket = Integer.parseInt(itemCountText);
        if (itemCountInTheBasket == 1) {
            System.out.println("В корзину добавлен один товар.");
        } else {
            System.out.println("Ошибка: В корзине не один товар.");
        }
        Assert.assertEquals(tittle, EXPECTED_TITTLE, "Tittle doesn't contains searching data");
    }
}
