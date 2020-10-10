package draft.models;

public class Room extends Service {
    private String FreeService;

    public Room(String idService, String nameService, float area, int cost,
                int amountOfPeople, String rentType, String FreeService) {
        super(idService, nameService, area, cost, amountOfPeople, rentType);
        this.FreeService = FreeService;
    }

    public Room(String FreeService) {
        this.FreeService = FreeService;
    }

    public Room() {
    }

    public String getFreeService() {
        return FreeService;
    }

    public void setFreeService(String freeService) {
        this.FreeService = freeService;
    }


    @Override
    public String showInfo() {
        return "\nMã dịch vụ: " + getIdService() +
                "\nTên dịch vụ: " + getNameService() +
                "\nDiện tích sử dụng: " + getUsedArea() +
                "\nChi phí thuê: " + getCost() +
                "\nSố lượng người tối đa: " + getAmountOfPeople() +
                "\nKiểu thuê: " + getRentType() +
                "\nDịch vụ miên phí đi kèm: " + getFreeService() + "\n";
    }
}
