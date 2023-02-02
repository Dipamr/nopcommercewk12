package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class DeskTopPage extends Utility {
    By DesktopsText = By.xpath("//div[@class='page category-page']/div/h1");
    By SortbyLink = By.xpath("//div[@class='product-sorting']/span");
    By DisplayLink = By.xpath("//div[@class='product-page-size']//span[contains(text(),'Display')]");
    By selectProductListLink = By.xpath("//a[@class='viewmode-icon list']");

    public String verifyDesktopText() {
      return getTextFromElement(DesktopsText);
    }

    public void clickOnsortbyLink() {
        Reporter.log("Click on Sortby link " + SortbyLink.toString());
        clickOnElement(SortbyLink);
    }

    public void clickOnDisplayLink() {
        Reporter.log("Click on Display link " + DisplayLink.toString());
        clickOnElement(DisplayLink);

    }

    public void clickOnselectProductListLink() {
        Reporter.log("Click on selectProductList link " + selectProductListLink.toString());
        clickOnElement(selectProductListLink);

    }
}