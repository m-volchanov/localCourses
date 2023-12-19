package lessons.lesson32;

import io.qameta.allure.*;
import lessons.lesson12.finalExample.SomeClass;
import org.testng.annotations.Test;
import pattern.pageObject.selenide.MainPageLogic;

public class TestForMvnSureFire {

    @Test
    @Owner("Alex")
    @Description("Test check something")
    @Severity(SeverityLevel.NORMAL)
    public void testSurFirePlugin() {
        System.out.println("Message for test");
        SomeClassForAllureStep someClassForAllureStep = new SomeClassForAllureStep();
        someClassForAllureStep.open("Google");
        someClassForAllureStep.someMethod("Alex");
    }
}
