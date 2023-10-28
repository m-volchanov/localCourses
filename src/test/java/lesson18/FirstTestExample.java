package lesson18;

import org.testng.annotations.*;

public class FirstTestExample {

    @BeforeTest
    public void beforeTest() {
        System.out.println("this method will execute before first test once");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("this method will execute before class once");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("this method will execute before test method");
    }

    @Test(description = "this our first test", priority = 1, timeOut = 5, invocationCount = 5, invocationTimeOut = 20)
    public void testMethod() {
        System.out.println("Hello world");

    }

    @Test(alwaysRun = true, dependsOnMethods = "testMethod", priority = 2, dependsOnGroups = "someGroup", enabled = false)
    public void testMethod2() {
        System.out.println("Hello world second method");
    }

    @Test(expectedExceptions = {ArithmeticException.class})
    public void testDevision() {
        System.out.println(2 / 0);
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("this method will execute after test method");
    }
}
