package Tests;

import Pages.AlertsWindowFramePage;
import Pages.FramePage;
import Pages.HomePage;
import SharedData.Hooks;
import org.testng.annotations.Test;

public class FrameTest extends Hooks {

//    public WebDriver webDriver;

    @Test
    public void frameMethod(){

        HomePage homePage = new HomePage(getWebDriver());
        homePage.navigateAlertFrameWindowPage();

        AlertsWindowFramePage alertsWindowFramePage = new AlertsWindowFramePage(getWebDriver());
        alertsWindowFramePage.navigateToFramePage();

        FramePage framePage = new FramePage(getWebDriver());
        framePage.dealWithIFrame();

    }
}
