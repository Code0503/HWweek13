package resources.testdata;

import org.testng.annotations.DataProvider;


public class TestData {

    @DataProvider(name="loptopdata")
    public Object[][] getData() {

        Object[][] data = new Object[][]{

                {"Laptops & Notebooks", "Show AllLaptops & Notebooks","Price (High > Low)","GBP","MacBook","2",
                        "Java","Bava","java@bava.com","01478541","1 north","Northampton","NW10 4PW","United Kingdom","Northamptonshire"},

        };
        return data;
    }



}
