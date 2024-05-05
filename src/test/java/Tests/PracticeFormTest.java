package Tests;

import ObjectData.PracticeFormObject;
import Pages.FormsPage;
import Pages.HomePage;
import Pages.PracticeFormPage;
import PropertyUtility.PropertyUtility;
import SharedData.Hooks;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class PracticeFormTest extends Hooks {
    //public WebDriver webDriver;

    @Test
    public void metodaFormTest() {
        PropertyUtility propertyUtility = new PropertyUtility("PracticeFormData");
        PracticeFormObject practiceFormObject = new PracticeFormObject(propertyUtility.getAllData());
        HomePage homePage = new HomePage(getWebDriver());
        homePage.navigateFormsPage();
//d
        FormsPage formsPage = new FormsPage(getWebDriver());
        formsPage.navigateToPracticeForm();
        PracticeFormPage practiceFormPage = new PracticeFormPage(getWebDriver());

//        String firstNameValue="First Test";
//        String lastNameValue="Last Test";
//        String emailUserlValue="user@email.com";
//        String telUserlValue="0722334455";
//        String monthValue = "October";
//        String yearValue = "1992";
//        String dayValue = "17";
//        String genderValue = "Male";
//        List<String> hobbies = Arrays.asList("Sports", "Music", "Reading");
//        String subjectValue = "Economics";
//        String filePath = "src/main/resources/_641bb355-f197-41e7-982b-467bd6a6652c.jpg";
//        String adresValue="ADRESA";
//        String stateName = "NCR";
//        String cityName = "Delhi";

        practiceFormPage.fillEntireForm(practiceFormObject);
        practiceFormPage.validatePracticeFormTable(practiceFormObject);

    }

    //tema alertstest sau testele care mai au entryuri

}
