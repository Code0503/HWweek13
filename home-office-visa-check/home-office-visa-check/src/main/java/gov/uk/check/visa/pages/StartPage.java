package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class StartPage extends Utility {
    //Locators
   By startNowButton = By.cssSelector("a[role='button']");
   By SelectNationality = By.id("response");
   By ContinueButton = By.cssSelector("button[class='gem-c-button govuk-button gem-c-button--bottom-margin']");




   public void clickStartNow(){
       clickOnElement(startNowButton);
   }
   public void selectNationality(String nationality){
        Reporter.log("select country " +nationality.toString() + "<br>");
        selectByVisibleTextFromDropDown(SelectNationality,nationality);
    }
    public void clickOnContinueButton(){
       clickOnElement(ContinueButton);
    }

}
