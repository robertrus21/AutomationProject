package HelperMethods;

import org.openqa.selenium.WebDriver;

public class FrameMethods {

    private WebDriver webDriver;

    public FrameMethods(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void switchSpecificIFrame (String value) {

        webDriver.switchTo().frame(value);
    }

    public void switchParentFeame () {
        webDriver.switchTo().parentFrame();
    }

}
