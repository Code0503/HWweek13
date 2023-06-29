package com.tutorialninja.pages;

import com.tutorialninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utility {
//    By MenuBar = By.xpath("//ul[@class='nav navbar-nav']/li");
//    By TabName = By.xpath("//ul[@class='nav navbar-nav']/li/div/a");
//
//
//    public void selectMenu(String menu){
//      driver.findElement(MenuBar).getText().equalsIgnoreCase(menu);
//
//       driver.findElement(TabName).equals(menu);
//    }
By MenuBar = By.xpath("//ul[@class='nav navbar-nav']/li");
    By TabName = By.xpath("//div[@class='dropdown-menu']/a");
    By ProductSelected= By.cssSelector("div#content>h2");
    By currency= By.cssSelector("form#form-currency>div>button>span");
    By currencyName = By.name("GBP");
    By SortBy = By.id("input-sort");
    By ZtoA = By.xpath("(//select[@id='input-sort']/option)[3]");
    By productName = By.xpath("//div[@class='caption']/h4/a");

    By selectDeliveryDate = By.xpath("//div[@class='input-group date']/span/button");
    By monthAndYear= By.xpath("//div[3]/div/div[1]/table/thead/tr[1]/th[2]");
    //By Date= By.xpath("/html/body/div[3]/div/div[1]/table/tbody/tr[4]/td[3]");
    By Date = By.xpath("/html/body/div[3]/div/div[1]/table/tbody/tr/td");
    By Qty = By.xpath("//div[@id='product']/div[2]/input");

    By addToCart= By.id("button-cart");
    By ShoppingCart = By.linkText("Shopping Cart");





    public void selectMenu(String menu, String menuItem)  {
        getElementsListandClick(MenuBar, menu);
        selectMenuContain(menuItem);
        verifyText(menu,ProductSelected);
    }
    public void selectMenuContain(String menuItem) {
        List<WebElement> topMenuList = driver.findElements(TabName);
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menuItem)) {
                    element.click();
                }
            }}
        catch (StaleElementReferenceException e) {
            topMenuList = driver.findElements(TabName);
}

}
public void selectSortBy(String shrotBy){
        selectByValueFromDropDown(SortBy,shrotBy);
       // verifyText("Model(Z-A)",ZtoA);
}
public void selctPoduct(String product){
    List<WebElement> topMenuList = driver.findElements(productName);
    try {
        for (WebElement element : topMenuList) {
            if (element.getText().equalsIgnoreCase(product)) {
                element.click();
            }
        }}
    catch (StaleElementReferenceException e) {
        topMenuList = driver.findElements(productName);
    }
}
public void verifyProuctSelectedByText(String productSelected){
        verifyText(productSelected,By.xpath("//div[@id='content']/div/div[2]/h1"));
}
public void verifyProductScuessfullyAdded(String expectedMessage){
        verifyText(expectedMessage,By.xpath("//div[@class='alert alert-success alert-dismissible']"));
}
public void selectDeliveryDate(String year, String month, String date) throws InterruptedException {
    //date picker

        driver.findElement(selectDeliveryDate).click();
     //Below selecting Month and Year from list
        while (true) {
            String monthyear = driver.findElement(monthAndYear).getText();
            String arr[] = monthyear.split(" ");
            String mon = arr[0];
            String year1 = arr[1];

            if (mon.equalsIgnoreCase(month) && year1.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnElement(By.xpath("//div[3]/div/div[1]/table/thead/tr[1]/th[3]"));
            }
        }
        Thread.sleep(2000);
     //Below is selecting date from list
    //below Stale exception  handling method as during runtime website generates problem
    List<WebElement> topMenuList = driver.findElements(Date);
    try {
        for (WebElement element : topMenuList) {
            if (element.getText().equalsIgnoreCase(date)) {
                element.click();
            }
        }}
    catch (StaleElementReferenceException e) {
        topMenuList = driver.findElements(Date);
    }
}

public void updateQty(String qty){
        driver.findElement(Qty).clear();
        sendTextToElement(Qty,qty);
}


public void addProductToCart(){
        clickOnElement(addToCart);
}
public void selectCurrency(String Currency){
        clickOnElement(currency);
        clickOnElement(currencyName);
}
public void clickOnShoppigCart(){
        clickOnElement(ShoppingCart);
        verifyText("Shopping Cart",By.linkText("Shopping Cart"));
}

    public void verifyProduct(String productName){
        verifyText(productName,By.xpath("//div[@id='checkout-cart']/div//form//td[2]/a"));
    }
    //Verify delivery date
    public void verifyDeliveryDate(String deliveryDate){
        verifyText(deliveryDate,By.xpath("//div[@id='checkout-cart']/div//form//td[2]/small"));
    }
    //Verify Model of the product from grid
    public void verifyModel(String model){
        verifyText(model,By.xpath("//div[@id='checkout-cart']/div//form//tbody//td[3]"));
    }
    //Verify Unit Price of the product from grid
    public void verifyUnitPrice(String unitPrice){
        verifyText(unitPrice,By.xpath("//div[@id='checkout-cart']/div//form//tbody//td[5]"));
    }
}
