package uk.co.library.testsuite;

import org.testng.annotations.Test;
import resources.testdata.TestData;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;
import uk.co.library.testbase.TestBase;

public class JobSearchTest extends TestBase {
    //Data is not hardcoded in this class, as data values are coming from TEST DATA package from TestData class
    HomePage homePage = new HomePage();
    ResultPage resultPage = new ResultPage();

    //Data is not hardcoded in this class, as data values are coming from "TEST DATA" package from "TestData class"
    /*class will run 3 or 4 times depend,
    How many times data has been passed in "TEST DATA CLASS"
    in this class I've passed 3 different data in "TestData class,
    So class will run 3 times One by One itself*/
    @Test(dataProvider = "logindata",dataProviderClass = TestData.class)
// look in to maven test data , how to add methods
    public void verifyJobSearchResultUsingDifferentDataSet(String jobTitle,String location,String distance,String minSalary,String maxSalary,String salaryType,String jobType, String result){
       homePage.EnterJobTitle(jobTitle);
       homePage.EnterLocation(location);
       homePage.selectDistance(distance);
       homePage.clickOnMoreSearchOptionLink();
       homePage.enterMinSalary(minSalary);
       homePage.enterMaxSalary(maxSalary);
       homePage.selectSalaryType(salaryType);
       homePage.selectJobType(jobType);
       homePage.clickOnFindJobsButton();
       resultPage.verifyTheResults(result);
    }

}
