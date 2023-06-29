package resources.testdata;

import org.testng.annotations.DataProvider;

/**
 * Created by Bhavesh
 */
public class TestData {

    @DataProvider(name="logindata")
    public Object[][] getData() {

        Object[][] data = new Object[][]{

                {"Tester","Northamptonshire"
                ,"10 miles","30000",
                        "100000","Per annum","Permanent",
                "Permanent Tester jobs in Northamptonshire"},
                {"QA","Northamptonshire"
                        ,"5 miles","20000",
                        "400000","Per annum","Permanent",
                        "Permanent Qa jobs in Northamptonshire"
                },{"Test Engineer", "Milton Keynes"
                ,"10 miles","30000",
                "100000","Per annum","Permanent",
                "Permanent Test Engineer jobs in Milton Keynes"}
        };
        return data;
    }
}
