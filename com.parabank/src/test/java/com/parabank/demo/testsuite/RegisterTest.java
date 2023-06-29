package testsuite;

import com.parabank.demo.pages.RegisterPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import testbase.TestBase;

public class RegisterTest extends TestBase {
//    1.verifyThatSigningUpPageDisplay
//* click on the ‘Register’ link
//* Verify the text ‘Signing up is easy!’

   RegisterPage registerPage = new RegisterPage();
   // RegisterTest registerTest= new RegisterTest();

    @Test
    public void verifyThatSigningUpPageDisplay(){
        /*1.verifyThatSigningUpPageDisplay
* click on the ‘Register’ link
* Verify the text ‘Signing up is easy!’*/
        registerPage.clickOnRegisterLink();
        verifyText("Signing up is easy!", By.xpath("//div[@id='rightPanel']/h1"));
    }
    @Test
    public void userSholdRegisterAccountSuccessfully(){

        registerPage.clickOnRegisterLink();
        registerPage.EnterFirstName("Java"); //click on the ‘Register’ linkregisterPage.EnterFirstName("Java");
        registerPage.EnterLastname("Group"); //Enter First name
        registerPage.AddressStreet("Park Road");//Enter Last name
        registerPage.EnterCity("Wellingborough");//Enter Address
        registerPage.EnterState("England");//Enter City
        registerPage.EnterZipcode("NW10 4PW");
       registerPage.EnterPhonenumber("0123456789");
        registerPage.EnterSSN("BN01 010 0210");
        registerPage.EnterUsername("Java");
        registerPage.EnterPhonenumber("0123456");
        registerPage.ReEnterPassword("0123456");
        registerPage.ClickOnRegisterButton();
        verifyText("Your account was created successfully. You are now logged in.",By.cssSelector("div#rightPanel>p"));
    }
}
