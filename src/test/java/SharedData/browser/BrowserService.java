package SharedData.browser;

import java.util.HashMap;
import java.util.Map;

public interface BrowserService {

    void openBrowser(Map<String, String> testData);

    Object getBrowserOptions(Map<String, String> testData);
}
