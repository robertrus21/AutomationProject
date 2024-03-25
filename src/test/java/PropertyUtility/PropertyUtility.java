package PropertyUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertyUtility {

    //aceasta clasa reprezinta interactiunea cu un fisier de proprietati
    //trebuie facuta o metoda de a incarca un fisier si sa citeasca datele fisierului

    private Properties properties;
    private FileInputStream fileInputStream;

    public PropertyUtility (String path){
        loadFile(path);
    }

    private void loadFile (String path){
        properties = new Properties();
        try {
            fileInputStream = new FileInputStream("src/main/resources/Data/"+path+".properties");
            properties.load(fileInputStream);
        } catch (Exception e) {

        }
    }

    public Map <String, String> getAllData(){
        Map <String, String> testData = new HashMap<>();
        for (String key: properties.stringPropertyNames()){
            testData.put(key, properties.getProperty(key));
        }
        return testData;
    }

}
