package com.tutorialninja.homepage;

import com.tutorialninja.pages.HomePage;
import com.tutorialninja.testbase.TestBase;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {
    HomePage homePage = new HomePage();
    //verification message method added into below selectMenu Method in Pages "home page"
    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){
        homePage.selectMenu("Desktops","Show AllDesktops");
    }
    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully(){
        homePage.selectMenu("Laptops & Notebooks","Show AllLaptops & Notebooks");
    }
    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully(){
        homePage.selectMenu("Components","Show AllComponents");
    }
}
