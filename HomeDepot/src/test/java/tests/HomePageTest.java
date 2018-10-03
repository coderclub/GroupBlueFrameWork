package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import java.io.IOException;
<<<<<<< Updated upstream
=======

>>>>>>> Stashed changes
public class HomePageTest extends HomePage {
    HomePage homePage;
    @BeforeMethod
    public void init() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }
    @Test
    public void topBar1(){
        theHomeDepot();
    }
    @Test
    public void topBar2() throws IOException{
        threeLines();
    }
    @Test //f
    public void topBar3(){
        balloon();
    }
@Test
public void topBar4(){
        toSeeInventory();
}
@Test  //f
public void topBar5(){
        littleMan();
}
@Test
public void topBar6(){
        cart();
}
@Test
public void topBar7(){
        free2DayDelivery();
}
@Test
public void topBar8(){
        guaranteedWindow();
}
@Test
public void topBar9(){
        redCrossWindow();
}
@Test
public void topBar10(){
        homeDepotFoundationWindow();
}
@Test
public void topBar11(){
        scaryHolloweenDecor();
}
@Test
public void topBar12(){
        theHomeDepotDelivers();
}
@Test
public void topBar13(){
        protectYourHome();
}
@Test
public void topBar14(){
        popularCategories();
}
@Test
public void bottomPage15(){
        airConditioner();
}
@Test
public void bathroomVanities16(){
        bathroomVanities();
}
@Test
public void blinds17() throws IOException{
        blinds();
    }
@Test
public void joinUsCelebrating18(){
        joinUsCelebrating();
}
@Test
public void feedback19(){
        feedback();
}








    @Test
    public void searchData() throws IOException, InterruptedException {
        homePage.searchBox();
        homePage.submitButton();
        Thread.sleep(5000);
        homePage.clearInput();
        Thread.sleep(5000);
    }
}