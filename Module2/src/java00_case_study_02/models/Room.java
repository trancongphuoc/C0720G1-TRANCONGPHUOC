package java00_case_study_02.models;

public class Room extends Service implements Comparable<Room>{
    private ServiceGoWithFree freeServiceGoWith;

    public Room(String idService, String nameService, double area, double cost, int amountOfPeople, String rentType, ServiceGoWithFree freeServiceGoWith) {
        super(idService, nameService, area, cost, amountOfPeople, rentType);
        this.freeServiceGoWith = freeServiceGoWith;
    }

    public ServiceGoWithFree getFreeServiceGoWith() {
        return freeServiceGoWith;
    }

    public void setFreeServiceGoWith(ServiceGoWithFree freeServiceGoWith) {
        this.freeServiceGoWith = freeServiceGoWith;
    }

    @Override
    public String toString() {
        return "Service{" +
                "ID Service='" + getIdService() + '\'' +
                ", Name Service='" + getNameService() + '\'' +
                ", Area=" + getArea() +
                ", Cost=" + getCost() +
                ", Amount of people=" + getAmountOfPeople() +
                ", Rent type='" + getRentType() + '\'' +
                "Service free go with='" + getFreeServiceGoWith() + '\'' +
                '}';

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
