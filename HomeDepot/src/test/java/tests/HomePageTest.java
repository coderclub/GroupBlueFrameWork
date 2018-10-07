package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import java.io.IOException;

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
    public void topBar2() throws IOException{ threeLines(); }
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
    public void topBar7(){ free2DayDelivery(); }
    @Test
    public void topBar8(){ guaranteedWindow(); }
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
    public void blinds17() throws IOException{ blinds(); }
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
    @Test
    public void clearInput21() {
        searchBox();
    }
    @Test
    public void myAccount22(){
        myAccount();
    }
    @Test
    public void humanMenuBar23(){
        humanMenuBar();
    }
    @Test
    public void numberItems24(){
        numberItems();
    }
    @Test
    public void twoWheelCart25(){
        twoWheelCart();
    }
    @Test
    public void storeFinder26(){
        storeFinder();
    }
    @Test
    public void truckAndToolRental27(){
        truckAndToolRental();
    }
    @Test
    public void forThePro28(){
        forThePro();
    }
    @Test
    public void giftCard29(){
        giftCard();
    }
    @Test
    public void creditServices30(){
        creditServices();
    }
    @Test
    public void favorites31(){
        favorites();
    }
    @Test
    public void trackOrder32(){
        trackOrder();
    }
    @Test
    public void help33(){
        help();
    }
    @Test
    public void allDepartments34() {
        allDepartments();
    }
    @Test
    public void shopByRoom35(){
        shopByRoom();
    }
    @Test
    public void diyProjectsIdeas36(){
        diyProjectsIdeas();
    }
    @Test
    public void homeServices37(){
        homeServices();
    }
    @Test
    public void specialsOrders38(){
        specialsOrders();
    }
    @Test
    public void localAd39(){
        localAd();
    }
}