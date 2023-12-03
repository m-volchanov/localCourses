package lessons.lesson24;

import pattern.pageObject.init.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestFindElements extends WebDriverInit {

    @Test
    public void findElemenets() {
        driver.get("https://rozetka.com.ua");
        WebElement laptopAndCompCategory = driver.findElement(
                By.xpath("//ul[contains(@class, 'menu-categories_type_main')]/li[1]"));
        laptopAndCompCategory.click();
        WebElement subCategory = driver.findElement(
                By.xpath("(//a[contains(@href, 'c80004/')])[1]"));
        subCategory.click();

        By tittles = By.xpath("//span[@class='goods-tile__title']");
        webDriverWait.until(ExpectedConditions.elementToBeClickable(tittles));
        List<WebElement> listOfTittles = driver.findElements(
                By.xpath("//span[@class='goods-tile__title']"));

        for (WebElement element : listOfTittles) {
            String tittleText = element.getText();
            System.out.println(tittleText);
        }

        Assert.assertEquals(listOfTittles.size(), 60, "Elements size on page doesn't equals 60");
    }
}
