package pages;

import base.BeforeNAfterMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BeforeNAfterMethods {
    @FindBy(css = "#headerSearch")
    public static WebElement searchBox;
    @FindBy(css = ".SearchBox__buttonIcon")
    public static WebElement submitButton;

    public void searchBox() {
        searchBox.sendKeys("iphone");
    }
    public void submitButton() { submitButton.click();
    }
    public void clearInput() {
        searchBox.clear();
    }

}

