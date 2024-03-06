package Tests;

import HelperMethods.ElementMethods;
import SharedData.SharedData;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class WebTableTest extends SharedData {
//    public WebDriver webDriver;

    @Test
    public void metodaTest(){
        ElementMethods elementMethods = new ElementMethods(getWebDriver());

        //deschidem un browser de chrome
//        webDriver=new ChromeDriver();
//        //accesam URL
//        webDriver.get("https://demoqa.com/");
//        //identificam un element din pagina web
//
//        //webDriver.manage().window().setSize(new Dimension(600,800));
//        webDriver.manage().window().maximize();
//
//        //facem un scrol la pagina

//        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
//        js.executeScript("window.scrollBy(0,350)", "");

        elementMethods.scrollElementByPyxel(0,350);

        WebElement consentField= getWebDriver().findElement(By.className("fc-button-label"));
        //consentField.click();
        elementMethods.clickElement(consentField);

        WebElement elementsField= getWebDriver().findElement(By.xpath("//h5[text()='Elements']"));
        elementMethods.clickElement(elementsField);

     //   js.executeScript("window.scrollBy(0,650)", "");

//        construit xpath in browser
        WebElement webTablesField= getWebDriver().findElement(By.xpath("//span[text()='Web Tables']"));
        elementMethods.clickElement(webTablesField);

//        copiat full xpath din browser
//        WebElement webTablesField1= webDriver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div/ul/li/span"));
//        webTablesField1.click();


        WebElement addField= getWebDriver().findElement(By.id("addNewRecordButton"));
        elementMethods.clickElement(addField);

        WebElement firstNameField= getWebDriver().findElement(By.id("firstName"));
        String firstNameValue="First Test";
        //firstNameField.sendKeys(firstNameValue);
        elementMethods.fillElement(firstNameField, firstNameValue);

        WebElement lastNameField= getWebDriver().findElement(By.id("lastName"));
        String lastNameValue="last Test";
        //lastNameField.sendKeys(lastNameValue);
        elementMethods.fillElement(lastNameField, lastNameValue);

        WebElement emailField= getWebDriver().findElement(By.id("userEmail"));
        String emailValue="user@email.com";
        elementMethods.fillElement(emailField, emailValue);

        WebElement ageField= getWebDriver().findElement(By.id("age"));
        String ageValue="30";
        //ageField.sendKeys(ageValue);
        elementMethods.fillElement(ageField, ageValue);

        WebElement salaryField= getWebDriver().findElement(By.id("salary"));
        String salaryValue="1000";
        salaryField.sendKeys(salaryValue);

        WebElement departmentField= getWebDriver().findElement(By.id("department"));
        String departmentValue="HR";
        departmentField.sendKeys(departmentValue);

        WebElement submitField= getWebDriver().findElement(By.id("submit"));
        elementMethods.clickElement(submitField);

        //modificam entry-ul adaugat mai sus

        WebElement editField=getWebDriver().findElement(By.id("edit-record-4"));
        elementMethods.clickElement(editField);

        WebElement firstNameModifyField=getWebDriver().findElement(By.id("firstName"));
        String firstNameModifyValue = "First Test22";
//        firstNameModifyField.clear();
//        firstNameModifyField.sendKeys(firstNameModifyValue);
        elementMethods.refillElement(firstNameModifyField, firstNameModifyValue);


        WebElement userAgeModifyField=getWebDriver().findElement(By.id("age"));
        String userAgeModifyValue = "40";
//        userAgeModifyField.clear();
//        userAgeModifyField.sendKeys(userAgeModifyValue);
        elementMethods.refillElement(userAgeModifyField, userAgeModifyValue);

        WebElement submitFieldEdit= getWebDriver().findElement(By.id("submit"));
        elementMethods.clickElement(submitFieldEdit);

        //sergem noul entry
        WebElement deleteField=getWebDriver().findElement(By.id("delete-record-4"));
        elementMethods.clickElement(deleteField);

        //inchidem un browser = quit
        //inchidem un tab = close
     //   webDriver.quit();


    }

}
