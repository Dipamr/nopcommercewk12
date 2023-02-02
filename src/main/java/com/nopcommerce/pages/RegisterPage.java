package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By RegisterText = By.xpath("//div[@class='page-title']/h1");
    By femaleRadio = By.xpath("//input[@id='gender-female']");
    By maleRadio = By.xpath("//input[@id='gender-male']");
    By Firstname = By.xpath("//input[@id='FirstName']");
    By Lastname = By.xpath("//input[@id='LastName']");

    //By DateofBirth = By.xpath("//div[@class='inputs date-of-birth']");

    By DayofBirth = By.xpath("//div[@class='inputs date-of-birth']/div/select[1]");
    By MonthofBirth = By.xpath("///div[@class='inputs date-of-birth']/div/select[2]");
    By YearofBirth = By.xpath("//div[@class='inputs date-of-birth']/div/select[3]");

    By emailfield = By.xpath("//input[@id='Email']");

    By passwordfield = By.xpath("//input[@id='Password']");
    By Confirmpasswordfield = By.xpath("//input[@id='ConfirmPassword']");
    By RegisterButton = By.xpath("//button[@id='register-button']");
    By emailrequiedfield = By.xpath("//span[@class='field-validation-error']/span[@id='FirstName-error']");
    By firstnamerequiedfield = By.xpath("//span[@class='field-validation-error']/span[@id='FirstName-error']");
    By Lastnamerequiedfield = By.xpath("//span[@class='field-validation-error']/span[@id='FirstName-error']");
    By passwordrequiedfield = By.xpath("//span[@class='field-validation-error']/span[@id='FirstName-error']");

    By conformpasswordequiedfield = By.xpath("//span[@id='ConfirmPassword-error']");
    By errorMsgText = By.xpath("//div[@class='message-error validation-summary-errors']");
    By YourRegistrationcompletedText = By.xpath("//div[@class='result']");
    By ContinuebuttonLink = By.xpath("//a[@class='button-1 register-continue-button']");

    public String getRegisterText() {
        return getTextFromElement(RegisterText);
    }

    public void clickOnfemaleRadioButton() {
        clickOnElement(femaleRadio);
    }

    public void clickOnmaleRadioButton() {
        clickOnElement(maleRadio);
    }

    public void enterFirstName(String fname) {
        sendTextToElement(Firstname, fname);

    }

    public void enterLastName(String lname) {
        sendTextToElement(Lastname, lname);
    }

    public void enterBirthDay(String birthday) {
        selectByValueFromDropDown(DayofBirth, birthday);
    }

   // public void enterBirthMonth(String birthMonth) {
     //   selectByValueFromDropDown(MonthofBirth, birthMonth);
   // }

    public void enterBirthYear(String birthYear) {
        selectByValueFromDropDown(YearofBirth, birthYear);
    }

    public void entremailfield(String email) {
        sendTextToElement(emailfield, email);
    }

    public void entrepasswordfield(String password) {
        sendTextToElement(passwordfield, password);
    }

    public void entreConfirmpasswordfield(String confirmpassword) {
        sendTextToElement(Confirmpasswordfield, confirmpassword);

    }

    public void clickOnRgisterButton() {
        clickOnElement(RegisterButton);
    }



    public String verifyFirstnamerequiedfield() {
       return getTextFromElement(firstnamerequiedfield);


    }

    public String verifyLastnamerequiedfield() {
       return getTextFromElement(Lastnamerequiedfield);
    }
    public String verifyemailrequiedfield() {
       return getTextFromElement(emailrequiedfield);
    }


    public String verifypasswordrequiedfield() {
        return getTextFromElement(passwordfield);
    }

    public String verifyconfirmpasswordrequiedfield() {
        return getTextFromElement(conformpasswordequiedfield);
    }

    public String errorMsgText() {
        return getTextFromElement(errorMsgText);
    }

    public String verifyYourRegistrationcompletedText() {
        return getTextFromElement(YourRegistrationcompletedText);
    }

    public void clickOnContinuebuttonLink() {
        clickOnElement(ContinuebuttonLink);
    }
}

