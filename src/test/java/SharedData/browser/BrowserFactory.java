package SharedData.browser;

import PropertyUtility.PropertyUtility;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

public class BrowserFactory {

    //aplicam design patternul factory method ca sa definim un obiect care sa primeasca o instanta diferita de browser
    public WebDriver getBrowserInstance (){
        PropertyUtility propertyUtility = new PropertyUtility("atfData");
        Map<String, String> browserData = propertyUtility.getAllData();
        String cicd = System.getProperty("cicd");
        String browser = System.getProperty("browser");
        if(Boolean.parseBoolean(cicd)){
            browserData.put("headless", "--headless=new");
        }else {
            browser = browserData.get("browser");
        }

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println(browser);

        switch (browser){
            case "chrome":
                Chr chromeService = new Chr();
                chromeService.openBrowser(browserData);
                return chromeService.getWebDriver();
            case "edge":
                Edge edgeService = new Edge();
                edgeService.openBrowser(browserData);
                return edgeService.getWebDriver();
        }
        return null;
    }

}
