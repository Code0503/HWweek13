package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.By;

public class DurationOfStayPage extends Utility {
    By lessThanSixMonth=By.xpath("(//div[@class='govuk-radios']/div/label)[1]");
    By morethan6months = By.xpath("//div[@class='govuk-radios']/div[2]/label");
    public String getTextFromAlert() {
        return driver.switchTo().alert().getText();
    }

    public void selectLengthOfStay(String moreOrLess){

        switch (moreOrLess){
            case "longer than 6 months":
                driver.findElement(morethan6months).click();

                break;

            case "6 months or less":
                driver.findElement(lessThanSixMonth).click();
                break;
            default:
                System.out.println("not found");
        }
    }


}
