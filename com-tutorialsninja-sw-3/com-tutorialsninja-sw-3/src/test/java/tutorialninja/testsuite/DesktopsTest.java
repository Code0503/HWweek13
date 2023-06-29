package com.tutorialninja.testsuite;

import com.tutorialninja.pages.HomePage;
import com.tutorialninja.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DesktopsTest extends TestBase {
    HomePage homePage =new HomePage();
    @Test
    public void verifyProductArrangeInAlphaBaticalOrder(){
        homePage.selectMenu("Desktops","Show AllDesktops");
        homePage.selectSortBy("Name (Z - A)");
    }
    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        homePage.selectCurrency("GBP");
        homePage.selectMenu("Desktops","Show AllDesktops");
        homePage.selectSortBy("Name (A - Z)");
        homePage.selctPoduct("HP LP3065");
        homePage.verifyProuctSelectedByText("HP LP3065");
       homePage.selectDeliveryDate("2023","July","15");
        homePage.updateQty("1");
        homePage.addProductToCart();
        verifyText("Success: You have added HP LP3065 to your shopping cart!\n" + "×",By.xpath("//div[@class='alert alert-success alert-dismissible']"));
        homePage.clickOnShoppigCart();
        homePage.verifyProduct("HP LP3065");
        homePage.verifyDeliveryDate("Delivery Date:2023-07-15");
        homePage.verifyModel("Product 21");
        homePage.verifyUnitPrice("£74.73");
    }
}
