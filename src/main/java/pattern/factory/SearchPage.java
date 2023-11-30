package pattern.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pattern.pageObject.selenium.ProductPage;

import java.util.List;

public class SearchPage {

    @FindBy(xpath = "(//span[@class='goods-tile__title'])[1]")
    private List<WebElement> firstProductTittle;

    private WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public ProductPage clickOnProductTittleIndex(int tittleIndex) {
        List<WebElement> tittles = firstProductTittle;
        tittles.get(tittleIndex).click();
        return new ProductPage(driver);
    }
}
