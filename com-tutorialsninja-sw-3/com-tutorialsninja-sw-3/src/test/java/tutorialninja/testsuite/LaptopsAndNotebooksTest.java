package com.tutorialninja.testsuite;

import com.tutorialninja.pages.HomePage;
import com.tutorialninja.pages.LaptopPage;
import com.tutorialninja.testbase.TestBase;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class LaptopsAndNotebooksTest extends TestBase {
    HomePage homePage = new HomePage();
    LaptopPage laptopPage = new LaptopPage();
    @Test
public void verifyProductsPriceDisplayHighToLowSuccessfully(){
    homePage.selectMenu("Laptops & Notebooks","Show AllLaptops & Notebooks");
    homePage.selectSortBy("Price (High > Low)");
}
@Test(dataProvider = "loptopdata",dataProviderClass = TestData.class)
    public void verifyThatUserPlaceOrderSuccessfully(String menu, String menuItem,String shrotBy,String Currency,String product,String qty,String firstName,String lasttName,String email,String telephoneNo,String address,String city,String postcode,String countryName,String State) throws InterruptedException {
    homePage.selectMenu(menu,menuItem);
    homePage.selectSortBy(shrotBy);
    homePage.selectCurrency(Currency);
    homePage.selctPoduct(product);
    homePage.verifyProuctSelectedByText("MacBook");
    homePage.addProductToCart();
    homePage.verifyProductScuessfullyAdded("Success: You have added MacBook to your shopping cart!\n" + "×");
    homePage.clickOnShoppigCart();
    homePage.verifyProduct("MacBook");
    laptopPage.updateQty(qty);
    laptopPage.clickOnQtyUpdate();
    homePage.verifyProductScuessfullyAdded("Success: You have modified your shopping cart!\n" + "×");
    laptopPage.verifyTotalPrice("£737.45");
    laptopPage.clickOnCheckOutButton();
    laptopPage.verifyUserOnCheckOutPage("Checkout");
    Thread.sleep(2000);
    laptopPage.verifyNewUserTextOnPage("New Customer");
    laptopPage.selectGuestRadioButton();
    laptopPage.clickOnContinueButton();
    laptopPage.enterFirstname(firstName);
    laptopPage.enterLastname(lasttName);
    laptopPage.enterEmail(email);
    laptopPage.enterTelephoneNumber(telephoneNo);
    laptopPage.enterAddress(address);
    laptopPage.enterCityname(city);
    laptopPage.enterPostCode(postcode);
    laptopPage.enterCountry(countryName);
    laptopPage.enterRegion(State);
    laptopPage.clickOnGuestButton();
    laptopPage.clickOnAgreeTermsAndConditions();
    laptopPage.clickOnPaymentButton();
    laptopPage.veryfiyPaymentMessage("Warning: Payment method required!\n" + "×");

}
    @Test
    public void verifyThatUserPlaceOrderSuccessfully1() throws InterruptedException {
        homePage.selectMenu("Laptops & Notebooks","Show AllLaptops & Notebooks");
        homePage.selectSortBy("Price (High > Low)");
        homePage.selectCurrency("GBP");
        homePage.selctPoduct("MacBook");
        homePage.verifyProuctSelectedByText("MacBook");
        homePage.addProductToCart();
        homePage.verifyProductScuessfullyAdded("Success: You have added MacBook to your shopping cart!\n" + "×");
        homePage.clickOnShoppigCart();
        homePage.verifyProduct("MacBook");
        laptopPage.updateQty("2");
        laptopPage.clickOnQtyUpdate();
        homePage.verifyProductScuessfullyAdded("Success: You have modified your shopping cart!\n" + "×");
        laptopPage.verifyTotalPrice("£737.45");
        laptopPage.clickOnCheckOutButton();
        laptopPage.verifyUserOnCheckOutPage("Checkout");
        Thread.sleep(2000);
        laptopPage.verifyNewUserTextOnPage("New Customer");
        laptopPage.selectGuestRadioButton();
        laptopPage.clickOnContinueButton();
        laptopPage.enterFirstname("Java");
        laptopPage.enterLastname("Bava");
        laptopPage.enterEmail("java@bava.com");
        laptopPage.enterTelephoneNumber("01478541");
        laptopPage.enterAddress("1 north");
        laptopPage.enterCityname("Northampton");
        laptopPage.enterPostCode("NW10 4PW");
        laptopPage.enterCountry("United Kingdom");
        laptopPage.enterRegion("Northamptonshire");
        laptopPage.clickOnGuestButton();
        laptopPage.clickOnAgreeTermsAndConditions();
        laptopPage.clickOnPaymentButton();
        laptopPage.veryfiyPaymentMessage("Warning: Payment method required!\n" + "×");

    }
}
