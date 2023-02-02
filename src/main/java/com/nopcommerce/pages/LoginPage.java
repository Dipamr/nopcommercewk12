package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPage extends Utility {

    By emailfield = By.id("Email");
    By passwordfield = By.id("Password");
    By LoginButton = By.xpath("//button[contains(text(),'Log in')]");
    By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By errorMag = By.xpath("//div[@class='message-error validation-summary-errors']");

    public void enterEmailId(String email){
        sendTextToElement(emailfield,email);
    }
    public  void enterPassword(String Password){
        sendTextToElement(passwordfield,Password);
    }
    public void clickOnLoginButton(){
        clickOnElement(LoginButton);
    }
    public String getWelcomeText(){
        return getTextFromElement(welcomeText);
    }
    public String getErrorMessage()
    {
        return getTextFromElement(errorMag);
    }



}
