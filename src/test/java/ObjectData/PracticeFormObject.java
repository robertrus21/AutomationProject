package ObjectData;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class PracticeFormObject extends GeneralObject{

    private String firstNameValue;
    private String lastNameValue;
    private String emailUserlValue;
    private String telUserlValue;
    private String monthValue;
    private String yearValue;
    private String dayValue;
    private String genderValue;
    private List<String> hobbies;
    private String subjectValue;
    private String filePath;
    private String adresValue;
    private String stateName;
    private String cityName;

    public PracticeFormObject (Map<String, String> testData){
        prepareObject(testData);
    }

    private void prepareObject (Map<String, String> testData){
        for (String key: testData.keySet()){
            switch (key){
                case "firstNameValue":
                    setFirstNameValue(testData.get(key));
                    break;
                case "lastNameValue":
                    setLastNameValue(testData.get(key));
                    break;
                case "emailUserlValue":
                    setEmailUserlValue(testData.get(key));
                    break;
                case "telUserlValue":
                    setTelUserlValue(testData.get(key));
                    break;
                case "monthValue":
                    setMonthValue(testData.get(key));
                    break;
                case "yearValue":
                    setYearValue(testData.get(key));
                    break;
                case "dayValue":
                    setDayValue(testData.get(key));
                    break;
                case "genderValue":
                    setGenderValue(testData.get(key));
                    break;
                case "hobbies":
                    hobbies = getPreparedValues(testData.get(key));
                    break;
                case "subjectValue":
                    setSubjectValue(testData.get(key));
                    break;
                case "filePath":
                    setFilePath(testData.get(key));
                    break;
                case "adresValue":
                    setAdresValue(testData.get(key));
                    break;
                case "stateName":
                    setStateName(testData.get(key));
                    break;
                case "cityName":
                    setCityName(testData.get(key));
                    break;

            }
        }
    }

    public String getFirstNameValue() {
        return firstNameValue;
    }

    public void setFirstNameValue(String firstNameValue) {
        this.firstNameValue = firstNameValue;
    }

    public String getLastNameValue() {
        return lastNameValue;
    }

    public void setLastNameValue(String lastNameValue) {
        this.lastNameValue = lastNameValue;
    }

    public String getEmailUserlValue() {
        return emailUserlValue;
    }

    public void setEmailUserlValue(String emailUserlValue) {
        this.emailUserlValue = emailUserlValue;
    }

    public String getTelUserlValue() {
        return telUserlValue;
    }

    public void setTelUserlValue(String telUserlValue) {
        this.telUserlValue = telUserlValue;
    }

    public String getMonthValue() {
        return monthValue;
    }

    public void setMonthValue(String monthValue) {
        this.monthValue = monthValue;
    }

    public String getYearValue() {
        return yearValue;
    }

    public void setYearValue(String yearValue) {
        this.yearValue = yearValue;
    }

    public String getDayValue() {
        return dayValue;
    }

    public void setDayValue(String dayValue) {
        this.dayValue = dayValue;
    }

    public String getGenderValue() {
        return genderValue;
    }

    public void setGenderValue(String genderValue) {
        this.genderValue = genderValue;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public String getSubjectValue() {
        return subjectValue;
    }

    public void setSubjectValue(String subjectValue) {
        this.subjectValue = subjectValue;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getAdresValue() {
        return adresValue;
    }

    public void setAdresValue(String adresValue) {
        this.adresValue = adresValue;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
