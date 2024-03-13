package Tests;

import HelperMethods.ElementMethods;
import HelperMethods.FrameMethods;
import Pages.AlertsWindowFramePage;
import Pages.HomePage;
import SharedData.SharedData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FrameTest extends SharedData {

//    public WebDriver webDriver;

    @Test
    public void frameMethod(){
//        webDriver = new ChromeDriver();
//        //accesam URL
//        webDriver.get("https://demoqa.com/");
//        //identificam un element din pagina web
//
//        //webDriver.manage().window().setSize(new Dimension(600,800));
//        webDriver.manage().window().maximize();
//
//        //facem un scrol la pagina

        ElementMethods elementMetods = new ElementMethods(getWebDriver());
        FrameMethods frameMethods = new FrameMethods(getWebDriver());
        HomePage homePage = new HomePage(getWebDriver());

        AlertsWindowFramePage alertsWindowFramePage = new AlertsWindowFramePage(getWebDriver());
        alertsWindowFramePage.navigateToFramePage();



//        JavascriptExecutor js = (JavascriptExecutor) webDriver;
//        js.executeScript("window.scrollBy(0,350)", "");

        elementMetods.scrollElementByPyxel(0,350);

        WebElement consentField = getWebDriver().findElement(By.className("fc-button-label"));
        elementMetods.clickElement(consentField);

        WebElement elementsField = getWebDriver().findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        elementMetods.clickElement(elementsField);

        WebElement webTablesField = getWebDriver().findElement(By.xpath("//span[text()='Frames']"));
        elementMetods.clickElement(webTablesField);

        //interactionam cu un iframe

        frameMethods.switchSpecificIFrame("frame1");
        WebElement thisIs = getWebDriver().findElement(By.id("sampleHeading"));
        elementMetods.printElementText(thisIs);

        //specificam sa revina la frameul curent

        getWebDriver().switchTo().parentFrame();

//        JavascriptExecutor ms = (JavascriptExecutor) webDriver;
//        ms.executeScript("window.scrollBy(0,550)", "");

        elementMetods.scrollElementByPyxel(0,550);

        //webDriver.switchTo().frame("frame2");
        frameMethods.switchParentFeame("frame2");
        WebElement thisIs2 = getWebDriver().findElement(By.id("sampleHeading"));
        //System.out.println(thisIs2.getText());
        elementMetods.printElementText(thisIs2);

    }
}
