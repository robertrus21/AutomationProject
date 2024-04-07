package SharedData;

import SharedData.browser.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;


public class SharedData {

    private WebDriver webDriver;

    @BeforeMethod
    public void prepDriver() {
        webDriver = new BrowserFactory().getBrowserInstance();
    }

    @AfterMethod
    public void afterDriver() {

        webDriver.quit();
    }

    public WebDriver getWebDriver() {

        return webDriver;
    }


}
