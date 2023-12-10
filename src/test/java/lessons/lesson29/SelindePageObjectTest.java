package lessons.lesson29;

import org.testng.annotations.Test;
import pageObjectSelenide.init.InitialSelenide;
import pattern.pageObject.selenide.MainPageLogic;

public class SelindePageObjectTest extends InitialSelenide {

    @Test
    public void testSelenidePO() {
        new MainPageLogic().checkCategoriesQuantity(16).clickOnCategory(0)
                .clickOnSubCategoryLaptops()
                .checkQuantityOfGoodsTittles(60);
    }
}
