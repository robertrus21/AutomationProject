package Tests;

import HelperMethods.ElementMethods;
import SharedData.SharedData;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class PracticeFormTest extends SharedData{
//    public WebDriver webDriver;

    @Test
    public void metodaFormTest(){
        ElementMethods elementMetods = new ElementMethods(getWebDriver());


//        //deschidem un browser de chrome
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

        elementMetods.scrollElementByPyxel(0,350);

//        WebElement consentField= getWebDriver().findElement(By.className("fc-button-label"));
//        //consentField.click();
//        elementMetods.clickElement(consentField);

        WebElement elementsField= getWebDriver().findElement(By.xpath("//h5[text()='Forms']"));
        //elementsField.click();
        elementMetods.clickElement(elementsField);

        WebElement webTablesField= getWebDriver().findElement(By.xpath("//span[text()='Practice Form']"));
        //webTablesField.click();
        elementMetods.clickElement(webTablesField);

        WebElement firstNameField= getWebDriver().findElement(By.id("firstName"));
        String firstNameValue="First Test";
        //firstNameField.sendKeys(firstNameValue);
        elementMetods.fillElement(firstNameField, firstNameValue);

        //identificare dupa css

        WebElement lastNameField= getWebDriver().findElement(By.cssSelector("input[placeholder='Last Name']"));
        String lastNameValue="Last Test";
        //lastNameField.sendKeys(lastNameValue);
        elementMetods.fillElement(lastNameField, lastNameValue);

        WebElement emailUserField= getWebDriver().findElement(By.cssSelector("input[placeholder='name@example.com']"));
        String emailUserlValue="user@email.com";
        elementMetods.fillElement(emailUserField, emailUserlValue);

        WebElement telUserField= getWebDriver().findElement(By.cssSelector("input[placeholder='Mobile Number']"));
        String telUserlValue="0722334455";
        elementMetods.fillElement(telUserField, telUserlValue);

        WebElement dateOfBirthField = getWebDriver().findElement(By.cssSelector(".react-datepicker__input-container"));
        elementMetods.clickElement(dateOfBirthField);

        WebElement monthDateOfBirth = getWebDriver().findElement(By.cssSelector(".react-datepicker__month-select"));
//        Select monthSelect = new Select(monthDateOfBirth);
//        monthSelect.selectByVisibleText("August");
        String monthValue = "October";
        elementMetods.selectTextElement(monthDateOfBirth, monthValue);

        WebElement yearOfBirthField = getWebDriver().findElement(By.cssSelector(".react-datepicker__year-select"));
//        Select yearSelect = new Select(yearOfBirthField);
//        yearSelect.selectByValue("1992");
        String yearValue = "1992";
        elementMetods.selectValueElement(yearOfBirthField, yearValue);

        elementMetods.scrollElementByPyxel(0,350);

        List<WebElement> dayDateOfBirthFields = getWebDriver().findElements(By.xpath("//div[not(contains(@class,'react-datepicker__day--outside-month')) and  contains(@class,'react-datepicker__day') and contains(@class,'react-datepicker__day--')]"));
        String dayValue = "17";
        for (Integer i = 0; i < dayDateOfBirthFields.size(); i++){
            if(dayDateOfBirthFields.get(i).getText().equals(dayValue)){
                dayDateOfBirthFields.get(i).click();
                break;
            }
        }

        ////div[not(contains(@class,'react-datepicker__day--outside-month')) and  contains(@class,'react-datepicker__day') and contains(@class,'react-datepicker__day--')]
        ////div[not(contains(@class, 'outside-month')) and contains(@class, 'react-datepicker__day react-datepicker__day')]

        String genderValue = "Male";
        WebElement genderUserField= getWebDriver().findElement(By.cssSelector("label[for='gender-radio-1']"));
        genderUserField.click();
        //js.executeScript("arguments[0].click();", genderUserField);
        //lementMetods.fillElement(genderUserField, genderValue);


        //facem un algoritm care sa imi selecteze valorile pe care i le specific

        List<String> hobbies = Arrays.asList("Sports", "Music", "Reading");
        List<WebElement> hobbyList = getWebDriver().findElements(By.xpath("//div[@id='hobbiesWrapper']//label[@class='custom-control-label']"));
        for (Integer index = 0; index < hobbyList.size(); index++) {
            String curentElementText = hobbyList.get(index).getText();
            if (hobbies.contains(curentElementText)) {
                hobbyList.get(index).click();
                //js.executeScript("arguments[0].click();", hobbyList.get(index));
            }
        }

//        List<String> hobbies = Arrays.asList("Sports", "Reading");
//        List<WebElement> hobbyList = webDriver.findElements(By.xpath("//div[@id='hobbiesWrapper']//label[@class='custom-control-label']"));
//        for (WebElement webElement : hobbyList) {
//            String currentElementText = webElement.getText();
//            if (hobbies.contains(currentElementText)) {
//                webElement.click();
//            }
//        }

        //WebElement sportUserField= webDriver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
        //sportUserField.click();

//        WebElement dateUserField= getWebDriver().findElement(By.id("dateOfBirthInput"));
//        dateUserField.click();

        String subjectValue = "Economics";
        WebElement subjectFields=getWebDriver().findElement(By.id("subjectsInput"));
        subjectFields.sendKeys("Economics");
        subjectFields.sendKeys(Keys.ENTER);

        WebElement pictureField=getWebDriver().findElement(By.id("uploadPicture"));
        String filePath = "src/main/resources/_641bb355-f197-41e7-982b-467bd6a6652c.jpg";
//        pictureField.sendKeys(new File("src/main/resources/_641bb355-f197-41e7-982b-467bd6a6652c.jpg").getAbsolutePath());
        elementMetods.fillElement(pictureField, new File(filePath).getAbsolutePath());

        WebElement adressField=getWebDriver().findElement(By.cssSelector("textarea[placeholder='Current Address']"));
        String adresValue="ADRESA";
        elementMetods.fillElement(adressField, adresValue);

        //scrol in pagina
        //js.executeScript("")

        WebElement subjectField=getWebDriver().findElement(By.xpath("//div[text()='Select State']"));
        //subjectField.click();
        //js.executeScript("arguments[0].click();", subjectField);
        elementMetods.clickElement(subjectField);

//        WebElement subField=getWebDriver().findElement(By.xpath("//div[text()='Select State'"));
//        subField.click();
//        //js.executeScript("arguments[0].click();", cityField);
//
        String stateName = "NCR";
        WebElement subjectInputField=getWebDriver().findElement(By.id("react-select-3-input"));
        subjectInputField.sendKeys("NCR");
        subjectInputField.sendKeys(Keys.ENTER);
//
        WebElement cityField=getWebDriver().findElement(By.xpath("//div[text()='Select City']"));
        cityField.click();
        //js.executeScript("arguments[0].click();", cityField);
//
        String cityName = "Delhi";
        WebElement cityInputField=getWebDriver().findElement(By.id("react-select-4-input"));
        cityInputField.sendKeys("Delhi");
        cityInputField.sendKeys(Keys.ENTER);

//
        WebElement submit=getWebDriver().findElement(By.id("submit"));
        elementMetods.clickElement(submit);


//
//      //validam tabelul cu valori
//
        List<WebElement> labelFields = getWebDriver().findElements(By.xpath("//table/tbody/tr/td[1]"));
        List<WebElement> valueFields = getWebDriver().findElements(By.xpath("//table/tbody/tr/td[2]"));

        //ii amintesc la Alex dupa ce facem obiecte si constructori!

        Assert.assertEquals(labelFields.get(0).getText(), "Student Name");
        Assert.assertEquals(valueFields.get(0).getText(), firstNameValue + " " + lastNameValue);

        Assert.assertEquals(labelFields.get(1).getText(), "Student Email");
        Assert.assertEquals(valueFields.get(1).getText(), emailUserlValue);

        Assert.assertEquals(labelFields.get(2).getText(), "Gender");
        Assert.assertEquals(valueFields.get(2).getText(), genderValue);

        Assert.assertEquals(labelFields.get(3).getText(), "Mobile");
        Assert.assertEquals(valueFields.get(3).getText(), telUserlValue);

        Assert.assertEquals(labelFields.get(4).getText(), "Date of Birth");
        //trebuie completata validarea cu data nasterii

        Assert.assertEquals(labelFields.get(5).getText(), "Subjects");
        Assert.assertEquals(valueFields.get(5).getText(), subjectValue);

        Assert.assertEquals(labelFields.get(6).getText(), "Hobbies");
        for(Integer index = 0; index < hobbies.size(); index ++){
            Assert.assertTrue(valueFields.get(6).getText().contains(hobbies.get(index)));
        }

        Assert.assertEquals(labelFields.get(7).getText(), "Picture");
        String[] arrayFile = filePath.split("/");
        Integer desiredIndex = arrayFile.length -1;
        Assert.assertEquals(valueFields.get(7).getText(), arrayFile[desiredIndex]);

        //tema restul

        Assert.assertEquals(labelFields.get(8).getText(), "Address");
        Assert.assertEquals(valueFields.get(8).getText(), adresValue);

        Assert.assertEquals(labelFields.get(9).getText(), "State and City");
        Assert.assertEquals(valueFields.get(9).getText(), stateName + " " + cityName);

    }

}
