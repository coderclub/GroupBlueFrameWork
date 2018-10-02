package pages;

import base.CommonAPIhd;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SearchPage extends CommonAPIhd {
    @FindBy(css = "#headerSearch")
    public static WebElement searchboxwebelement;
    @FindBy(css = "#headerSearchButton > svg")
    public static WebElement submitbuttonwebelement;
    public WebElement getSearchboxwebelement() {
        return searchboxwebelement;
    }
    public WebElement getSubmitbuttonwebelement() {
        return submitbuttonwebelement;
    }
    public void searchFor(String value) {
        getSearchboxwebelement().sendKeys(value);
    }
    public void submitButton() {
        getSubmitbuttonwebelement().click();
    }
    public void clearInput() {
        getSearchboxwebelement().clear();
    }
   /* public List<String> getItemData() {
        List<String> data = new ArrayList<>();
        data.add("coffee");
        data.add("pajama");
        data.add("face wash");
        return data;
    }*/
    public void searchItemsAndSubmitButton() throws IOException {
        List<String> list1 = getItemValue();
        for (int i = 0; i < list1.size(); i++) {
            searchFor(list1.get(i));
            submitButton();
            clearInput();
        }
    }
    public WebElement getSearchInputField() {
        return searchboxwebelement;
    }
    public void setSearchInputField(WebElement searchInputField) {
        this.searchboxwebelement = searchInputField;
    }
    public void searchItems() throws InterruptedException {
        List<String> itemList = getItemValue();
        for (String st : itemList) {
            getSearchInputField().sendKeys(st, Keys.ENTER);
            getSearchInputField().clear();
        }
    }
    public static List<String> getItemValue() {
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("cake");
        itemsList.add("gift cards");
        itemsList.add("laptop");
        itemsList.add("jeans");
        itemsList.add("socks");
        itemsList.add("headphone");
        itemsList.add("lipstick");
        itemsList.add("sunglasses");
        return itemsList;
    }
}
