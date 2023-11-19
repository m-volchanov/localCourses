package homeworks.homework24;

import init.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HomeworkOnAtdDe extends WebDriverInit {

    int expectedProductCount = 15;

    @Test
    public void captureTitlesAndPrices() {
        driver.get("https://www.autodoc.de/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement cookiesNotification = wait.until(
                ExpectedConditions.presenceOfElementLocated(By.linkText("Alle Cookies erlauben")));
        if (cookiesNotification.isDisplayed()) {
            cookiesNotification.click();
        }

        WebElement LkwSection = driver.findElement(By.xpath("//a[contains(@class, 'header-i--truck')]"));
        LkwSection.click();
        WebElement oilsAndLiquids = driver.findElement(
                By.xpath("(//span[@class='truck-home-parts__item-title'])[1]"));
        oilsAndLiquids.click();

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("div.all_desc_item")));
        List<WebElement> productElements = driver.findElements(new By.ByCssSelector("div.all_desc_item"));
        Map<String, String> productInfoMap = new HashMap<>();

        for (WebElement productElement : productElements) {
            String title = productElement.findElement(
                    By.cssSelector("div.name")).getText().trim();
            String price = productElement.findElement(
                    By.cssSelector("div.price > p.actual_price.js-price-noVat")).getText().trim();
            String priceWithNoCurrency = price.replaceAll("[^\\d.,]", "");
            String formattedPrice = priceWithNoCurrency.replace(',', '.');
            productInfoMap.put(title, formattedPrice);
        }
        String fileWithParts = "C:\\Users\\user1\\IdeaProjects\\localCourses\\src\\test\\java\\homeworks\\homework24\\autodocTest.txt";

        try (FileWriter writer = new FileWriter(fileWithParts)) {
            for (Map.Entry<String, String> entry : productInfoMap.entrySet()) {
                String productInfo = entry.getKey() + " - " + entry.getValue() + "\n";
                System.out.println("Записываем в файл: " + productInfo);
                writer.write(productInfo + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(productInfoMap.size(), expectedProductCount, "Количество товаров не соответствует ожидаемому");
    }
}