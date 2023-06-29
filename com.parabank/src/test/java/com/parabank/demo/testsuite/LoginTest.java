package testsuite;

import com.parabank.demo.pages.HomePage;
import com.parabank.demo.pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import testbase.TestBase;

public class LoginTest extends TestBase {
HomePage homePage = new HomePage();
LoginPage loginPage = new LoginPage();
@Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
    loginPage.loginToApplication("Java","0123456");
    loginPage.clickOnLoginButton();
    verifyText("Accounts Overview",By.cssSelector("h1[class='title']"));
}
@Test
public void userShouldLoginSuccessfullyWithInValidCredentials(){
    loginPage.loginToApplication("pav","23456");
    loginPage.clickOnLoginButton();
    verifyText("An internal error has occurred and has been logged.",By.cssSelector("div#rightPanel>p"));
}
@Test
public void userShouldLogOutSuccessfully(){
    loginPage.loginToApplication("Java","0123456");
    loginPage.clickOnLoginButton();
    loginPage.clickOnLogoutButton();
    verifyText("Customer Login",By.cssSelector("div#leftPanel>h2"));
}
}
