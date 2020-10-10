package draft.models;

public abstract class Service {
    private String idService;
    private String nameService;
    private float usedArea;
    private int cost;
    private int amountOfPeople;
    private String rentType;

    public Service(String idService, String nameService, float usedArea, int cost, int amountOfPeople, String rentType) {
        this.idService = idService;
        this.nameService = nameService;
        this.usedArea = usedArea;
        this.cost = cost;
        this.amountOfPeople = amountOfPeople;
        this.rentType = rentType;
    }

    public Service() {
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

    public float getUsedArea() {
        return usedArea;
    }

    public void setUsedArea(float usedArea) {
        this.usedArea = usedArea;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
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

    public abstract String showInfo();

}
