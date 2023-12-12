package pageObjectSelenide;

import com.codeborne.selenide.SelenideElement;
import pageObject.LaptopsAndTabletsPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPageSelenide {

    public MainPageSelenide openMainPage() {
        open("https://rozetka.pl/");
        return this;
    }

    public MainPageSelenide handleCookies() {
        SelenideElement cookiesNotification = $(
                byXpath("//button[@class='button button_size_large button_color_green']"));
        if (cookiesNotification.is(visible)) {
            cookiesNotification.click();
        }
        return this;
    }

    public LaptopsAndTabletsPageSelenide goToLaptopsAndTabletsPage() {
        $(byXpath("(//a[@class='menu-categories__link'])[1]")).click();
        return new LaptopsAndTabletsPageSelenide();
    }

}
