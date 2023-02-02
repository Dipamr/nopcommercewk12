package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class ComputerPage extends Utility {
    By ComputerText = By.xpath("///ul[@class='top-menu notmobile']/li[1]");
    By DesktopsLink = By.xpath("//div[@class='page-body']/div[1]/div[1]/div[1]/div[1]/h2/a");
    By NotebooksLink = By.xpath("//a[contains(text(),' Notebooks')]");
    By SoftwareLink = By.xpath("//a[contains(text(),' Software')]");

    public String getComputerText() {
        return getTextFromElement(ComputerText);

    }

    public void clickOnDesktopsLink() {
        Reporter.log("Click on Desktop link " + DesktopsLink.toString());
        clickOnElement(DesktopsLink);
    }

    public void clickOnNotebooksLink() {
        Reporter.log("Click on NotebooksLink link " + NotebooksLink.toString());
        clickOnElement(NotebooksLink);
    }
    public void clickOnSoftwareLink() {
        Reporter.log("Click on SoftwareLink link " + SoftwareLink.toString());
        clickOnElement(SoftwareLink);
    }
}