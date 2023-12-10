package pageObjectSelenide;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class CartPageSelenide {

    public CartPageSelenide verifyCartItemCount(int expectedItemCount) {
        SelenideElement cartBadge = $(
                byXpath("//rz-icon-badge/span[@class='badge badge--green ng-star-inserted']"));
        cartBadge.shouldHave(text(String.valueOf(expectedItemCount)));
        return this;
    }

    public CartPageSelenide goToCartPage() {
        $(byXpath("//button[@rzopencart and contains(@class, 'header__button--active')]")).click();
        return this;
    }

    public CartPageSelenide verifyProductInCart(String expectedProductName) {
        SelenideElement productElement = $(byXpath("//a[@data-testid='title']"));
        productElement.shouldHave(text(expectedProductName));
        return this;
    }
}
