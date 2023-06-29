package uk.co.library.testsuite;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;
import uk.co.library.testbase.TestBase;

public class JobSearchTest3 extends TestBase {
    /* In this class data values are passed in "JobSearchParameters XML file" in "runners" package
    and where data values are hardcoded, but we can change data values from there, and then it will pass in this class automatically */
    HomePage homePage = new HomePage();
    ResultPage resultPage = new ResultPage();
    @Test @Parameters({ "jobTitle","location","distance","minSalary","maxSalary","salaryType","jobType"})
    public void verifyJobSearchResultUsingDifferentDataSet(String jobTitle,String location,String distance,String minSalary,String maxSalary,String salaryType,String jobType){
        homePage.EnterJobTitle(jobTitle);
        homePage.EnterLocation(location);
        homePage.selectDistance(distance);
        homePage.clickOnMoreSearchOptionLink();
        homePage.enterMinSalary(minSalary);
        homePage.enterMaxSalary(maxSalary);
        homePage.selectSalaryType(salaryType);
        homePage.selectJobType(jobType);
        homePage.clickOnFindJobsButton();
        resultPage.verifyTheResults("Permanent Qa jobs in Northamptonshire");
    }
}
