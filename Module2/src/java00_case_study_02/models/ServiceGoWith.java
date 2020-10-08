package java00_case_study_02.models;

import java.io.Serializable;

public class ServiceGoWith implements Serializable {
    private String name;
    private double cost;

    public ServiceGoWith(String name) {
        this.name = name;
        switch (name) {
            case "massage" :
                this.cost = 50;
                break;
            case "karaoke":
                this.cost = 300;
                break;
            case "food":
                this.cost = 100;
                break;
            case "drink":
                this.cost = 40;
                break;
            case "car":
                this.cost = 70;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }


    @Override
    public String toString() {
        return "ServiceGoWith{" +
                "Name Service='" + name + '\'' +
                ", Cost=" + cost +
                '}';
    }
}
