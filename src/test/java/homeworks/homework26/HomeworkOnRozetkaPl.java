package homeworks.homework26;

import init.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class HomeworkOnRozetkaPl extends WebDriverInit {

    private String expectedActionLabel = "PROMOCJA";


    @Test
    public void testOnRozetkaPl() {
        driver.get("https://rozetka.pl/");

        handleCookiesNotification();
        goToLaptopsSection();
        applyBrandFilter();
        applyPriceFilter(15000);
        goToFirstProductWithActionLabel("PROMOCJA");
        checkActionLabel();
    }

    private void handleCookiesNotification() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement cookiesNotification = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//button[@class='button button_size_large button_color_green']")));
        if (cookiesNotification.isDisplayed()) {
            cookiesNotification.click();
        }
    }

    private void goToLaptopsSection() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement laptopsAndTabletsCategory = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("(//a[@class='menu-categories__link'])[1]")));
        laptopsAndTabletsCategory.click();
        WebElement laptopsCategory = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("(//a[@class='portal-navigation__link'])[1]")));
        laptopsCategory.click();
    }

    private void applyBrandFilter() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement brandFilter = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("(//a[contains(@class, 'checkbox-filter__link')])[5]")));
        brandFilter.click();
    }

    private void applyPriceFilter(int maxPrice) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        WebElement maxPriceInput = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//input[@formcontrolname='max']")));
        maxPriceInput.clear();
        maxPriceInput.sendKeys(Integer.toString(maxPrice));
        WebElement applyFilterBtn = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[contains(@class, 'slider-filter__button')]")));
        applyFilterBtn.click();
    }

    private void goToFirstProductWithActionLabel(String expectedActionLabel) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> productsWithActionLabel = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(
                By.xpath("(//span[contains(@class, 'promo-label_type_action')])[1]")));
        Assert.assertFalse(productsWithActionLabel.isEmpty(), "Не найдены продукты с акционной плашкой.");
        WebElement firstProductWithActionLabel = productsWithActionLabel.get(0);
        WebElement productName = firstProductWithActionLabel.findElement(
                By.xpath("(//span[contains(@class, 'goods-tile__title')])[1]"));
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0);");
        WebElement actionLabel = firstProductWithActionLabel.findElement(
                By.xpath("(//span[contains(@class, 'promo-label_type_action')])[1]"));
        String actualActionLabel = actionLabel.getText();
        Assert.assertEquals(actualActionLabel, expectedActionLabel, "Метка акции не соответствует ожидаемой.");
        productName.click();
        wait.until(ExpectedConditions.urlContains("p383969898"));
    }

    private void checkActionLabel() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement actionLabel = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[@id='#scrollArea']//li[2]//span[contains(@class, 'promo-label')]")));
        Assert.assertTrue(actionLabel.isDisplayed(),
                "Плашка " + expectedActionLabel + " не отображается на странице продукта.");
    }
}