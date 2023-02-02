package com.nopcommerce.testsuite;

import com.nopcommerce.pages.BuildYourOwnComputerPage;
import com.nopcommerce.pages.ComputerPage;
import com.nopcommerce.pages.DeskTopPage;
import com.nopcommerce.pages.Homepage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputerPageTest {
    ComputerPage computerPage=new ComputerPage();
    Homepage homepage =new Homepage();
    DeskTopPage dekstoppage = new DeskTopPage();
    BuildYourOwnComputerPage buildYourOwnComputerPage=new BuildYourOwnComputerPage();
    @Test
    public void verifyUserShouldNavigateToComputerPageSuccessfully(){
        homepage.clickOnComputerTab();
        String actualMsg=computerPage.getComputerText();
        String expectedMsg="Computer";
        Assert.assertEquals(actualMsg,expectedMsg,"Computer text is verified");


    }
    public void verifyUserShouldNavigateToDesktopPageSuccessfully(){
        homepage.clickOnComputerTab();
        String actualMsg=dekstoppage.verifyDesktopText();
        String expectedMsg="Desktops";
        Assert.assertEquals(actualMsg,expectedMsg,"Desktops text is verified");



      buildYourOwnComputerPage.selectOnProcessorDropDownLink("2.2 GHz Intel Pentium Dual-Core E2200");
      buildYourOwnComputerPage.selectOnRamDropDownLink("5");
      buildYourOwnComputerPage.clickOnHHDGBLink();
      buildYourOwnComputerPage.clickOnOSradiosLink();
      buildYourOwnComputerPage.clickOnSoftwareCheckbox();
      buildYourOwnComputerPage.clickOnAddToCartbuttonLink();

        String Buildyourcomputer = buildYourOwnComputerPage.getBuildyourowncomputerText();
        String Buildyourcomputer1 ="The product has been added to your shopping cart";
        Assert.assertEquals(Buildyourcomputer1,Buildyourcomputer,"The product has been added to your shopping cart");












    }

}
