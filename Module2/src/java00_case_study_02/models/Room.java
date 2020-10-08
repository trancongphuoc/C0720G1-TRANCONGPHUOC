package java00_case_study_02.models;

public class Room extends Service implements Comparable<Room>{
    private String freeServiceGoWith;

    public Room(String idService, String nameService, double area, double cost, int amountOfPeople, String rentType) {
        super(idService, nameService, area, cost, amountOfPeople, rentType);
        this.freeServiceGoWith = "Eating and drinking";
    }

    public String getFreeServiceGoWith() {
        return freeServiceGoWith;
    }

    public void setFreeServiceGoWith(String freeServiceGoWith) {
        this.freeServiceGoWith = freeServiceGoWith;
    }

    @Override
    public String showInFor() {
        return  "\nID Service: " + getIdService() +
                "\nName Service: " + getNameService() +
                "\nArea Used: " + getArea() + " m^2" +
                "\nRent Type: " + getRentType() +
                "\nCost: " + getCost() + " $" +
                "\nAmount Of People: " + getAmountOfPeople() +
                "\nFree Service Go With: " + getFreeServiceGoWith() + "\n";
    }

    @Override
    public int compareTo(Room o) {
        return getNameService().compareTo(o.getNameService());
    }
}
