package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestDataForRegisterMyAccount {
    @DataProvider(name="RegisterData")
    public Object[][] getData() {

        Object[][] data = new Object[][]{

                {"Register","Java","Buster","Dust@Bust.com","07454814115","J123456","J123456" },

        };
        return data;
    }
}
