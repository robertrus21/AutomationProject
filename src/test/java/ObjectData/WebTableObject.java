package ObjectData;

import java.util.Map;

public class WebTableObject {
    private String firstNameValue;
    private String lastNameValue;
    private String emailValue;
    private String ageValue;
    private String salaryValue;
    private String departmentValue;
    private String firstNameModifyValue;
    private String userAgeModifyValue;

    //facem o metoda care sa mapeze datele dn fisierul de resursa cu reprezentarea acestui obiect

    public WebTableObject (Map<String, String> testData){
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
                case "emailValue":
                    setEmailValue(testData.get(key));
                    break;
                case "ageValue":
                    setAgeValue(testData.get(key));
                    break;
                case "salaryValue":
                    setSalaryValue(testData.get(key));
                    break;
                case "departmentValue":
                    setDepartmentValue(testData.get(key));
                    break;
                case "firstNameModifyValue":
                    setFirstNameModifyValue(testData.get(key));
                    break;
                case "userAgeModifyValue":
                    setUserAgeModifyValue(testData.get(key));
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

    public String getEmailValue() {
        return emailValue;
    }

    public void setEmailValue(String emailValue) {
        this.emailValue = emailValue;
    }

    public String getAgeValue() {
        return ageValue;
    }

    public void setAgeValue(String ageValue) {
        this.ageValue = ageValue;
    }

    public String getSalaryValue() {
        return salaryValue;
    }

    public void setSalaryValue(String salaryValue) {
        this.salaryValue = salaryValue;
    }

    public String getDepartmentValue() {
        return departmentValue;
    }

    public void setDepartmentValue(String departmentValue) {
        this.departmentValue = departmentValue;
    }

    public String getFirstNameModifyValue() {
        return firstNameModifyValue;
    }

    public void setFirstNameModifyValue(String firstNameModifyValue) {
        this.firstNameModifyValue = firstNameModifyValue;
    }

    public String getUserAgeModifyValue() {
        return userAgeModifyValue;
    }

    public void setUserAgeModifyValue(String userAgeModifyValue) {
        this.userAgeModifyValue = userAgeModifyValue;
    }
}
