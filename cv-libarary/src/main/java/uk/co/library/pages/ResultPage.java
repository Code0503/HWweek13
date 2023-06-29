package uk.co.library.pages;

import org.openqa.selenium.By;
import uk.co.library.utility.Utility;

public class ResultPage extends Utility {
    By resultText = By.cssSelector("h1[class='search-header__title']");
    public void verifyTheResults(String expected){
        verifyText(expected,resultText);
    }
}
