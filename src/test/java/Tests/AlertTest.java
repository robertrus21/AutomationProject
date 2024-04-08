package Tests;

import HelperMethods.AlertMethods;
import HelperMethods.ElementMethods;
import Pages.AlertPage;
import Pages.AlertsWindowFramePage;
import Pages.HomePage;
import SharedData.Hooks;
import org.openqa.selenium.*;
import org.testng.annotations.Test;

public class AlertTest extends Hooks {

    @Test
    public void alertMethod(){

        HomePage homePage = new HomePage(getWebDriver());
        homePage.navigateAlertFrameWindowPage();

        AlertsWindowFramePage alertsWindowFramePage = new AlertsWindowFramePage(getWebDriver());
        alertsWindowFramePage.navigateToAlertPage();

        AlertPage alertPage = new AlertPage(getWebDriver());
        alertPage.dealWithAcceptAlert();
        alertPage.dealWithDellayAlert();
        alertPage.dealWithPromtButton("test");
        alertPage.dealWithCancelButton();

    }
}
