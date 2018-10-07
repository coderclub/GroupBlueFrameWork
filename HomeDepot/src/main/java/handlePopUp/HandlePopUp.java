package handlePopUp;

import base.CommonAPIhd;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class HandlePopUp extends CommonAPIhd{
    //  css #Wrapper > div.SkinInner
    //class  NextButton Button
    //xpath #NextButton
    @FindBy(css = "body > div.QSIFeedBackLink.SI_ehszkP3JIwnjF77_FeedBackLinkContainer > img")
    public WebElement feedbackPopUpWindowWebElement;
    @FindBy(xpath= "#NextButton")
    public WebElement feedbackPopUpWindowNextWebElement;
    public WebElement getFeedbackPopUpWindowWebElement() {
        return feedbackPopUpWindowWebElement;
    }
    public void setFeedbackPopUpWindowWebElement(WebElement feedbackPopUpWindowWebElement) {
        this.feedbackPopUpWindowWebElement = feedbackPopUpWindowWebElement;
    }
    public WebElement getFeedbackPopUpWindownextWebElement() {
        return feedbackPopUpWindowNextWebElement;
    }
    public void setFeedbackPopUpWindownextWebElement(WebElement feedbackPopUpWindownextWebElement) {
        this.feedbackPopUpWindowNextWebElement = feedbackPopUpWindownextWebElement;
    }
    public boolean isfeedbackPopUpWindowDisplayed(WebDriver driver1, String locator){
        boolean value = CommonAPIhd.isPopUpWindowDisplayed(driver1, locator);
        return value;
    }
    public void closePopUpWindow(){
        setFeedbackPopUpWindownextWebElement(feedbackPopUpWindowNextWebElement);
        getFeedbackPopUpWindownextWebElement().click();
    }
    public void handlePopUpWindowBeforeLogIn(WebDriver driver1)throws InterruptedException{
        Thread.sleep(2000);
        if(isfeedbackPopUpWindowDisplayed(driver1, "#Wrapper > div.SkinInner")) {
            TestLogger.log("Yes, displayed. Handle it now.");
            closePopUpWindow();
            TestLogger.log("Sleep for 2 sec");
          Thread.sleep(2000);
        }
    }
}
