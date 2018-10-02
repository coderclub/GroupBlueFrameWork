package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BodyPage {
@FindBy(css="#messageBar > div > div > div")
    public static WebElement deliveryLine;
@FindBy(css="#container > div:nth-child(3) > div:nth-child(3) > div.col__12-12.col__12-12--xs.col__12-12--sm.col__12-12--md.col__12-12--lg.col__12-12--xl > div > div > a > img")
public static WebElement discountPng;
@FindBy(css="#container > div:nth-child(3) > div:nth-child(3) > div:nth-child(2) > div > div > a > img")
public static WebElement americanRedCross;
@FindBy(css="#container > div:nth-child(3) > div:nth-child(3) > div:nth-child(3) > div > div > a > img")
public static WebElement theHomeDepotFoundation;
@FindBy(css="#container > div:nth-child(3) > div:nth-child(9) > div:nth-child(2) > div > div:nth-child(2) > div.col__12-12.col__12-12--xs.col__12-12--sm.col__12-12--md.col__12-12--lg.col__12-12--xl.flexbox--center-center > div > h2 > div > span")
public static WebElement scaryHalloweenDecor;
@FindBy(css="#container > div:nth-child(3) > div:nth-child(9) > div:nth-child(2) > div > div:nth-child(2) > div:nth-child(2) > div > div > a > img")
public static WebElement shopYardDecor;
@FindBy(css="#container > div:nth-child(3) > div:nth-child(13) > div:nth-child(2) > div > h3.u__large.u__display-font--medium.u__text-align--left")
public static WebElement protectYourHome;
@FindBy(css="#container > div:nth-child(3) > div:nth-child(25) > div > div > div:nth-child(7) > div > div > h2 > div > span")
public static WebElement popularCategories;
@FindBy(css="#container > div:nth-child(3) > div:nth-child(25) > div > div > div:nth-child(8) > div:nth-child(1) > div > p:nth-child(1) > a")
public static WebElement airConditionaers;
@FindBy(css="#container > div:nth-child(5) > footer > div:nth-child(2) > nav:nth-child(1) > h3")
public static WebElement customerServices;
@FindBy(css="#container > div:nth-child(5) > footer > div.u__bgColor--faded > div > div.col__6-12.u__text-align--right > p > a > strong")
public static WebElement customerServicesLine;
@FindBy(css = "#container > div:nth-child(5) > footer > nav > div:nth-child(2) > ul > li:nth-child(3) > a")
public static WebElement blindsCom;
@FindBy(css="#footerEmail")
public static WebElement emailBox;
@FindBy(css="#footerEmailSignup > fieldset > p.footerEmailSignup__controlGroup > button > span")
public static WebElement goButton;


public void deliveryLine(){
    deliveryLine.click();
}
public void discountPng(){
    discountPng.click();
}
public void americanRedCross(){
    americanRedCross.click();
}
public void theHomeDepotFoundation(){
    theHomeDepotFoundation.click();
}
public void scaryHalloweenDecor(){
    scaryHalloweenDecor.click();
}
public void shopYardDecor(){
    shopYardDecor.click();
}
public void protectYourHome(){
    protectYourHome.click();
}
public void popularCategories(){
    popularCategories.click();
}
public void airConditioners(){
    airConditionaers.click();
}
public void customerServices(){
    customerServices.click();
}
public void customerServicesLine(){
    customerServices.click();
}
public void blindsCom(){
    blindsCom.click();
}
public void emailBox(){
    emailBox.click();
}
public void goButton(){
    goButton.click();
}


}