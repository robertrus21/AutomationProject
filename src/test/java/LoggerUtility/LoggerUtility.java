package LoggerUtility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerUtility {

    //in aceasta clasa confoiguram metode pentrui a loga informatie
    //ne trebuie o metoda care sa reprezinte inceputul unui test, funalul unui test, info, error

    private static Logger logger = LogManager.getLogger();

    public static void startTestCase(String testCase) {
        logger.info("***** execution started:" + testCase+ "*****");
    }
    public static void finishTestCase(String testCase) {
        logger.info("***** execution finished:" + testCase+ "*****");
    }

    public static void infoTest(String message) {
        logger.info("???" + message+ "???");
    }

    public static void errorTest(String message) {
        logger.info("!!!" + message+ "!!!");
    }
}
