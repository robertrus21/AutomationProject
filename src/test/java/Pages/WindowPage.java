package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WindowPage extends BasePage{

    public WindowPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy (id = "tabButton")
            public WebElement newTabButton;

    @FindBy (id = "windowButton")
    public WebElement newWindowButton;

    public void windowManagement () {
        elementMethods.clickElement(newTabButton);
        windowMethods.switcSpecificTabWindow(1);
        windowMethods.closeWindow();
        windowMethods.switcSpecificTabWindow(0);
    }

    public void windowManagementSwitch () {
        elementMethods.clickElement(newWindowButton);
        windowMethods.switcSpecificTabWindow(1);
        windowMethods.closeWindow();
        windowMethods.switcSpecificTabWindow(0);
    }

}
