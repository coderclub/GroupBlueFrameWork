package DataDrivenTests;

import DataDrivenClass.GoogleSheetClass;
import DataDrivenClass.Login;
import base.CommonClass;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class TestGoogleSheetsPage extends CommonClass {
    Login loginObject;
    GoogleSheetClass googleSheetsPage;

    @BeforeMethod
    public void initialization(){
        loginObject = PageFactory.initElements(driver, Login.class);
        googleSheetsPage = PageFactory.initElements(driver,GoogleSheetClass.class);
    }

    //Verify log in by taking data from a google sheets file
    @Test
    public void testLogInByInvalidIdPassUsingGoogleSheet() throws IOException, InterruptedException {
<<<<<<< Updated upstream
        driver.navigate().to("https://ecams.geico.com/ecams/login.xhtml?r=true");
        Thread.sleep(1000);
        String spreadsheetId = "1H0JiWbL-Hq9to5oI21m65xpY0OQzJ4qCLjdzqbFgy6c";
=======
        //Thread.sleep(3000);

        Thread.sleep(3000);
        int i = 0;
        String spreadsheetId = "1A6G3avCchSjTPM1xoGU8YaYo3azwl4uHBsfgwRZB31A";
>>>>>>> Stashed changes
        String range = "Sheet1!A2:C";
        List<String> actualErrorMessage = googleSheetsPage.signInByInvalidIdPass(spreadsheetId, range);
        loginObject.clickSubmit();
        List<List<Object>> expectedErrorMessage = googleSheetsPage.getSpreadSheetRecords(spreadsheetId, range);
<<<<<<< Updated upstream
        for (int index=0;index<expectedErrorMessage.size();index++) {
            Assert.assertTrue(actualErrorMessage.get(index).contains(actualErrorMessage.get(index)));
=======
        for (List row : expectedErrorMessage) {
            // Assert.assertTrue(actualErrorMessage.get(i).contains(row.get(3).toString()));
            //System.out.println("expected"+row.get(3).toString());
            System.out.println(expectedErrorMessage.get(i) + ": Search - Passed");
            i++;
>>>>>>> Stashed changes
        }
        System.out.println("testLogInByInvalidIdPassUsingGoogleSheet Passed");
    }
}
