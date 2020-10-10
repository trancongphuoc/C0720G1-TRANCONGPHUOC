package java00_case_study_02.models;

import java.io.Serializable;

public class ServiceGoWithFree implements Serializable {
    String nameServiceGoWith;

    public ServiceGoWithFree(String nameServiceGoWith) {
        this.nameServiceGoWith = nameServiceGoWith;
    }

    public String getNameServiceGoWith() {
        return nameServiceGoWith;
    }

    public void setNameServiceGoWith(String nameServiceGoWith) {
        this.nameServiceGoWith = nameServiceGoWith;
    }

    @Override
    public String toString() {
        return "ServiceGoWithFree{" +
                "nameServiceGoWith='" + nameServiceGoWith + '\'' +
                '}';
    }
}
