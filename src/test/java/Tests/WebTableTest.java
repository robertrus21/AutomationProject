package Tests;

import HelperMethods.ElementMethods;
import Pages.HomePage;
import Pages.WebTablesPage;
import SharedData.SharedData;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class WebTableTest extends SharedData {
    @Test
    public void metodaTest(){
        HomePage homePage = new HomePage(getWebDriver());
        homePage.navidateWebTablePage();
        WebTablesPage webTablesPage = new WebTablesPage(getWebDriver());

        String firstNameValue="First Test";
        String lastNameValue="last Test";
        String emailValue="user@email.com";
        String ageValue="30";
        String salaryValue="1000";
        String departmentValue="HR";
        String firstNameModifyValue = "First Test22";
        String userAgeModifyValue = "40";

        webTablesPage.webTablesField();
        webTablesPage.addField();
        webTablesPage.firstNameField(firstNameValue);
        webTablesPage.lastNameField(lastNameValue);
        webTablesPage.emailField(emailValue);
        webTablesPage.ageField(ageValue);
        webTablesPage.salaryField(salaryValue);
        webTablesPage.departmentField(departmentValue);
        webTablesPage.submitField();
        webTablesPage.editField();
        webTablesPage.firstNameModifyField(firstNameModifyValue);
        webTablesPage.userAgeModifyField(userAgeModifyValue);
        webTablesPage.submitEdit();
        webTablesPage.deleteEdit();

    }

}
