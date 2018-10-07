package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BodyPage;

public class BodyPageTest extends BodyPage {
    BodyPage bodyPage;
    @BeforeMethod
    public void init() {
        bodyPage = PageFactory.initElements(driver, BodyPage.class);
    }
    @Test
    public void deliveryLine1(){
        deliveryLine();
    }
    @Test
    public void discountPng2(){
        discountPng();
    }
    @Test
    public void americanRedCross3(){
        americanRedCross();
    }
    @Test
    public void theHomeDepotFoundation4(){
        theHomeDepotFoundation();
    }
    @Test
    public void scaryHalloweenDecor5() {
        scaryHalloweenDecor();
    }
    @Test
    public void shopYardDecor6(){
        shopYardDecor();
    }
    @Test
    public void protectYourHome7(){
        protectYourHome();
    }
    @Test
    public void popularCategories8(){
        popularCategories();
    }
    @Test
    public void airConditioners9(){
        airConditioners();
    }
    @Test
    public void customerServices10(){
        customerServices();
    }
    @Test
    public void customerServicesLine11(){
        customerServices();
    }
    @Test
    public void blindsCom12(){
        blindsCom();
    }
    @Test
    public void emailBox13(){
        emailBox();
    }
    @Test
    public void goButton(){
        goButton();
    }
}
