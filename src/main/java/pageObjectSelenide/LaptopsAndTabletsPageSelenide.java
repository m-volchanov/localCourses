package pageObjectSelenide;

import pageObject.LaptopsPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class LaptopsAndTabletsPageSelenide {

    public LaptopsPageSelenide goToLaptopsPage() {
        $(byXpath("(//a[@class='portal-navigation__link'])[1]")).shouldBe(visible).click();
        return new LaptopsPageSelenide();
    }
}
