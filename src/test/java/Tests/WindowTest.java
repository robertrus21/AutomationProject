package Tests;

import HelperMethods.ElementMethods;
import HelperMethods.WindowMethods;
import SharedData.SharedData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WindowTest extends SharedData {

   // public WebDriver webDriver;

    @Test
    public void windowMethod() {
//        webDriver = new ChromeDriver();
//        //accesam URL
//        webDriver.get("https://demoqa.com/");
//        //identificam un element din pagina web
//
//        //webDriver.manage().window().setSize(new Dimension(600,800));
//        webDriver.manage().window().maximize();

        //facem un scrol la pagina

        ElementMethods elementMethods = new ElementMethods(getWebDriver());
        WindowMethods windowMethods = new WindowMethods(getWebDriver());

        elementMethods.scrollElementByPyxel(0,350);

//        JavascriptExecutor js = (JavascriptExecutor) webDriver;
//        js.executeScript("window.scrollBy(0,350)", "");

        WebElement consentField = getWebDriver().findElement(By.className("fc-button-label"));
        elementMethods.clickElement(consentField);
       // consentField.click();

        WebElement elementsField = getWebDriver().findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        elementMethods.clickElement(elementsField);
        //elementsField.click();

        WebElement webTablesField = getWebDriver().findElement(By.xpath("//span[text()='Browser Windows']"));
        elementMethods.clickElement(webTablesField);
        //webTablesField.click();

        WebElement newTabButton = getWebDriver().findElement(By.id("tabButton"));
        elementMethods.clickElement(newTabButton);
        //newTabButton.click();

        //trebuie sa identificam numarul de taburi deschise
//        List<String> tabsOpened = new ArrayList<>(webDriver.getWindowHandles());
//        System.out.println("Tabul curent cu URL " + webDriver.getCurrentUrl());
//
//        webDriver.switchTo().window(tabsOpened.get(1));
//        System.out.println("Tabul curent cu URL " + webDriver.getCurrentUrl());

        windowMethods.switcSpecificTabWindow(1);

        //ca sa inchidem tabul curent = close
        //inchidem browserul = quit

        //webDriver.close();

        windowMethods.closeWindow();

//        webDriver.switchTo().window(tabsOpened.get(0));
//        System.out.println("Tabul curent cu URL " + webDriver.getCurrentUrl());

        windowMethods.switcSpecificTabWindow(0);

        WebElement newWindowButton = getWebDriver().findElement(By.id("windowButton"));
        elementMethods.clickElement(newWindowButton);

//        List<String> windowOpened = new ArrayList<>(webDriver.getWindowHandles());
//        System.out.println("Windowul curent cu URL " + webDriver.getCurrentUrl());
//
//        webDriver.switchTo().window(windowOpened.get(1));
//        System.out.println("Windowul curent cu URL " + webDriver.getCurrentUrl());

        windowMethods.switcSpecificTabWindow(1);

//        webDriver.close();

        windowMethods.closeWindow();
//        webDriver.switchTo().window(windowOpened.get(0));
//        System.out.println("Windowul curent cu URL " + webDriver.getCurrentUrl());

        windowMethods.switcSpecificTabWindow(0);

      //  webDriver.quit();

    }

}
