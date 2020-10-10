package draft.models;

public class House extends Service {
    private String standardRoom;
    private String decription;
    private int numberOfFloor;

    public House(String idService, String nameService, float area, int cost,
                 int amountOfPeople, String rentType, String standardRoom, String decription, int numberOfFloor) {
        super(idService, nameService, area, cost, amountOfPeople, rentType);
        this.standardRoom = standardRoom;
        this.decription = decription;
        this.numberOfFloor = numberOfFloor;
    }

    public House(String standardRoom, String decription, int numberOfFloor) {
        this.standardRoom = standardRoom;
        this.decription = decription;
        this.numberOfFloor = numberOfFloor;
    }

    public House() {
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }


    @Override
    public String showInfo() {
        return "\nMã dịch vụ: " + getIdService() +
                "\nTên dịch vụ: " + getNameService() +
                "\nMô tả: " + getDecription() +
                "\nTiêu chuẩn phòng: " + getStandardRoom() +
                "\nDiện tích sử dụng: " + getUsedArea() + " m^2" +
                "\nChi phí thuê: " + getCost() + " $" +
                "\nSố lượng người tối đa: " + getAmountOfPeople() + " nguoi" +
                "\nKiểu thuê: " + getRentType() +
                "\nSố tầng:" + getNumberOfFloor() + "tang\n";
    }
}
