package resources.testdata;

import org.testng.annotations.DataProvider;

/**
 * Created by Bhavesh
 */
public class TestData {

    @DataProvider(name="logindata")
    public Object[][] getData() {

        Object[][] data = new Object[][]{

                {"test1@gmail.com", "test123"},
                {"test2@gmail.com", "test123"},
                {"test3@gmail.com", "test123"}
        };
        return data;
    }

}
