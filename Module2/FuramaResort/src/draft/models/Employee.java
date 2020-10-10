package draft.models;

public class Employee {
    private String idEmployee;
    private String fullName;
    private String dateOfBirth;
    private String gender;
    private String address;
    private long idCard;
    private long numberPhone;
    private String email;
    private String level;
    private String position;
    private String department;
    private long salary;

    public Employee(String idEmployee, String fullName, String dateOfBirth,String gender, String address, long idCard,
                    long numberPhone, String email, String level, String position,String department, long salary) {
        this.idEmployee = idEmployee;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.address = address;
        this.idCard = idCard;
        this.numberPhone = numberPhone;
        this.email = email;
        this.level = level;
        this.position = position;
        this.department = department;
        this.salary = salary;
    }


    public Employee() {
    }

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getIdCard() {
        return idCard;
    }

    public void setIdCard(long idCard) {
        this.idCard = idCard;
    }

    public long getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(long numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "hoVaTen='" + fullName + '\'' +
                ", ngaySinh='" + dateOfBirth + '\'' +
                ", diaChi='" + address + '\'' +
                ", cMND=" + idCard +
                ", soDienThoai=" + numberPhone +
                ", email='" + email + '\'' +
                ", trinhDo='" + level + '\'' +
                ", viTri='" + position + '\'' +
                ", luong=" + salary +
                '}';
    }
}
