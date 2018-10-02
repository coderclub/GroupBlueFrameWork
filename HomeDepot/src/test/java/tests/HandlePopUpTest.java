package tests;

import base.CommonAPIhd;
import handlePopUp.HandlePopUp;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
public class HandlePopUpTest extends CommonAPIhd {
    @Test//f
    public void popUpHandle()throws InterruptedException{
        HandlePopUp handlePopUp = PageFactory.initElements(driver, HandlePopUp.class);
        handlePopUp.handlePopUpWindowBeforeLogIn(driver);
    }
}
