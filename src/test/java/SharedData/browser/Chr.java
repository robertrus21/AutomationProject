package SharedData.browser;

import PropertyUtility.PropertyUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.Map;

public class Chr implements  BrowserService{

    private WebDriver webDriver;

    public void openBrowser(Map<String, String> testData) {
        //aceasta metoda are ca scop sa deschida un chrome cu cu configurarile noastre
        ChromeOptions options = (ChromeOptions) getBrowserOptions(testData);
        webDriver = new ChromeDriver(options);
        webDriver.get(testData.get("url"));
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Override
    public Object getBrowserOptions(Map<String, String> testData) {
        //configuram optiunile pentru browserul nostru
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments(testData.get("gpu"));
        chromeOptions.addArguments(testData.get("infobars"));
        chromeOptions.addArguments(testData.get("extensions"));
        chromeOptions.addArguments(testData.get("sandbox"));

        if(testData.get("headless").isEmpty()){
            chromeOptions.addArguments(testData.get("hesadless"));
        }


        return chromeOptions;
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }
}
