package uk.co.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    //Locators
    //By JobTitle = By.id("keywords");
//    @CacheLookup
//            @FindBy(id="keywords")
//    WebElement JobTitle;
    By JobTitle =By.id("keywords");
    By Location = By.cssSelector("div[class='home-search hps-transition'] input[name='geo']");
    By Distance = By.id("distance");
    By MoreOptions = By.id("toggle-hp-search");
    By SalaryMin = By.id("salarymin");
    By SalaryMax= By.id("salarymax");
    By SalaryType = By.cssSelector("select[id='salarytype']");
    By JobType = By.cssSelector("select#tempperm");
    By FindJobButton = By.cssSelector("input[type='submit']");

    public void EnterJobTitle(String jobTitle){
        Reporter.log("Enter Job Title in field" +jobTitle.toString());
        sendTextToElement(JobTitle,jobTitle);
    }
    public void EnterLocation(String location){
        Reporter.log("Enter Location for job" +location.toString());
        sendTextToElement(Location,location);
    }
    public void selectDistance(String distance){
        Reporter.log("Enter distance for job " +distance.toString());
        selectByContainsTextFromDropDown(Distance,distance);
    }
    public void clickOnMoreSearchOptionLink(){
        clickOnElement(MoreOptions);
    }
    public void enterMinSalary(String minSalary){
        Reporter.log("Enter minimum salary" +minSalary.toString());
        sendTextToElement(SalaryMin,minSalary);
    }
    public void enterMaxSalary(String maxSalary){
        Reporter.log("Enter max salary " +maxSalary.toString());
        sendTextToElement(SalaryMax,maxSalary);
    }
    public void selectSalaryType(String salaryType){
        Reporter.log("Selecting salary type " +salaryType.toString());
        selectByValueFromDropDown(SalaryType,salaryType);
    }
    public void selectJobType(String jobType){
        Reporter.log("Select job type" +jobType.toString());
        selectByVisibleTextFromDropDown(JobType,jobType);
    }
    public void clickOnFindJobsButton(){
        clickOnElement(FindJobButton);
    }

}
