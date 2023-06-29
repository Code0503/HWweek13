package com.tutorialninja.pages;

import com.tutorialninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MyAccountPage extends Utility {
By MyAccount = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]");
By accountOption = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']/li/a");
By VerifyRegisterText= By.xpath("//div[@id='content']/h1");
By VerifyLoginText = By.xpath("//div[@id='content']/div/div[2]//h2");
By Email= By.id("input-email");
By PassWord= By.name("password");
By ConfirmPassword = By.name("confirm");
By subscribeRadioButton = By.xpath("//div[@class='form-group']/div/label/input");
By privacyPolicy = By.xpath("//div[@class='pull-right']/input");
By continueButton = By.xpath("//div[@class='pull-right']/input[2]");
By againContinueButton = By.xpath("//div[@class='pull-right']");
By loginButton = By.xpath("//input[@value='Login']");
By verifyLoginMessage = By.xpath("//div[@id='account-account']/div/div/h2");

    /*This method should click on the options whatever name is passed as parameter.
    (Hint: Handle List of Element and Select options)*/
public void clickOnMyAccountAndSelectOption(String AccountOption) {
    clickOnElement(MyAccount);
    List<WebElement> listOfNames = driver.findElements(accountOption);
    try {
        for (WebElement element : listOfNames) {
            if (element.getText().equalsIgnoreCase(AccountOption)) {
                element.click();
            }
        }
    } catch (StaleElementReferenceException e) {//div[@id='account-register']//form/child::*
        listOfNames = driver.findElements(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']/li/a"));
    }
}
public void verifyUserOnRegisterAccountPage(String expectedText){
    verifyText(expectedText,VerifyRegisterText);
}
    public void verifyUserOnLoginPage(String expectedLoginText){
        verifyText(expectedLoginText,VerifyLoginText);
    }
    public void enterAnEmail(String email){
    sendTextToElement(Email,email);
    }
    public void enterPassword(String password){
    sendTextToElement(PassWord,password);
    }
    public void reEnterPassword(String confirmPassword){
        sendTextToElement(ConfirmPassword,confirmPassword);
    }
    public void selectSubscribeButton(){clickOnElement(subscribeRadioButton);}
    public void selectPrivacyPolicy(){clickOnElement(privacyPolicy);}
    public void clickOnContinue(){clickOnElement(continueButton);}
    public void clickAgainOnContinue(){clickOnElement(againContinueButton);}
    public void clickOnLoginButton(){clickOnElement(loginButton);}
    public void verifyUserLandedLoginPage(String expectedLoginText){
        verifyText(expectedLoginText,verifyLoginMessage);
    }
}
