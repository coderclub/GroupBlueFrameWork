package DataReaderCommonClass;

import homePage.Login;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.ValueRange;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import reporting.TestLogger;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static base.GoogleSheetReader.getSheetsService;

public class GoogleSheetClass extends Login {
    Login loginObject = PageFactory.initElements(driver,Login.class);

    public List<List<Object>> getSpreadSheetRecords(String spreadsheetId, String range) throws IOException {
        // Build a new authorized API client service.
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Sheets service = getSheetsService();
        ValueRange response = service.spreadsheets().values()
                .get(spreadsheetId, range)
                .execute();
        List<List<Object>> values = response.getValues();
        if (values == null || values.size() == 0) {
            return null;
        } else {
            return values;

        }
    }
    public void signInByInvalidIdPass(String spreadsheetId, String range) throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        navigateToLoginPage();
        List<List<Object>> col2Value = getSpreadSheetRecords(spreadsheetId, range);
        for (List row : col2Value) {
           String expectedMessage = SendLoginInfo(row.get(0).toString(),row.get(1).toString());
           String actualMessage = row.get(2).toString();
           Assert.assertEquals(actualMessage,expectedMessage);
        }

    }
}
