package java00_case_study_02.models;

public class Employee extends Human {
    private String idEmployee;
    private String level;
    private String position;
    private String department;
    private double salary;

    public Employee(String idEmployee, String fullName, String dateOfBirth,
                    String sex, String idCard, String numberPhone,
                    String email, String address, String level,
                    String position, String department, double salary) {
        super(fullName, dateOfBirth, sex, idCard, numberPhone, email, address);
        this.idEmployee = idEmployee;
        this.level = level;
        this.position = position;
        this.department = department;
        this.salary = salary;
    }

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
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
                "customerType='" + getLevel() + '\'' +
                ", service=" + getPosition() +
                ", serviceGoWith=" + getDepartment() +
                ", contract=" + getSalary() +
                '}';
    }

    @Override
    public String showInFor() {
        return  "\nID employee: " + getIdEmployee() +
                "\nFull name: " + getFullName() +
                "\nDate of birth: " + getDateOfBirth() +
                "\nRent type: " + getSex() +
                "\nID card: " + getIdCard() +
                "\nNumber phone: " + getNumberPhone() +
                "\nEmail: " + getEmail() +
                "\nAddress: " + getAddress() +
                "\nLevel: " + getLevel() +
                "\nPosition: " + getPosition() +
                "\nDepartment: " + getDepartment() +
                "\nSalary: " + getSalary() + " $\n";
    }
}
