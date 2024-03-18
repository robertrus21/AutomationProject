package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FramePage extends BasePage{
    public FramePage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id = "sampleHeading")
    private WebElement thisIs;

    public void dealWithIFrame (){
        frameMethods.switchSpecificIFrame("frame1");
        System.out.println(thisIs.getText());
//        webDriver.switchTo().parentFrame();
        frameMethods.switchParentFeame();
        frameMethods.switchSpecificIFrame("frame2");
        System.out.println(thisIs.getText());
    }

    //tema de rezolvat asta
    //de facut elementele din paginile din Pages private
    //de refactorizat PracticeFormPage
}
