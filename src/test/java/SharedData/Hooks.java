package SharedData;

import LoggerUtility.LoggerUtility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Hooks extends SharedData{

    private String testName;
    @BeforeMethod
    public void prepareEnvironment() {
        testName = this.getClass().getSimpleName();
        LoggerUtility.startTestCase(testName);
        prepDriver();
        LoggerUtility.infoTest("driver open success");
    }

    @AfterMethod
    public void clearEnvironment() {
        testName = this.getClass().getSimpleName();
        LoggerUtility.finishTestCase(testName);
        afterDriver();
        LoggerUtility.infoTest("driver close success");
    }
}
