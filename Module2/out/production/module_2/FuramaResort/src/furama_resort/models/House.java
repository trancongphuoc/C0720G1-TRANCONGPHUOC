package furama_resort.models;

import furama_resort.controllers._00_main_menu.MainMenu;

public class House extends Service implements Comparable<House> {
    private String standardRoom;
    private String description;
    private int numberOfFloor;

    public House(String idService, String nameService, double area, double cost, int amountOfPeople, String rentType, String standardRoom, String description, int numberOfFloor) {
        super(idService, nameService, area, cost, amountOfPeople, rentType);
        this.standardRoom = standardRoom;
        this.description = description;
        this.numberOfFloor = numberOfFloor;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String toString() {
        return "Service{" +
                "ID Service='" + getIdService() + '\'' +
                ", Name service='" + getNameService() + '\'' +
                ", Area=" + getArea() +
                ", Cost=" + getCost() +
                ", Amount of people=" + getAmountOfPeople() +
                ", Rent type='" + getRentType() + '\'' +
                "Standard room='" + getStandardRoom() + '\'' +
                ", Description='" + getDescription() + '\'' +
                ", Number of floor=" + getNumberOfFloor() +
                '}';
    }


    public String addInFileCSV() {
        return getIdService() + MainMenu.COMA +
                getNameService() + MainMenu.COMA +
                getArea() + MainMenu.COMA +
                getCost() + MainMenu.COMA +
                getAmountOfPeople() + MainMenu.COMA +
                getRentType() + MainMenu.COMA +
                getStandardRoom() + MainMenu.COMA +
                getDescription() + MainMenu.COMA +
                getNumberOfFloor();

    }

    @Override
    public String showInFor() {
        return "\nID Service: " + getIdService() +
                "\nName Service: " + getNameService() +
                "\nArea Used: " + getArea() + " m^2" +
                "\nRent Type: " + getRentType() +
                "\nDescription: " + getDescription() +
                "\nStandard Room: " + getStandardRoom() +
                "\nCost: " + getCost() + " $" +
                "\nAmount Of People: " + getAmountOfPeople() +
                "\nNumber Of Floor: " + getNumberOfFloor() + "\n";
    }

    @Override
    public int compareTo(House o) {
        return getNameService().compareTo(o.getNameService());
    }
}
