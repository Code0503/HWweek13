package com.tutorialninja.testsuite;

import com.tutorialninja.pages.HomePage;
import com.tutorialninja.testbase.TestBase;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {
    HomePage homePage = new HomePage();
    //verification message method added into below selectMenu Method in Pages "home page"
    //parameters are taking from PARAMETER XML FILE
    @Test @Parameters({"menuName","menuItemName"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully(String menuName,String menuItemName){
        homePage.selectMenu(menuName,menuItemName);
    }

    @Test@Parameters({"menu2","menuItem2"})
    public void verifyUserShouldNavigateToComponentsPageSuccessfully(String menu2,String menuItem2){
        homePage.selectMenu(menu2,menuItem2);
    }
    //Due to variables names contain "&", So it doesn't work in parameter xml file

    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully(){
        homePage.selectMenu("Laptops & Notebooks","Show AllLaptops & Notebooks");
    }
}
