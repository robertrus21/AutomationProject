package Pages;

import HelperMethods.ElementMethods;
import LoggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.ILoggerFactory;

public class AlertsWindowFramePage extends BasePage{

    public AlertsWindowFramePage(WebDriver webDriver) {
        super(webDriver);
    }
    @FindBy(xpath = "//span[text() ='Alerts']")
    private WebElement alertField;

    @FindBy(xpath = "//span[text() ='Frames']")
    private WebElement frameField;

    @FindBy(xpath = "//span[text()='Browser Windows']")
    private WebElement webTablesField;
    public void navigateToAlertPage() {
        elementMethods.scrollElementByPyxel(0, 350);
        LoggerUtility.infoTest("The user scrolls down the page");
        elementMethods.clickElement(alertField);
        LoggerUtility.infoTest("The user clicks on alertField element");
    }
    public void navigateToFramePage() {
        elementMethods.scrollElementByPyxel(0, 350);
        LoggerUtility.infoTest("The user clocks on alertField element");
        elementMethods.clickElement(frameField);
        LoggerUtility.infoTest("The user clicks on frameElement element");
    }

    public void navigateToWindowsPage (){
        elementMethods.scrollElementByPyxel(0, 350);
        LoggerUtility.infoTest("The user clocks on alertField element");
        elementMethods.clickElement(webTablesField);
        LoggerUtility.infoTest("The user clicks on webTaglesField element");
    }
}
