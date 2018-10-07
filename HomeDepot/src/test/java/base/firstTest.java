package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;


public class firstTest extends CommonAPIhd {

    @Test
    public void search(){
        driver.findElement(By.cssSelector("#headerSearch")).sendKeys("Laptop", Keys.ENTER);
    }
}
