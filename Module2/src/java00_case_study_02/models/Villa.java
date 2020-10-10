package java00_case_study_02.models;

public class Villa extends Service implements Comparable<Villa> {
    private String standardRoom;
    private String description;
    private double poolArea;
    private int numberOfFloor;

    public Villa(String idService, String nameService, double area, double cost,
                 int amountOfPeople, String rentType, String standardRoom,
                 String description, double poolArea, int numberOfFloor) {
        super(idService, nameService, area, cost, amountOfPeople, rentType);
        this.standardRoom = standardRoom;
        this.description = description;
        this.poolArea = poolArea;
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

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
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
                ", Pool area=" + getPoolArea() +
                ", Number of floor=" + getNumberOfFloor() +
                '}';
    }

    @Override
    public String showInFor() {
        return  "\nID Service: " + getIdService() +
                "\nName Service: " + getNameService() +
                "\nArea Used: " + getArea() + " m^2" +
                "\nRent Type: " + getRentType() +
                "\nDescription: " + getDescription() +
                "\nStandard Room: " + getStandardRoom() +
                "\nCost: " + getCost() + " $" +
                "\nAmount Of People: " + getAmountOfPeople() +
                "\nPool Area: " + getPoolArea() + " m^2" +
                "\nNumber Of Floor: " + getNumberOfFloor() + "\n";
    }


    @Override
    public int compareTo(Villa o) {
        return getNameService().compareTo(o.getNameService());
    }
}
