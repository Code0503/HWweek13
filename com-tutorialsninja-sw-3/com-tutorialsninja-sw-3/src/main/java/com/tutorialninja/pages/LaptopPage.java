package com.tutorialninja.pages;

import com.tutorialninja.utility.Utility;
import org.openqa.selenium.By;

public class LaptopPage extends Utility {
    By Qty = By.xpath("//div[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/input");
    By UpdateButton = By.xpath("//div[@class='input-group btn-block']//button");
    By TotalPrice = By.xpath("//div[@id='content']//tbody/tr/td[6]");
    By CheckOut= By.xpath("//div[@id='content']/div[3]/div[2]");
    By CheckOutText= By.xpath("//div[@id='checkout-checkout']/div/div/h1");
    By NewUserText = By.xpath("//*[@id=\"collapse-checkout-option\"]/div/div/div[1]/h2");
    By GuestButton = By.xpath("//div[@id='checkout-checkout']/div/div/div/div/div[2]/div/div/div/div[2]/label/input");
    By ContinueButton = By.id("button-account");
    By FirstName = By.name("firstname");
    By LastName = By.name("lastname");
    By Email = By.id("input-payment-email");
    By TelephoneNo = By.name("telephone");
    By Address = By.id("input-payment-address-1");
    By City = By.id("input-payment-city");
    By PostCode = By.id("input-payment-postcode");
    By Country = By.id("input-payment-country");
    By Region = By.id("input-payment-zone");
    By nextButton = By.id("button-guest");
    By tAndc = By.name("agree");
    By paymentButton = By.id("button-payment-method");
    By verifyWarningMessage = By.xpath("//div[@class='alert alert-danger alert-dismissible']");




    public void updateQty(String qty){
        driver.findElement(Qty).clear();
        sendTextToElement(Qty,qty);
    }
    public void clickOnQtyUpdate(){
        clickOnElement(UpdateButton);
    }
    public void verifyTotalPrice(String expectedTotalPrice){
        verifyText(expectedTotalPrice,TotalPrice);
    }
    public void clickOnCheckOutButton(){
        clickOnElement(CheckOut);
    }

    public void verifyUserOnCheckOutPage(String expectedText){
        verifyText(expectedText,CheckOutText);
    }
    public void verifyNewUserTextOnPage(String expectedText){
        verifyText(expectedText,NewUserText);
    }
    public void selectGuestRadioButton(){
        clickOnElement(GuestButton);
    }
    public void clickOnContinueButton(){
        clickOnElement(ContinueButton);
    }
    public void enterFirstname(String firstName){
        sendTextToElement(FirstName,firstName);
    }
    public void enterLastname(String lasttName){
        sendTextToElement(LastName,lasttName);
    }
    public void enterEmail(String email){
        sendTextToElement(Email,email);
    }
    public void enterTelephoneNumber(String telephoneNo){
        sendTextToElement(TelephoneNo,telephoneNo);
    }
    public void enterAddress(String address){
        sendTextToElement(Address,address);
    }
    public void enterCityname(String city){
        sendTextToElement(City,city);
    }
    public void enterPostCode(String postcode){
        sendTextToElement(PostCode,postcode);
    }
    public void enterCountry(String countryName){
        selectByContainsTextFromDropDown(Country,countryName);
    }
    public void enterRegion(String State){
        selectByContainsTextFromDropDown(Region,State);
    }
    public void clickOnGuestButton(){
        clickOnElement(nextButton);
    }
    public void clickOnAgreeTermsAndConditions(){
        clickOnElement(tAndc);
    }
    public void clickOnPaymentButton(){
        clickOnElement(paymentButton);
    }
    public void veryfiyPaymentMessage(String expectedMessage){
        verifyText(expectedMessage,verifyWarningMessage);
    }

}
