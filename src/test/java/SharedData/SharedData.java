package SharedData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;


public class SharedData {

    private WebDriver webDriver;

    @BeforeMethod
    public void prepDriver() {
        webDriver = new ChromeDriver();
        webDriver.get("https://demoqa.com/");
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void afterDriver() {

        webDriver.quit();
    }

    public WebDriver getWebDriver() {

        return webDriver;
    }


}
