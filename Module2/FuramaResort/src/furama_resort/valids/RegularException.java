package furama_resort.valids;

import furama_resort.controllers._00_main_menu.MainMenu;
import furama_resort.exceptions.*;
import furama_resort.models.FilingCabinets;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularException {
    private static Pattern pattern;
    private static Matcher matcher;

    private static final String REGEX_ID_VILLA = "SVVL-\\d{4}";
    private static final String REGEX_ID_HOUSE = "SVHO-\\d{4}";
    private static final String REGEX_ID_ROOM = "SVRO-\\d{4}";
    private static final String REGEX_NAME = "^[A-Z][a-z]+(\\s[A-Z][a-z]+)*$";
    private static final String REGEX_AREA = "^([3][0]\\.\\d+)|([3][1-9]\\.?\\d*)|([4-9]\\d\\.?\\d*)|(\\d{3,}\\.?\\d*)$";
    private static final String REGEX_COST = "^[1-9]\\d*$";
    private static final String REGEX_AMOUNT_OF_PEOPLE = "^[1-9]|[1]\\d$";
    private static final String REGEX_RENT_TYPE = "^(hours|day|week|month|year|Hours|Day|Week|Month|Year)$";
    private static final String REGEX_NUMBER_FLOOR = "^[1-9]$";
    private static final String REGEX_DATE_OF_BIRTH = "^([0][1-9]|[12][0-9]|[3][01])/([0][1-9]|[1][012])/([2][0][0]([012])|[1][9]\\d{2})$";
    private static final String REGEX_SEX = "^(male|female|Male|Female)$";
    private static final String REGEX_ID_CARD = "^\\d{9}$";
    private static final String REGEX_NUMBER_PHONE = "^\\d{10}$";
    private static final String REGEX_EMAIL = "^\\w{3,}(\\.?\\w+)*@[a-z]{2,7}(.[a-z]{2,5}){1,3}$";
    private static final String REGEX_CUSTOMER_TYPE = "^(member|sliver|gold|platinum|diamond|Member|Sliver|Gold|Platinum|Diamond)$";
    private static final String REGEX_SERVICE = "^(massage|karaoke|food|drink|car|Massage|Karaoke|Food|Drink|Car)$";
    private static final String REGEX_CONTRACT_VILLA = "^\\d{3}/\\d{2}/\\d{2}-(HDVL)$";
    private static final String REGEX_CONTRACT_HOUSE = "^\\d{3}/\\d{2}/\\d{2}-(HDHO)$";
    private static final String REGEX_CONTRACT_ROOM = "^\\d{3}/\\d{2}/\\d{2}-(HDRO)$";
    private static final String REGEX_DAY_CONTRACT = "^([0][1-9]|[12][0-9]|[3][01])/([0][1-9]|[1][012])/([2][0][2]\\d)$";
    private static final String REGEX_ID_EMPLOYEE = "^EP-\\d{4}$";
    private static final String REGEX_LEVEL = "^(Junior|Senior|Supervisor|Leader|Manager|junior|senior|supervisor|leader|manager)$";
    private static final String REGEX_POSITION = "^(receptionist|Receptionist|Serve|serve|expert|Expert|monitoring|Monitoring|Manage|manage|Manager|manager)$";
    private static final String REGEX_DEPARTMENT = "^(Sale|sale|Marketing|marketing|administrative|Administrative|Serve|serve|manage|Manage)$";

    public static void regexIDVilla(String iDVilla) throws IDServiceException {
        pattern = Pattern.compile(REGEX_ID_VILLA);
        matcher = pattern.matcher(iDVilla);
        if (!matcher.find()) throw new IDServiceException("Retype ID Villa (SVVL-XXXX)!!!.");
    }

    public static void regexIDHouse(String iDHouse) throws IDServiceException {
        pattern = Pattern.compile(REGEX_ID_HOUSE);
        matcher = pattern.matcher(iDHouse);
        if (!matcher.find()) throw new IDServiceException("Retype ID House (SVHO-XXXX)!!!.");
    }

    public static void regexIDRoom(String iDRoom) throws IDServiceException {
        pattern = Pattern.compile(REGEX_ID_ROOM);
        matcher = pattern.matcher(iDRoom);
        if (!matcher.find()) throw new IDServiceException("Retype ID Room (SVRO-XXXX)!!!.");
    }

    public static void regexName(String name) throws NameException {
        pattern = Pattern.compile(REGEX_NAME);
        matcher = pattern.matcher(name);
        if (!matcher.find()) throw new NameException("Retype name!!!.");
    }

    public static void regexArea(String area) throws AreaException {
        pattern = Pattern.compile(REGEX_AREA);
        matcher = pattern.matcher(area);
        if (!matcher.find()) throw new AreaException("Retype (area > 30 m^2)!!!.");
    }

    public static void regexCost(String cost) throws NumberException {
        pattern = Pattern.compile(REGEX_COST);
        matcher = pattern.matcher(cost);
        if (!matcher.find()) throw new NumberException("Retype cost!!!.");
    }

    public static void regexAmountOfPeople(String amountOfPeople) throws NumberException {
        pattern = Pattern.compile(REGEX_AMOUNT_OF_PEOPLE);
        matcher = pattern.matcher(amountOfPeople);
        if (!matcher.find()) throw new NumberException("Retype amount of people!!!.");
    }

    public static void regexRentType(String rentType) throws TypeException {
        pattern = Pattern.compile(REGEX_RENT_TYPE);
        matcher = pattern.matcher(rentType);
        if (!matcher.find()) throw new TypeException("Retype rent day!!!.");
    }

    public static void regexNumberOfFloor(String numberOfFloor) throws NumberException {
        pattern = Pattern.compile(REGEX_NUMBER_FLOOR);
        matcher = pattern.matcher(numberOfFloor);
        if (!matcher.find()) throw new NumberException("Retype number floor!!!.");
    }

    public static void regexDateOfBirth(String dateOfBirth) throws DateOfBirthException {
        pattern = Pattern.compile(REGEX_DATE_OF_BIRTH);
        matcher = pattern.matcher(dateOfBirth);
        if (!matcher.find()) throw new DateOfBirthException("Retype date of birth (dd/mm/yyyy)!!!.");
    }

    public static void regexSex(String sex) throws TypeException {
        pattern = Pattern.compile(REGEX_SEX);
        matcher = pattern.matcher(sex);
        if (!matcher.find()) throw new TypeException("Retype Sex!!!.");
    }

    public static void regexIDCard(String iDCard) throws NumberException {
        pattern = Pattern.compile(REGEX_ID_CARD);
        matcher = pattern.matcher(iDCard);
        if (!matcher.find()) throw new NumberException("Retype ID card (XXXXXXXXX)!!!.");
    }

    public static void regexNumberPhone(String numberPhone) throws NumberException {
        pattern = Pattern.compile(REGEX_NUMBER_PHONE);
        matcher = pattern.matcher(numberPhone);
        if (!matcher.find()) throw new NumberException("Retype number phone (XXXXXXXXXX)!!!.");
    }

    public static void regexEmail(String email) throws EmailException {
        pattern = Pattern.compile(REGEX_EMAIL);
        matcher = pattern.matcher(email);
        if (!matcher.find()) throw new EmailException("Retype email!!!.");
    }

    public static void regexCustomerType(String customerType) throws TypeException {
        pattern = Pattern.compile(REGEX_CUSTOMER_TYPE);
        matcher = pattern.matcher(customerType);
        if (!matcher.find()) throw new TypeException("Retype Customer type!!!.");
    }

    public static void regexService(String service) throws TypeException {
        pattern = Pattern.compile(REGEX_SERVICE);
        matcher = pattern.matcher(service);
        if (!matcher.find()) throw new TypeException("Retype Service!!!.");
    }

    public static void exceptionIndexCusTomer(String choiceCustomer) throws IndexOutOfBoundsException, NumberFormatException {
        if (Integer.parseInt(choiceCustomer) < 1 || Integer.parseInt(choiceCustomer) > MainMenu.customerList.size())
            throw new IndexOutOfBoundsException("IndexOutOfBoundsException");
    }

    public static void exceptionIndexVilla(String choiceVilla) throws IndexOutOfBoundsException, NumberFormatException {
        if (Integer.parseInt(choiceVilla) < 1 || Integer.parseInt(choiceVilla) > MainMenu.villaList.size())
            throw new IndexOutOfBoundsException("IndexOutOfBoundsException");

    }

    public static void exceptionIndexHouse(String choiceHouse) throws IndexOutOfBoundsException, NumberFormatException {
        if (Integer.parseInt(choiceHouse) < 1 || Integer.parseInt(choiceHouse) > MainMenu.houseList.size())
            throw new IndexOutOfBoundsException("IndexOutOfBoundsException");
    }

    public static void exceptionIndexRoom(String choiceRoom) throws IndexOutOfBoundsException, NumberFormatException {
        if (Integer.parseInt(choiceRoom) < 1 || Integer.parseInt(choiceRoom) > MainMenu.roomList.size())
            throw new IndexOutOfBoundsException("IndexOutOfBoundsException");
    }

    public static void exceptionIndexEmployee(String choiceEmployee) throws IndexOutOfBoundsException, NumberFormatException {
        if (Integer.parseInt(choiceEmployee) < 1 || Integer.parseInt(choiceEmployee) > FilingCabinets.employeeList.size())
            throw new IndexOutOfBoundsException("IndexOutOfBoundsException");
    }

    public static void regexContractVilla(String numberContractVilla) throws TypeException {
        pattern = Pattern.compile(REGEX_CONTRACT_VILLA);
        matcher = pattern.matcher(numberContractVilla);
        if (!matcher.find()) throw new TypeException("Retype (XXX/XX/XX-HDVL)!!!");
    }

    public static void regexContractHouse(String numberContractHouse) throws TypeException {
        pattern = Pattern.compile(REGEX_CONTRACT_HOUSE);
        matcher = pattern.matcher(numberContractHouse);
        if (!matcher.find()) throw new TypeException("Retype (XXX/XX/XX-HDHO)!!!");
    }

    public static void regexContractRoom(String numberContractRoom) throws TypeException {
        pattern = Pattern.compile(REGEX_CONTRACT_ROOM);
        matcher = pattern.matcher(numberContractRoom);
        if (!matcher.find()) throw new TypeException("Retype (XXX/XX/XX-HDRO)!!!");
    }

    public static void regexDayContract(String day) throws TypeException {
        pattern = Pattern.compile(REGEX_DAY_CONTRACT);
        matcher = pattern.matcher(day);
        if (!matcher.find()) throw new TypeException("Retype (dd/ww/yyyy)!!!");
    }

    public static void regexIdEmployee(String iDEmployee) throws TypeException {
        pattern = Pattern.compile(REGEX_ID_EMPLOYEE);
        matcher = pattern.matcher(iDEmployee);
        if (!matcher.find()) throw new TypeException("Retype (EP-XXXX)!!!");
    }

    public static void regexPosition(String position) throws TypeException {
        pattern = Pattern.compile(REGEX_POSITION);
        matcher = pattern.matcher(position);
        if (!matcher.find()) throw new TypeException("Retype!!!");
    }

    public static void regexLevel(String level) throws TypeException {
        pattern = Pattern.compile(REGEX_LEVEL);
        matcher = pattern.matcher(level);
        if (!matcher.find()) throw new TypeException("Retype!!!");
    }

    public static void regexDepartment(String department) throws TypeException {
        pattern = Pattern.compile(REGEX_DEPARTMENT);
        matcher = pattern.matcher(department);
        if (!matcher.find()) throw new TypeException("Retype!!!");
    }


}
