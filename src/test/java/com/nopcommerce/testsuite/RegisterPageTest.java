package com.nopcommerce.testsuite;

import com.nopcommerce.pages.Homepage;
import com.nopcommerce.pages.LoginPage;
import com.nopcommerce.pages.RegisterPage;
import com.nopcommerce.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterPageTest extends TestBase {
    Homepage homepage = new Homepage();

    RegisterPage registerPage = new RegisterPage();

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        homepage.clickOnRegisterLink();
        String actualMessage = registerPage.getRegisterText();
        String expectedMessage = "Register";
        Assert.assertEquals(actualMessage, expectedMessage, "Register text verified");
    }

    @Test
    public void verifyThatFirstNameLastEmailPasswordAndConfirmPasswordFieldAreMandtory() {
        homepage.clickOnRegisterLink();
        registerPage.clickOnRgisterButton();
        String firstname= registerPage.verifyFirstnamerequiedfield();
        String firstname1 ="First name is required.";
        Assert.assertEquals(firstname,firstname1,"First name is verified");

        String Lastname= registerPage.verifyLastnamerequiedfield();
        String Lastname1 ="Last name is required.";
        Assert.assertEquals(Lastname,Lastname1,"Last name is verified");

        String emailfield= registerPage.verifyemailrequiedfield();
        String emailfield1 ="Email is required.";
        Assert.assertEquals(emailfield,emailfield1,"email field is verified");

        String passwordfield= registerPage.verifypasswordrequiedfield();
        String passwordfield1 ="Password is required.";
        Assert.assertEquals(passwordfield,passwordfield1,"password field is verified");

        String confirmpasswordfield= registerPage.verifyconfirmpasswordrequiedfield();
        String confirmpasswordfield1 ="Password is required.";
        Assert.assertEquals(confirmpasswordfield,confirmpasswordfield1,"confirmpassword field is verified");

        }
        @Test
        public void verifyThatUserShouldCreateAccountSuccessfully() {
            homepage.clickOnRegisterLink();
            registerPage.clickOnfemaleRadioButton();
            registerPage.clickOnmaleRadioButton();

            registerPage.enterFirstName("Boy");
            registerPage.enterLastName("pa");

            registerPage.enterBirthDay("25");
           // registerPage.enterBirthMonth("10");
            registerPage.enterBirthYear("1950");

            registerPage.entremailfield("Boy@gmail.com");
            registerPage.entrepasswordfield("47474");
            registerPage.entreConfirmpasswordfield("47474");
            registerPage.clickOnRgisterButton();

            String registration= registerPage.verifyYourRegistrationcompletedText();
            String registration1 ="Your registration completed";
            Assert.assertEquals(registration,registration1,"Your registration completed");





        }


}




