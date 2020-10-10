package java00_case_study_02.models;

import java.io.Serializable;

public abstract class Human implements Serializable {
    private String fullName;
    private String dateOfBirth;
    private String sex;
    private String idCard;
    private String numberPhone;
    private String email;
    private String address;

    public Human(String fullName, String dateOfBirth, String sex, String idCard, String numberPhone, String email, String address) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.idCard = idCard.replaceFirst("(\\d{3})(\\d{3})(\\d{3})", "$1-$2-$3");
        this.numberPhone = numberPhone.replaceFirst("(\\d{4})(\\d{3})(\\d{3})","$1-$2-$3");
        this.email = email;
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setdateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public abstract String showInFor();

}

