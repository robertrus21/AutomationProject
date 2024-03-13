package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FramePage extends BasePage{
    public FramePage(WebDriver webDriver) {
        super(webDriver);
    }


    public void dealWithIFrame (){
        frameMethods.switchSpecificIFrame("frame1");
        System.out.println();
    }

    //tema de rezolvat asta
    //de facut elementele din paginile din Pages private
    //de refactorizat PracticeFormPage
}
