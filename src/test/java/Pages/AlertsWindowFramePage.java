package Pages;

import HelperMethods.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
        elementMethods.clickElement(alertField);
    }
    public void navigateToFramePage() {
        elementMethods.scrollElementByPyxel(0, 350);
        elementMethods.clickElement(frameField);
    }

    public void navigateToWindowsPage (){
        elementMethods.scrollElementByPyxel(0, 350);
        elementMethods.clickElement(webTablesField);
    }
}
