package homeworks.homework27;

import org.testng.annotations.Test;
import pageObject.MainPage;
import pageObject.init.WebDriverInit;

public class TestWithPageObject extends WebDriverInit {

    final String EXPECTED_TITTLE = "Laptop Lenovo IdeaPad 5 Pro 14ACN6 (82L700F0PB) Storm Grey";

    @Test
    public void testWithPageObject() {
        new MainPage(driver)
                .openMainPage()
                .handleCookies()
                .goToLaptopsAndTabletsPage()
                .goToLaptopsPage()
                .addFirstProductToCart()
                .verifyCartItemCount(1)
                .goToCartPage(1)
                .verifyProductInCart(EXPECTED_TITTLE);
    }
}
