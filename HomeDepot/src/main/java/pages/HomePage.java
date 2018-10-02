package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI{
    @FindBy(css="#container > div:nth-child(2) > div.Header3 > div > div.grid.grid--center-verticle > div.Header3__collapser.col__4-12.col__3-12--sm.col__3-12--md.col__3-12--lg > div > div:nth-child(1) > a > svg > g > path:nth-child(4)")
public static WebElement theHomeDepotMenuBar;
@FindBy(className = "MyStore__label")
public static WebElement toSeeInventoryMenuBar;
@FindBy(css="#myStore > a > span.MyStore__icon > svg")
public static WebElement balloonSignMenuBar;
@FindBy(css = "#headerSearch")
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



