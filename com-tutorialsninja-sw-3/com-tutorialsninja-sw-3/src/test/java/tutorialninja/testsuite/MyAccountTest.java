package com.tutorialninja.testsuite;

import com.tutorialninja.pages.HomePage;
import com.tutorialninja.pages.LaptopPage;
import com.tutorialninja.pages.MyAccountPage;
import com.tutorialninja.testbase.TestBase;
import org.testng.annotations.Test;
import resources.testdata.TestDataForRegisterMyAccount;

public class MyAccountTest extends TestBase {
    HomePage homePage = new HomePage();
    LaptopPage laptopPage = new LaptopPage();
    MyAccountPage myAccountPage = new MyAccountPage();
    @Test(dataProvider = "RegisterData",dataProviderClass = TestDataForRegisterMyAccount.class)
    public void verifyUserShouldNavigateToRegisterPageAndRegisteredSuccessfully(String AccountOption,String firstName,String lastName, String email,String telephoneNo,String password, String confirmPassword) {
        myAccountPage.clickOnMyAccountAndSelectOption(AccountOption);
        myAccountPage.verifyUserOnRegisterAccountPage( "Register Account");
        laptopPage.enterFirstname(firstName);
        laptopPage.enterLastname(lastName);
        myAccountPage.enterAnEmail(email);
        laptopPage.enterTelephoneNumber(telephoneNo);
        myAccountPage.enterPassword(password);
        myAccountPage.reEnterPassword(confirmPassword);
        myAccountPage.selectSubscribeButton();
        myAccountPage.selectPrivacyPolicy();
        myAccountPage.clickOnContinue();
        myAccountPage.verifyUserOnRegisterAccountPage("Your Account Has Been Created!");
        myAccountPage.clickOnMyAccountAndSelectOption("Logout");
        myAccountPage.verifyUserOnRegisterAccountPage("Account Logout");
        myAccountPage.clickAgainOnContinue();

    }
    @Test(groups = "Test-2")
    public void verifyUserShouldLoginPageandLogOutSuccessfully(){

        myAccountPage.clickOnMyAccountAndSelectOption("Login");
        myAccountPage.verifyUserOnLoginPage("Returning Customer");
        myAccountPage.enterAnEmail("just@Bust.com");
        myAccountPage.enterPassword("J123456");
        myAccountPage.clickOnLoginButton();
        myAccountPage.verifyUserLandedLoginPage("My Account");
        myAccountPage.clickOnMyAccountAndSelectOption("Logout");
        myAccountPage.clickAgainOnContinue();
    }
}
