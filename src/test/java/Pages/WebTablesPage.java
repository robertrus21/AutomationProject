package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebTablesPage extends BasePage{

    public WebTablesPage(WebDriver webDriver) {
        super(webDriver);
    }
    @FindBy (xpath = "//span[text()='Web Tables']")
    private WebElement webTables;

    @FindBy (id = "addNewRecordButton")
    private WebElement addRecord;

    @FindBy (id = "firstName")
    private WebElement firstName;

    @FindBy (id = "lastName")
    private WebElement lastName;

    @FindBy (id = "userEmail")
    private WebElement userEmail;

    @FindBy (id = "age")
    private WebElement age;

    @FindBy (id = "salary")
    private WebElement salary;

    @FindBy (id = "department")
    private WebElement department;

    @FindBy (id = "submit")
    private WebElement submit;

    @FindBy (id = "edit-record-4")
    private WebElement editRecord;

    @FindBy (id = "firstName")
    private WebElement editFirstName;

    @FindBy (id = "age")
    private WebElement editAge;

    @FindBy (id = "submit")
    private WebElement editSubmit;

    @FindBy (id = "delete-record-4")
    private WebElement editDeleteRecord;

    public void webTablesField (){
        elementMethods.clickElement(webTables);
    }

    public void addField (){
        elementMethods.clickElement(addRecord);
    }

    public void firstNameField (String firstNameValue){
        elementMethods.fillElement(firstName, firstNameValue);
    }

    public void lastNameField (String lastNameValue){
        elementMethods.fillElement(lastName, lastNameValue);
    }

    public void emailField (String emailValue){
        elementMethods.fillElement(userEmail, emailValue);
    }

    public void ageField (String ageValue){
        elementMethods.fillElement(age, ageValue);
    }

    public void salaryField (String salaryValue){
        elementMethods.fillElement(salary, salaryValue);
    }

    public void departmentField (String departmentValue){
        elementMethods.fillElement(department, departmentValue);
    }

    public void submitField (){
        elementMethods.clickElement(submit);
    }

    public void editField (){
        elementMethods.clickElement(editRecord);
    }

    public void firstNameModifyField (String firstNameModifyValue){
        elementMethods.fillElement(editFirstName, firstNameModifyValue);
    }

    public void userAgeModifyField (String userAgeModifyField){
        elementMethods.fillElement(editAge, userAgeModifyField);
    }

    public void submitEdit(){
        elementMethods.clickElement(editSubmit);
    }

    public void deleteEdit(){
        elementMethods.clickElement(editDeleteRecord);
    }
}
