package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;

public class ResultPage extends Utility {
    By resultText = By.cssSelector("div[class='govuk-!-margin-bottom-6']>h2");
    public void confirmResultMessage(String expectedMessage){
        Reporter.log("Reason for travel to UK " +expectedMessage.toString() + "<br>");
        Assert.assertTrue(getResultMessage().equalsIgnoreCase(expectedMessage));
    }
    public String getResultMessage(){
        return driver.findElement(resultText).getText();
    }

}
