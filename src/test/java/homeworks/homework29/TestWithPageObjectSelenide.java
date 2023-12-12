package homeworks.homework29;

import org.testng.annotations.Test;
import pageObjectSelenide.MainPageSelenide;

import static com.codeborne.selenide.Selenide.open;

public class TestWithPageObjectSelenide {

    final String EXPECTED_TITLE = "Laptop Lenovo IdeaPad 5 Pro 14ACN6 (82L700F0PB) Storm Grey";

    @Test
    public void testWithPageObject() {
        new MainPageSelenide()
                .openMainPage()
                .handleCookies()
                .goToLaptopsAndTabletsPage()
                .goToLaptopsPage()
                .addFirstProductToCart()
                .verifyCartItemCount(1)
                .goToCartPage()
                .verifyProductInCart(EXPECTED_TITLE);
    }
}
