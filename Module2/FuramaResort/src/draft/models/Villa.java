package draft.models;

public class Villa extends Service {
    private String standardRoom;
    private String description;
    private float poolArea;
    private int numberOfFloor;

    public Villa(String idService, String nameService, float area, int cost, int amountOfPeople,
                 String rentType, String standardRoom, String description, float poolArea, int numberOfFloor) {
        super(idService, nameService, area, cost, amountOfPeople, rentType);
        this.standardRoom = standardRoom;
        this.description = description;
        this.poolArea = poolArea;
        this.numberOfFloor = numberOfFloor;
    }

    public Villa(String standardRoom, String description, int poolArea, int numberOfFloor) {
        this.standardRoom = standardRoom;
        this.description = description;
        this.poolArea = poolArea;
        this.numberOfFloor = numberOfFloor;
    }

    public Villa() {
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

    public float getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(float poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }


    @Override
    public String showInfo() {
        return  "\nMã dịch vụ: " + getIdService() +
                "\nTên dịch vụ: " + getNameService() +
                "\nMô tả: " + getDescription() +
                "\nTiêu chuẩn phòng: " + getStandardRoom() +
                "\nDiện tích sử dụng: " + getUsedArea() + " m^2" +
                "\nChi phí thuê: " + getCost() + " $" +
                "\nSố lượng người tối đa: " + getAmountOfPeople() + " nguoi" +
                "\nKiểu thuê: " + getRentType() +
                "\nDiện tích hồ bơi: " + getPoolArea() + " m^2" +
                "\nSố tầng: " + getNumberOfFloor() + " tang\n";
    }
}
