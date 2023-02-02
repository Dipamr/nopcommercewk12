package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class Homepage extends Utility {
    By ComputerLink = By.xpath("//ul[@class='top-menu notmobile']/li[1]");
    By ElectronicsLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Electronics')]");
    By ApparelLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Apparel')]");
    By DigitaldownloadsLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Digital downloads')]");
    By BooksLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Books')]");
    By JeweleryLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Jewelry ')]");
    By GiftCardsLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Gift Cards ')]");

    By loginLink = By.xpath("//a[@class='ico-login']");
    By registerLink = By.xpath("//a[@class='ico-register']");
    By nopcommercelogo = By.xpath("//div[@class='header-logo']/a/img");

    By Myaccountlink = By.xpath("//div[@class='footer-block my-account']/div/strong");
    By LogOutLink = By.xpath("//a[@class='ico-logout']");
    By errorMag = By.xpath("//div[@class='message-error validation-summary-errors']");


    public void clickOnLoginLink() {
        Reporter.log("Clicking on login button " + loginLink.toString());
        clickOnElement(loginLink);
    }

    public String verifyLoginLink() {
        return getTextFromElement(loginLink);

    }

    public void clickOnRegisterLink() {
        Reporter.log("Click on register link " + registerLink.toString());
        clickOnElement(registerLink);
    }
    public void clickOnLogOutLink() {
        Reporter.log("click on LogOut Link tab" + LogOutLink.toString());
        clickOnElement(LogOutLink);
    }
    public void errorMag() {
        Reporter.log("click on errorMag " + errorMag.toString());
        getTextFromElement(errorMag);

    }

    public void clickOnComputerTab() {
        Reporter.log("click on computer tab" + ComputerLink.toString());
        clickOnElement(ComputerLink);

    }

    public void clickOnElectronicsTab() {
        Reporter.log("click on Electronics tab" + ElectronicsLink.toString());
        clickOnElement(ElectronicsLink);
    }

    public void clickOnApparelTab() {
        Reporter.log("click on Apparel tab" + ApparelLink.toString());
        clickOnElement(ApparelLink);
    }

    public void clickOnDigitalDownloadsTab() {
        Reporter.log("click on DigitalDownloads tab" + DigitaldownloadsLink.toString());
        clickOnElement(DigitaldownloadsLink);

    }

    public void clickOnBooksTab() {
        Reporter.log("click on Books tab" + BooksLink.toString());
        clickOnElement(BooksLink);
    }

    public void clickOnJewelryTab() {
        Reporter.log("click on Jewelry tab" + JeweleryLink.toString());
        clickOnElement(JeweleryLink);
    }

    public void clickOnGiftCardsTab() {
        Reporter.log("click on GiftCards tab" + GiftCardsLink.toString());
        clickOnElement(GiftCardsLink);
    }

    public void clickOnMyaccountTab() {
        Reporter.log("click on Myaccount tab" + Myaccountlink.toString());
        clickOnElement(Myaccountlink);

    }

    public void nopcommercelogo() {
        Reporter.log("click on nopcommercelogo tab" + nopcommercelogo.toString());
        clickOnElement(nopcommercelogo);
    }


    }
