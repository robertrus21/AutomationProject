package Tests;

import HelperMethods.ElementMethods;
import HelperMethods.WindowMethods;
import Pages.AlertsWindowFramePage;
import Pages.HomePage;
import Pages.WindowPage;
import SharedData.SharedData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WindowTest extends SharedData {

   // public WebDriver webDriver;

    @Test
    public void windowMethod() {

        WindowMethods windowMethods = new WindowMethods(getWebDriver());
        HomePage homePage = new HomePage(getWebDriver());
        homePage.navigateAlertFrameWindowPage();
        AlertsWindowFramePage alertsWindowFramePage = new AlertsWindowFramePage(getWebDriver());
        alertsWindowFramePage.navigateToWindowsPage();
        WindowPage windowPage = new WindowPage(getWebDriver());
        windowPage.windowManagement();
        windowPage.windowManagementSwitch();
    }

}
