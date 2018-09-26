package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

import java.io.IOException;

import static base.BeforeNAfterMethods.driver;

public class HomePageTest extends HomePage {
    HomePage homePage;

    @BeforeMethod
    public void init() {
        homePage = PageFactory.initElements(driver, HomePage.class);
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