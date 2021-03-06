package furama_resort.models;

import furama_resort.controllers._00_main_menu.MainMenu;

public class Customer extends Human implements Comparable<Customer> {
    private String customerType;
    private Service service;
    private ServiceGoWith serviceGoWith;
    private Contract contract;

    public Customer(String fullName, String dateOfBirth, String sex, String idCard,
                    String numberPhone, String email, String address, String customerType) {
        super(fullName, dateOfBirth, sex, idCard, numberPhone, email, address);
        this.customerType = customerType;
        this.service = null;
        this.serviceGoWith = null;
        this.contract = null;
    }

    public Customer(String fullName, String dateOfBirth, String sex, String idCard,
                    String numberPhone, String email, String address, String customerType, Service service
    ,ServiceGoWith serviceGoWith,Contract contract) {
        super(fullName, dateOfBirth, sex, idCard, numberPhone, email, address);
        this.customerType = customerType;
        this.service = service;
        this.serviceGoWith = serviceGoWith;
        this.contract = contract;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public ServiceGoWith getServiceGoWith() {
        return serviceGoWith;
    }

    public void setServiceGoWith(ServiceGoWith serviceGoWith) {
        this.serviceGoWith = serviceGoWith;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    @Override
    public String toString() {

        return getFullName() + MainMenu.COMA +
                getDateOfBirth() + MainMenu.COMA +
                getSex() + MainMenu.COMA +
                getIdCard() + MainMenu.COMA +
                getNumberPhone() + MainMenu.COMA +
                getEmail() + MainMenu.COMA +
                getAddress() + MainMenu.COMA +
                getCustomerType() + MainMenu.COMA +
                getService().getIdService() + MainMenu.COMA +
                getServiceGoWith().getName() + MainMenu.COMA +
                getContract().getNumberContract();
    }


    @Override
    public String showInFor() {
        return "\nFull name: " + getFullName() +
                "\nDate of birth: " + getDateOfBirth() +
                "\nRent type: " + getSex() +
                "\nID card: " + getIdCard() +
                "\nNumber phone: " + getNumberPhone() +
                "\nEmail: " + getEmail() +
                "\nAddress: " + getAddress() +
                "\nCustomer type: " + getCustomerType() +
                "\nUse service: " + getService() +
                "\nService go with: " + getServiceGoWith() +
                "\nContract: " + getContract() + " $\n";
    }

    @Override
    public int compareTo(Customer o) {
        int result = getFullName().substring(getFullName().lastIndexOf(" ") + 1).compareTo(o.getFullName().substring(o.getFullName().lastIndexOf(" ") + 1));
        if (result == 0) {
            result = getDateOfBirth().substring(6, 10).compareTo(o.getDateOfBirth().substring(6, 10));
        }
        return result;
    }
}
