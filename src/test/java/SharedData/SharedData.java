package SharedData;

import SharedData.browser.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;


public class SharedData {

    private WebDriver getwebDriver;


    public void prepDriver() {
        getwebDriver = new BrowserFactory().getBrowserInstance();
    }


    public void afterDriver() {

        getwebDriver.quit();
    }

    public WebDriver getWebDriver() {

        return getwebDriver;
    }




}
