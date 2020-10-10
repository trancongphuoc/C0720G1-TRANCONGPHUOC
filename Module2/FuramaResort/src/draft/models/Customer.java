package draft.models;

public class Customer implements Comparable<Customer> {
    private String fullName;
    private String dateOfBirth;
    private String gender;
    private String idCard;
    private String numberPhone;
    private String email;
    private String customerType;
    private String address;
    private Service service;

    public Customer(String fullName, String dateOfBirth, String gender, String idCard,
                    String numberPhone, String email, String customerType, String address, Service service) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.idCard = idCard;
        this.numberPhone = numberPhone;
        this.email = email;
        this.customerType = customerType;
        this.address = address;
        this.service = service;
    }

    public Customer() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public String showInfo() {
        return "Họ và tên: " + getFullName() +
                "\nNgày sinh: " + getDateOfBirth() +
                "\nGiới tính: " + getGender() +
                "\nSố chứng minh: " + getIdCard() +
                "\nSố điện thoại: " + getNumberPhone() +
                "\nEmail: " + getEmail() +
                "\nLoại khách hàng: " + getCustomerType() +
                "\nĐịa chỉ: " + getAddress() +
                "\nThuộc tính: " + getService() + "\n";
    }

    @Override
    public int compareTo(Customer o) {
        int result = this.fullName.compareTo(o.getFullName());
        if (result == 0) {
            result= this.dateOfBirth.substring(6, 10).compareTo(o.getDateOfBirth().substring(6, 10));
        }
        return result;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "fullName='" + fullName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", idCard='" + idCard + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                ", email='" + email + '\'' +
                ", customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                ", service=" + service +
                '}';
    }
}
