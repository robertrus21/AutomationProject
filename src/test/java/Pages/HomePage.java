package Pages;

import HelperMethods.ElementMethods;
import SharedData.SharedData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    public HomePage(WebDriver webDriver) {

        super(webDriver);
    }

    @FindBy(className = "fc-button-label")
    private WebElement consentField;
    @FindBy(xpath = "//h5[text()='Alerts, Frame & Windows']")
    private WebElement elementsField;

    @FindBy(xpath = "//h5[text()='Forms']")
    private WebElement formsField;

    @FindBy(xpath = "//h5[text()='Elements']")
    private WebElement elemField;


    public void navigateAlertFrameWindowPage(){
        elementMethods.scrollElementByPyxel(0,350);
    //    WebElement consentField = getWebDriver().findElement(By.className("fc-button-label"));
    //    elementMethods.clickElement(consentField);
    //    WebElement elementsField = getWebDriver().findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        elementMethods.clickElement(elementsField);
    }

    public void navigateFormsPage(){
        elementMethods.scrollElementByPyxel(0,350);
        elementMethods.clickElement(formsField);
    }

    public void navidateWebTablePage (){
        elementMethods.scrollElementByPyxel(0,350);
        elementMethods.clickElement(elemField);
    }

}
