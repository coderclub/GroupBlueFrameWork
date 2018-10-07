package menuPage;

import base.CommonAPI;
import base.CommonAPIhd;
import googleAPI.ConnectToMongoDB;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DropDownClass extends CommonAPI {
     public void readAllDepartmentsTest(){
        List<String> actualData = new ArrayList<>();
        List<WebElement> element =getListOfWebElementsByCss("#container > div:nth-child(2) > div.Header3 > div > div.grid.flush.hide.show--sm > div > ul > li:nth-child(1) > a");
        for(WebElement text:element){
            actualData.add(text.getText());
            System.out.println(text.getText());
        }
        //to be implemented,to read from database
        List<String> menuData = new ArrayList<>();
        Assert.assertEquals(menuData,actualData);
    }
}
