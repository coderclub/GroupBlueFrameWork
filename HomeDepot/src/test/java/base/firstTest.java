package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

<<<<<<< Updated upstream

public class FirstTest extends CommonAPIhd{
=======
public class firstTest extends CommonAPIhd {
>>>>>>> Stashed changes
    @Test
    public void search(){
        driver.findElement(By.cssSelector("#headerSearch")).sendKeys("Laptop", Keys.ENTER);
    }
}
