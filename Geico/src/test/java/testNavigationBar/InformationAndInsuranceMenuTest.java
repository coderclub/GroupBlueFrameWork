package testNavigationBar;

import navigationBar.InformationAndInsuranceMenu;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class InformationAndInsuranceMenuTest extends navigationBar.InformationAndInsuranceMenu {
    navigationBar.InformationAndInsuranceMenu object;
    @BeforeMethod
    public void init(){
        object = PageFactory.initElements(driver, navigationBar.InformationAndInsuranceMenu.class);
    }
    @Test
   public void testInformationMenuItems() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        compareInformation();
    }
    @Test
    public void testInsuranceMenuItems() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        compareInsurance();
    }
}
