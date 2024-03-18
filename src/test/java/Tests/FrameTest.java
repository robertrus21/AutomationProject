package Tests;

import HelperMethods.ElementMethods;
import HelperMethods.FrameMethods;
import Pages.AlertsWindowFramePage;
import Pages.FramePage;
import Pages.HomePage;
import SharedData.SharedData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FrameTest extends SharedData {

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
