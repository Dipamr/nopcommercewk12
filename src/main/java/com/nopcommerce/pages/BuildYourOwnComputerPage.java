package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class BuildYourOwnComputerPage extends Utility {
    By BuildyourowncomputerText = By.xpath("//h2[@class='product-title']/a[contains(text(),'Build your own computer')]");
    By ProcessorDropDownLink = By.xpath("//dd[@id='product_attribute_input_1']");
    By RamdropdownLink = By.xpath("//dd[@id='product_attribute_input_2']");

    By HHDGBLink = By.xpath("//input[@id='product_attribute_3_6']");

    By OSradiosLink = By.xpath("//input[@id='product_attribute_4_8']");
    By SoftwareCheckbox = By.xpath("//input[@id='product_attribute_5_10']");
    By AddToCartbutton = By.xpath("//button[@id='add-to-cart-button-1']");
    By Addedtoyourshoppingcart = By.xpath("//a[@class='ico-cart']/span[2]");

    public String getBuildyourowncomputerText() {
       return getTextFromElement(BuildyourowncomputerText);
    }

    public void selectOnProcessorDropDownLink(String value) {
       selectByVisibleTextFromDropDown(ProcessorDropDownLink,value);
    }

    public void selectOnRamDropDownLink(String value) {
        selectByVisibleTextFromDropDown(RamdropdownLink,value);

    }

    public void clickOnHHDGBLink() {
        Reporter.log("Click on HHDGBLink " + HHDGBLink.toString());
        clickOnElement(HHDGBLink);

    }

    public void clickOnOSradiosLink() {
        Reporter.log("Click on OSradiosLink  " + OSradiosLink.toString());
        clickOnElement(OSradiosLink);

    }

    public void clickOnSoftwareCheckbox() {
        Reporter.log("Click on SoftwareLink  " + SoftwareCheckbox.toString());
        clickOnElement(SoftwareCheckbox);
    }
    public void clickOnAddToCartbuttonLink() {
        Reporter.log("Click on AddToCartbutton Link  " + AddToCartbutton.toString());
        clickOnElement(AddToCartbutton);
    }
    public String verifyaddedtoyourshoppingcartLink() {
       return getTextFromElement(Addedtoyourshoppingcart);
    }

}