package tests;

import base.CommonAPIhd;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchPage;

import java.io.IOException;

public class SearchPageTest extends SearchPage {
    SearchPage object;
    @BeforeMethod
    public void init(){
        object = PageFactory.initElements(driver,SearchPage.class);
    }
    @Test
    public void search(){
        typeOnInputBox("#headerSearch","honey");
    }
    @Test
    public void searchData()throws IOException {
        SearchPage searchPage=PageFactory.initElements(driver,SearchPage.class);
        searchPage.searchItemsAndSubmitButton();
    }
}
