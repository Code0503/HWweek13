package uk.co.library.testsuite;

import org.testng.annotations.Test;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;
import uk.co.library.testbase.TestBase;

public class JobSearchTest2 extends TestBase {
    HomePage homePage = new HomePage();
    ResultPage resultPage = new ResultPage();

    //hardcoded data test
    @Test
    public void verifyJobSearchResultUsingDifferentDataSet2() {
        homePage.EnterJobTitle("Inventory Admin");
        homePage.EnterLocation("Northamptonshire");
        homePage.selectDistance("5 miles");
        homePage.clickOnMoreSearchOptionLink();
        homePage.enterMinSalary("20,000");
        homePage.enterMaxSalary("40,000");
        homePage.selectSalaryType("Per annum");
        homePage.selectJobType("Permanent");
        homePage.clickOnFindJobsButton();
        resultPage.verifyTheResults("Permanent Inventory Admin jobs in Northamptonshire");
    }
}
