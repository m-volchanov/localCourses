package lessons.lesson19.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

    @DataProvider(name = "SetBrowser")
    public Object[][] myData() {
        return new Object[][]{{"chrome, 70.0: autodoc.de", 2345},
                {"safari, 55.0: autodoc.ko", 235235},
                {"safari, 23.0: autoteile.de", 235235235}};
    }

    @Test(dataProvider = "SetBrowser")
    public void myTest(String data, int data2) {
        String[] myData = data.split(":");
        System.out.println(data2);

        System.out.println(myData[0]);
        System.out.println(myData[1]);
    }

}
