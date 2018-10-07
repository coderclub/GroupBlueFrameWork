package dropDownPageTest;

import menuPage.DropDownClass;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import reporting.TestLogger;

import static base.CommonAPIhd.driver;

public class DropDownClassTest extends DropDownClass{
    @Test//f
    public void dropDownTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        readAllDepartmentsTest();
    }
}
