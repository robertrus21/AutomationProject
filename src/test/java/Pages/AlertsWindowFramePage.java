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
    private WebElement browserFormField;

    public void navigateToAlertPage() {
        elementMethods.scrollElementByPyxel(0, 350);
        elementMethods.clickElement(browserFormField);
    }
}
