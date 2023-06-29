package gov.uk.check.visa.testsuite;

import gov.uk.check.visa.pages.DurationOfStayPage;
import gov.uk.check.visa.pages.ReasonForTravel;
import gov.uk.check.visa.pages.ResultPage;
import gov.uk.check.visa.pages.StartPage;
import gov.uk.check.visa.testbase.TestBase;
import org.testng.annotations.Test;

public class VisaConfirmationTest extends TestBase {
    StartPage startPage = new StartPage();
    ReasonForTravel reasonForTravel = new ReasonForTravel();
    ResultPage resultPage = new ResultPage();
    DurationOfStayPage durationOfStayPage = new DurationOfStayPage();
//@BeforeMethod(alwaysRun = true)

    @Test(groups = "Test-1")
    public void anAustralianCominToUKForTourism(){
        startPage.clickStartNow();
        startPage.selectNationality("Australia");
        startPage.clickOnContinueButton();
        reasonForTravel.selectReasonForTravel("Tourism or visiting family and friends");
        reasonForTravel.clickNextStepButton();
        resultPage.confirmResultMessage("You will not need a visa to come to the UK");
    }
    @Test(groups = "Test-2")
    public void aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths() throws InterruptedException {
        startPage.clickStartNow();
        startPage.selectNationality("Chile");
        startPage.clickOnContinueButton();
        reasonForTravel.selectReasonForTravel("Work, academic visit or business");
        reasonForTravel.clickNextStepButton();
        //reasonForTravel.selectPlanningToStay("longer than 6 months");
        durationOfStayPage.selectLengthOfStay("longer than 6 months");
        reasonForTravel.clickNextStepButton();
        reasonForTravel.selectTypeOfJob("Health and care professional");
        reasonForTravel.clickNextStepButton();
        resultPage.confirmResultMessage("You need a visa to work in health and care");
    }
    @Test(groups = "Test-3")
    public void aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card(){
        startPage.clickStartNow();
        startPage.selectNationality("Colombia");
        startPage.clickOnContinueButton();
        reasonForTravel.selectReasonForTravel("Join partner or family for a long stay");
        reasonForTravel.clickNextStepButton();
        resultPage.confirmResultMessage("You may need a visa");
    }
}
