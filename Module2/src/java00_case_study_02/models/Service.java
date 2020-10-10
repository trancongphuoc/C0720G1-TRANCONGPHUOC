package java00_case_study_02.models;

import java.io.Serializable;

public abstract class Service implements Serializable {
    private String idService;
    private String nameService;
    private double area;
    private double cost;
    private int amountOfPeople;
    private String rentType;

    public Service(String idService, String nameService, double area, double cost, int amountOfPeople, String rentType) {
        this.idService = idService;
        this.nameService = nameService;
        this.area = area;
        this.cost = cost;
        this.amountOfPeople = amountOfPeople;
        this.rentType = rentType;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getAmountOfPeople() {
        return amountOfPeople;
    }

    public void setAmountOfPeople(int amountOfPeople) {
        this.amountOfPeople = amountOfPeople;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    public abstract String showInFor();


}
