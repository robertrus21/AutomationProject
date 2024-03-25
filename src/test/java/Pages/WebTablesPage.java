package Pages;

import ObjectData.WebTableObject;
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

    public void firstNameField (WebTableObject webTableObject){
        elementMethods.fillElement(firstName, webTableObject.getFirstNameValue());
    }

    public void lastNameField (WebTableObject webTableObject){
        elementMethods.fillElement(lastName, webTableObject.getLastNameValue());
    }

    public void emailField (WebTableObject webTableObject){
        elementMethods.fillElement(userEmail, webTableObject.getEmailValue());
    }

    public void ageField (WebTableObject webTableObject){
        elementMethods.fillElement(age, webTableObject.getAgeValue());
    }

    public void salaryField (WebTableObject webTableObject){
        elementMethods.fillElement(salary, webTableObject.getSalaryValue());
    }

    public void departmentField (WebTableObject webTableObject){
        elementMethods.fillElement(department, webTableObject.getDepartmentValue());
    }

    public void submitField (){
        elementMethods.clickElement(submit);
    }

    public void editField (){
        elementMethods.clickElement(editRecord);
    }

    public void firstNameModifyField (WebTableObject webTableObject){
        elementMethods.fillElement(editFirstName, webTableObject.getFirstNameModifyValue());
    }

    public void userAgeModifyField (WebTableObject webTableObject){
        elementMethods.fillElement(editAge, webTableObject.getUserAgeModifyValue());
    }

    public void submitEdit(){
        elementMethods.clickElement(editSubmit);
    }

    public void deleteEdit(){
        elementMethods.clickElement(editDeleteRecord);
    }
}
