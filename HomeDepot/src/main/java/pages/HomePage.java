package pages;

<<<<<<< Updated upstream
import base.CommonAPI;
=======
import base.CommonAPIhd;
>>>>>>> Stashed changes
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends CommonAPIhd{
    @FindBy(css="#container > div:nth-child(2) > div.Header3 > div > div.grid.grid--center-verticle > div.Header3__collapser.col__4-12.col__3-12--sm.col__3-12--md.col__3-12--lg > div > div:nth-child(1) > a > svg > g > path:nth-child(3)")
    public static WebElement theHomeDepot;
    @FindBy(css = "#simpleMenuButton > div.SimpleMenu__menu > svg")
    public static WebElement threeLines;
@FindBy(css="#myStore > a > span.MyStore__icon > svg")
public static WebElement balloon;
@FindBy(css=".MyStore__label")
public static WebElement toSeeInventory;
@FindBy(css="#headerMyAccount > div.MyAccount__icon > div > div.HeaderIcon__primary > svg > g > path:nth-child(1)")
public static WebElement littleMan;
@FindBy(css="#headerMyAccount > div.MyAccount__icon > div > div.HeaderIcon__primary > svg")
public static WebElement cart;
@FindBy(css="#messageBar > div > div > div")
public static WebElement free2DayDelivery;
@FindBy(css="#container > div:nth-child(3) > div:nth-child(3) > div.col__12-12.col__12-12--xs.col__12-12--sm.col__12-12--md.col__12-12--lg.col__12-12--xl > div > div > a > img")
public static WebElement guaranteedWindow;
@FindBy(css="#container > div:nth-child(3) > div:nth-child(3) > div:nth-child(2) > div > div > a > img")
public static WebElement redCrossWindow;
@FindBy(css="#container > div:nth-child(3) > div:nth-child(3) > div:nth-child(3) > div > div > a > img")
public static WebElement homeDepotFoundationWindow;
@FindBy(css="#container > div:nth-child(3) > div:nth-child(9) > div:nth-child(2) > div > div:nth-child(2) > div.col__12-12.col__12-12--xs.col__12-12--sm.col__12-12--md.col__12-12--lg.col__12-12--xl.flexbox--center-center > div > h2 > div > span")
public static WebElement scaryHolloweenDecor;
@FindBy(css="#container > div:nth-child(3) > div:nth-child(11) > div:nth-child(2) > div > div > a > img")
public static WebElement theHomeDepotDelivers;
@FindBy(xpath="//*[@id=\"container\"]/div[2]/div[13]/div[2]/div/h3[2]")
public static WebElement protectYourHome;
@FindBy(xpath="//*[@id=\"container\"]/div[2]/div[25]/div/div/div[7]/div/div/h2/div/span")
public static WebElement popularCategories;
@FindBy(tagName = "a")
public static WebElement airConditioner;
@FindBy(xpath="//*[@id=\"container\"]/div[2]/div[25]/div/div/div[8]/div[2]/div/p[1]/a")
public static WebElement bathroomVanities;
@FindBy(tagName ="a")
public static WebElement blinds;
@FindBy(css="#container > div:nth-child(3) > div:nth-child(3) > div.col__12-12.col__12-12--xs.col__12-12--sm.col__12-12--md.col__12-12--lg.col__12-12--xl > div > div > a > img")
public static WebElement joinUsCelebrating;
@FindBy(css="body > div.QSIFeedBackLink.SI_ehszkP3JIwnjF77_FeedBackLinkContainer > img")
public static WebElement feedback;





<<<<<<< Updated upstream
public class HomePage extends CommonAPI{
    @FindBy(css="#container > div:nth-child(2) > div.Header3 > div > div.grid.grid--center-verticle > div.Header3__collapser.col__4-12.col__3-12--sm.col__3-12--md.col__3-12--lg > div > div:nth-child(1) > a > svg > g > path:nth-child(4)")
public static WebElement theHomeDepotMenuBar;
@FindBy(className = "MyStore__label")
public static WebElement toSeeInventoryMenuBar;
@FindBy(css="#myStore > a > span.MyStore__icon > svg")
public static WebElement balloonSignMenuBar;
@FindBy(css = "#headerSearch")
=======
    @FindBy(css = "#headerSearch")
>>>>>>> Stashed changes
    public static WebElement searchBox;
    @FindBy(css = ".SearchBox__buttonIcon")
    public static WebElement submitButton;
@FindBy(className="MyAccount__label SimpleFlyout__link--bold")
public static WebElement myAccount;
@FindBy(xpath = "//*[@id=\"headerMyAccount\"]/div[2]/div/div[1]/svg/g/path[2]")
public static WebElement humanMenuBar;
@FindBy(className ="MyCart__label")
public static WebElement cart;
@FindBy(className = "MyCart__itemCount__label")
public static WebElement numberItems;
@FindBy(css="#headerCart > div.MyCart__icon > div > div.HeaderIcon__primary > svg")
public static WebElement twoWheelCart;
@FindBy(tagName = "a")
public static WebElement storeFinder;
@FindBy(css="#container > div:nth-child(2) > div.Header3 > div > div:nth-child(1) > div > ul > li:nth-child(2) > a")
public static WebElement truckAndToolRental;
@FindBy(css="#container > div:nth-child(2) > div.Header3 > div > div:nth-child(1) > div > ul > li:nth-child(3) > a")
public static WebElement forThePro;
@FindBy(css="#container > div:nth-child(2) > div.Header3 > div > div:nth-child(1) > div > ul > li:nth-child(4) > a")
public static WebElement giftCard;
@FindBy(css="#container > div:nth-child(2) > div.Header3 > div > div:nth-child(1) > div > ul > li:nth-child(5) > a")
public static WebElement creditServices;
@FindBy(css="#container > div:nth-child(2) > div.Header3 > div > div:nth-child(1) > div > ul > li:nth-child(6) > a")
public static WebElement favorites;
@FindBy(id="headerOrderStatus")
public static WebElement trackOrder;
@FindBy(css="#container > div:nth-child(2) > div.Header3 > div > div:nth-child(1) > div > ul > li:nth-child(8) > a")
public static WebElement help;
@FindBy(xpath="//*[@id=\"container\"]/div[1]/div[2]/div/div[4]/div/ul/li[1]/a")
public static WebElement allDepartments;
@FindBy(css="#container > div:nth-child(2) > div.Header3 > div > div.grid.flush.hide.show--sm > div > ul > li:nth-child(1) > a")
public static WebElement shopByRoom;
@FindBy(xpath="//*[@id=\"container\"]/div[1]/div[2]/div/div[4]/div/ul/li[3]/a")
public static WebElement diyProjectsIdeas;
@FindBy(xpath = "//*[@id=\"container\"]/div[1]/div[2]/div/div[4]/div/ul/li[4]/a")
public static WebElement homeServices;
@FindBy(css="#container > div:nth-child(2) > div.Header3 > div > div.grid.flush.hide.show--sm > div > ul > li:nth-child(5) > a")
public static WebElement specialsOrders;
@FindBy(css="#container > div:nth-child(2) > div.Header3 > div > div.grid.flush.hide.show--sm > div > ul > li:nth-child(6) > a")
public static WebElement localAd;

public void theHomeDepotMenuBar(){
        theHomeDepotMenuBar.click();
    }
public void toSeeInventoryMenuBar(){
        toSeeInventoryMenuBar.click();
}
 public void balloonSignMenuBar(){
        balloonSignMenuBar.click();
 }

    public void theHomeDepot(){
        theHomeDepot.click();
    }
public void threeLines(){
       threeLines.click();
}
public void balloon(){
        balloon.click();
}
public void toSeeInventory(){
        toSeeInventory.click();
}
public void littleMan(){
        littleMan.click();
}
public void cart(){
        cart.click();
}
public void free2DayDelivery(){
        free2DayDelivery.click();
}
public void guaranteedWindow(){
        guaranteedWindow.click();
}
public void redCrossWindow(){
        redCrossWindow.click();
}
public void homeDepotFoundationWindow(){
        homeDepotFoundationWindow.click();
}
public void scaryHolloweenDecor(){
        scaryHolloweenDecor.click();
}
public void theHomeDepotDelivers(){
        theHomeDepotDelivers.click();
}
public void protectYourHome(){
        protectYourHome.click();
}
public void popularCategories(){
        popularCategories.click();
}
public void airConditioner(){
        airConditioner.click();
}
public void bathroomVanities(){
        bathroomVanities.click();
}
public void blinds(){
        blinds.click();
}
public void joinUsCelebrating(){
        joinUsCelebrating.click();
}
public void feedback(){
        feedback.click();
}






    public void searchBox() {
        searchBox.sendKeys("iphone");
    }
    public void submitButton() { submitButton.click();
    }
    public void clearInput() {
        searchBox.clear();
    }
public void myAccount(){
        myAccount.click();
}
public void humanMenuBar(){
        humanMenuBar.click();
}
public void cart(){
        cart.click();
}
public void numberItems(){
        numberItems.click();
}
public void twoWheelCart(){
        twoWheelCart.click();
}
public void storeFinder(){
        storeFinder.getTagName();
}
public void truckAndToolRental(){
        truckAndToolRental.click();
}
public void forThePro(){
        forThePro.click();
}
public void giftCard(){
        giftCard.click();
}
public void creditServices(){
        creditServices.click();
}
public void favorites(){
        favorites.click();
}
public void trackOrder(){
        trackOrder.click();
}
public void help(){
        help.click();
}
public void allDepartments() {
    allDepartments.click();
}
    public void shopByRoom(){
        shopByRoom.click();
    }
public void diyProjectsIdeas(){
    diyProjectsIdeas.click();
    }
public void homeServices(){
    homeServices.click();
}
public void specialsOrders(){
    specialsOrders.click();
}
public void localAd(){
    localAd.click();
}


}



