package java00_case_study_02.models;

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

        return "Customer{" +
                "fullName='" + getFullName() + '\'' +
                ", dateOfBirth='" + getDateOfBirth() + '\'' +
                ", sex='" + getSex() + '\'' +
                ", idCard='" + getIdCard() + '\'' +
                ", numberPhone='" + getNumberPhone() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", address='" + getAddress() + '\'' +
                "customerType='" + getCustomerType() + '\'' +
                ", service=" + getService() +
                ", serviceGoWith=" + getServiceGoWith() +
                ", contract=" + getContract() +
                '}';

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
