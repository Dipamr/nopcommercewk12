package com.nopcommerce.testsuite;

import com.nopcommerce.pages.LoginPage;
import com.nopcommerce.pages.Homepage;

import com.nopcommerce.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    Homepage homepage = new Homepage();
    LoginPage loginPage = new LoginPage();


    @Test
    public void userShouldNavigateToLoginPageSuccessFully() {
        homepage.clickOnLoginLink();
        String actualMessage = loginPage.getWelcomeText();
        String expedctedMessage = "Welcome, Please Sign In!";
        Assert.assertEquals(actualMessage, expedctedMessage, "Login page verified");


    }

    @Test
    public void verifyTheErrorMessageWithInValidCredentials() {
        homepage.clickOnLoginLink();
        loginPage.enterEmailId("Boy@gmail.com");
        loginPage.enterPassword("47474");
        loginPage.clickOnLoginButton();
        String actual = loginPage.getErrorMessage();
        String expected = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        Assert.assertEquals(actual, expected, "error message with invalid credentials");
    }

    @Test
    public void verifyThatUserShouldLoginSuccessFullyWithValidCredentials() {
        homepage.clickOnLoginLink();
        loginPage.enterEmailId("song@gmail.com");
        loginPage.enterPassword("141414");
        loginPage.clickOnLoginButton();
        String actualText = getTextFromElement(By.className("ico-logout"));
        String expectedText = "Log out";
        Assert.assertEquals(expectedText, actualText);

    }

    @Test
    public void VerifyThatUserShouldLogOutSuccessFully() {
        homepage.clickOnLoginLink();
        loginPage.enterEmailId("song@gmail.com");
        loginPage.enterPassword("141414");
        loginPage.clickOnLoginButton();
        String actualText = homepage.verifyLoginLink();
        String expectedText = "Log in";
        Assert.assertEquals(expectedText, actualText, "Log in Link verified");


    }


}



