package Tests;

import HelperMethods.ElementMethods;
import ObjectData.WebTableObject;
import Pages.HomePage;
import Pages.WebTablesPage;
import PropertyUtility.PropertyUtility;
import SharedData.SharedData;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class WebTableTest extends SharedData {
    @Test
    public void metodaTest(){

        PropertyUtility propertyUtility = new PropertyUtility("WebTableData");
        WebTableObject webTableObject = new WebTableObject(propertyUtility.getAllData());

        HomePage homePage = new HomePage(getWebDriver());
        homePage.navidateWebTablePage();
        WebTablesPage webTablesPage = new WebTablesPage(getWebDriver());

        webTablesPage.webTablesField();
        webTablesPage.addField();
        webTablesPage.firstNameField(webTableObject);
        webTablesPage.lastNameField(webTableObject);
        webTablesPage.emailField(webTableObject);
        webTablesPage.ageField(webTableObject);
        webTablesPage.salaryField(webTableObject);
        webTablesPage.departmentField(webTableObject);
        webTablesPage.submitField();
        webTablesPage.editField();
        webTablesPage.firstNameModifyField(webTableObject);
        webTablesPage.userAgeModifyField(webTableObject);
        webTablesPage.submitEdit();
        webTablesPage.deleteEdit();

    }

}
