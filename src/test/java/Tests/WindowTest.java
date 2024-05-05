package Tests;

import HelperMethods.WindowMethods;
import Pages.AlertsWindowFramePage;
import Pages.HomePage;
import Pages.WindowPage;
import SharedData.Hooks;
import org.testng.annotations.Test;

public class WindowTest extends Hooks {

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
