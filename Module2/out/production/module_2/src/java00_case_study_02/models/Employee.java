package java00_case_study_02.models;

public class Employee extends Human {
    private String idEmployee;
    private String level;
    private String position;
    private String workingParts;
    private double salary;

    public Employee(String idEmployee, String fullName, String dateOfBirth,
                    String sex, String idCard, String numberPhone,
                    String email, String address, String level,
                    String position,String workingParts, double salary) {
        super(fullName, dateOfBirth, sex, idCard, numberPhone, email, address);
        this.idEmployee = idEmployee;
        this.level = level;
        this.position = position;
        this.workingParts = workingParts;
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

    public String getWorkingParts() {
        return workingParts;
    }

    public void setWorkingParts(String workingParts) {
        this.workingParts = workingParts;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
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
                "\nWorking pasts: " + getWorkingParts() +
                "\nSalary: " + getSalary() + " $\n";
    }
}
