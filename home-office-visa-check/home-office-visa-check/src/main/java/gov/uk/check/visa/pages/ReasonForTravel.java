package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import java.util.List;

public class ReasonForTravel extends Utility {
    By reasonForVisitList = By.xpath("//div[@class='govuk-radios']/div");
    By typeOfJob = By.xpath("//fieldset[@class='govuk-fieldset']/div[@class='govuk-radios']/div/label");
    By ContinueButton = By.cssSelector("button[class='gem-c-button govuk-button gem-c-button--bottom-margin']");
    By planningToStay = By.id("response-1");

    public void selectReasonForTravel(String reason) {
        //  1.2 This method should click on the options whatever name is passed as parameter. (Hint: Handle List of Element and Select options)
        List<WebElement> listofnames = driver.findElements(reasonForVisitList);
        Reporter.log("Reason for travel to UK " +reason.toString() + "<br>");
        for (WebElement element : listofnames) {
            if (element.getText().equalsIgnoreCase(reason)) {
                element.click();//use of for loop
            }
        }
    }

    public void selectTypeOfJob(String JobType) {
        //  1.2 This method should click on the options whatever name is passed as parameter. (Hint: Handle List of Element and Select options)
        List<WebElement> listofreasons = driver.findElements(typeOfJob);
        Reporter.log("Type of work in UK " +JobType.toString() + "<br>");
        for (WebElement element : listofreasons) {
            if (element.getText().equalsIgnoreCase(JobType)) {
                element.click();//use of for loop
            }
        }
    }


        public void clickNextStepButton () {
            clickOnElement(ContinueButton);
        }
        public void selectPlanningToStay (String Plan){
            Reporter.log("How long your plan to stay" + Plan.toString());
            clickOnElement(planningToStay);
        }
    }
