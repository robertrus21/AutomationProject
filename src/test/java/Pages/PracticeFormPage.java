package Pages;

import ObjectData.PracticeFormObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class PracticeFormPage extends BasePage{


    public PracticeFormPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy (id = "firstName")
    private WebElement firstNameField;
    @FindBy (css = "input[placeholder='Last Name']")
    private WebElement lastNameField;
    @FindBy (css = "input[placeholder='name@example.com']")
    private WebElement emailUserField;
    @FindBy (css = "input[placeholder='Mobile Number']")
    private WebElement telUserField;
    @FindBy (css = ".react-datepicker__input-container")
    private WebElement dateOfBirthField;
    @FindBy (css = ".react-datepicker__month-select")
    private WebElement monthDateOfBirth;
    @FindBy (css = ".react-datepicker__year-select")
    private WebElement yearOfBirthField;
    @FindBy (xpath = "//div[not(contains(@class,'react-datepicker__day--outside-month')) and  contains(@class,'react-datepicker__day') and contains(@class,'react-datepicker__day--')]")
    private List<WebElement> dayDateOfBirthFields;
    @FindBy (css = "label[for='gender-radio-1']")
    private WebElement genderUserField;
    @FindBy (xpath = "//div[@id='hobbiesWrapper']//label[@class='custom-control-label']")
    private List<WebElement> hobbyList;
    @FindBy (id = "subjectsInput")
    private WebElement subjectFields;
    @FindBy (id = "uploadPicture")
    private WebElement pictureField;
    @FindBy (css = "textarea[placeholder='Current Address']")
    private WebElement adressField;
    @FindBy (xpath = "//div[text()='Select State']")
    private WebElement subjectField;
    @FindBy (id = "react-select-3-input")
    private WebElement subjectInputField;
    @FindBy (xpath = "//div[text()='Select City']")
    private WebElement cityField;
    @FindBy (id = "react-select-4-input")
    private WebElement cityInputField;
    @FindBy (id = "submit")
    private WebElement submit;
    @FindBy (xpath = "//table/tbody/tr/td[1]")
    private List<WebElement> labelFields;
    @FindBy (xpath = "//table/tbody/tr/td[2]")
    private List<WebElement> valueFields;

    public void fillFirstName (String firstNameValue){
        elementMethods.fillElement(firstNameField, firstNameValue);
    }

    public void fillLirstName (String lastNameValue){
        elementMethods.fillElement(lastNameField, lastNameValue);
    }

    public void fillEmail (String emailValue){
        elementMethods.fillElement(emailUserField, emailValue);
    }

    public void fillNumber (String numberValue){
        elementMethods.fillElement(telUserField, numberValue);
    }

    public void fillBirthDate (String monthValue, String yearValue, String dayValue ){
        elementMethods.clickElement(dateOfBirthField);

        elementMethods.selectTextElement(monthDateOfBirth, monthValue);

        elementMethods.selectValueElement(yearOfBirthField, yearValue);

        elementMethods.scrollElementByPyxel(0,350);
        //List<WebElement> dayDateOfBirthFields = webDriver.findElements(By.xpath("//div[not(contains(@class,'react-datepicker__day--outside-month')) and  contains(@class,'react-datepicker__day') and contains(@class,'react-datepicker__day--')]"));
        for (Integer i = 0; i < dayDateOfBirthFields.size(); i++){
            if(dayDateOfBirthFields.get(i).getText().equals(dayValue)){
                dayDateOfBirthFields.get(i).click();
                break;
            }
        }
    }

    public void fillgender (String genderValue){
        genderUserField.click();
    }

    public void fillHobbies (List<String> hobbies) {
        for (Integer index = 0; index < hobbyList.size(); index++) {
            String curentElementText = hobbyList.get(index).getText();
            if (hobbies.contains(curentElementText)) {
                hobbyList.get(index).click();
                //elementMethods.clickElemForce(hobbyList.get(index));
            }

        }
    }
    public void fillSubject (String subjectValue){
        elementMethods.fillPress(subjectFields, subjectValue);
    }

    public void fillPicture (String pictureValue){
        elementMethods.fillElement(pictureField, new File(pictureValue).getAbsolutePath());
    }

    public void fillAdress (String adressValue){
        elementMethods.fillElement(adressField, adressValue);
    }

    public void fillState (String stateValue){
        elementMethods.fillState(subjectField, subjectInputField, stateValue);
    }
    public void fillCity (String subjectInputValue){
        elementMethods.fillState(cityField, cityInputField, subjectInputValue);
    }

    public void submit (){
        elementMethods.clickElement(submit);
    }

    public void validatePracticeFormTable (PracticeFormObject practiceFormObject){

        //validam tabelul cu valori

        //ii amintesc la Alex dupa ce facem obiecte si constructori!

        Assert.assertEquals(labelFields.get(0).getText(), "Student Name");
        Assert.assertEquals(valueFields.get(0).getText(), practiceFormObject.getFirstNameValue() + " " + practiceFormObject.getLastNameValue());

        Assert.assertEquals(labelFields.get(1).getText(), "Student Email");
        Assert.assertEquals(valueFields.get(1).getText(), practiceFormObject.getEmailUserlValue());

        Assert.assertEquals(labelFields.get(2).getText(), "Gender");
        Assert.assertEquals(valueFields.get(2).getText(), practiceFormObject.getGenderValue());

        Assert.assertEquals(labelFields.get(3).getText(), "Mobile");
        Assert.assertEquals(valueFields.get(3).getText(), practiceFormObject.getTelUserlValue());

        Assert.assertEquals(labelFields.get(4).getText(), "Date of Birth");
        Assert.assertEquals(valueFields.get(4).getText(), practiceFormObject.getDayValue() + " " + practiceFormObject.getMonthValue() + "," + practiceFormObject.getYearValue());


        Assert.assertEquals(labelFields.get(5).getText(), "Subjects");
        Assert.assertEquals(valueFields.get(5).getText(), practiceFormObject.getSubjectValue());

        Assert.assertEquals(labelFields.get(6).getText(), "Hobbies");
        for(Integer index = 0; index < practiceFormObject.getHobbies().size(); index ++){
            Assert.assertTrue(valueFields.get(6).getText().contains(practiceFormObject.getHobbies().get(index)));
        }

        Assert.assertEquals(labelFields.get(7).getText(), "Picture");
        String[] arrayFile = practiceFormObject.getFilePath().split("/");
        Integer desiredIndex = arrayFile.length -1;
        Assert.assertEquals(valueFields.get(7).getText(), arrayFile[desiredIndex]);

        //tema restul

        Assert.assertEquals(labelFields.get(8).getText(), "Address");
        Assert.assertEquals(valueFields.get(8).getText(), practiceFormObject.getAdresValue());

        Assert.assertEquals(labelFields.get(9).getText(), "State and City");
        Assert.assertEquals(valueFields.get(9).getText(), practiceFormObject.getStateName() + " " + practiceFormObject.getCityName());

    }

    public void fillEntireForm (PracticeFormObject practiceFormObject) {

        fillFirstName(practiceFormObject.getFirstNameValue());
        fillLirstName(practiceFormObject.getLastNameValue());
        fillEmail(practiceFormObject.getEmailUserlValue());
        fillgender(practiceFormObject.getGenderValue());
        fillNumber(practiceFormObject.getTelUserlValue());
        fillBirthDate(practiceFormObject.getMonthValue(), practiceFormObject.getYearValue(), practiceFormObject.getDayValue());
        fillSubject(practiceFormObject.getSubjectValue());
        fillHobbies(practiceFormObject.getHobbies());
        fillPicture(practiceFormObject.getFilePath());
        fillAdress(practiceFormObject.getAdresValue());
        fillState(practiceFormObject.getStateName());
        fillCity(practiceFormObject.getCityName());
        submit();

    }

}