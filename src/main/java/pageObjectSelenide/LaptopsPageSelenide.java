package pageObjectSelenide;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class LaptopsPageSelenide {

    public CartPageSelenide addFirstProductToCart() {
        SelenideElement element = $(
                byXpath("(//button[contains(@class, 'buy-button')])[1]")).should(exist);
        element.click();
        return new CartPageSelenide();
    }
}
