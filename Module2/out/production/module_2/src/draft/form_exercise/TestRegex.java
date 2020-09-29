package draft.form_exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {
    public static void main(String[] args) {
        String name = "Tran Cong Phuoc";
        String regexName = "^[A-Z][a-z]+(\\s[A-Z]{1}[a-z]+)+$"; //True
        Pattern pattern = Pattern.compile(regexName);
        Matcher matcher = pattern.matcher(name);
//        System.out.println(matcher.find());


        String number = "45.1";
        String regexnumber = "^([3][0]+.\\d+)|([3][1-9]+.?\\d*)|([4-9]\\d+.?\\d*)|(\\d{3,}.?\\d*)$";
        Pattern pattern1 = Pattern.compile(regexnumber);
        Matcher matcher1 = pattern1.matcher(number);
//        System.out.println(matcher1.find());

        String number1 = "11111";
        String regexMoney = "^[1-9]\\d*$";
        Pattern pattern2 = Pattern.compile(regexMoney);
        Matcher matcher2 = pattern2.matcher(number1);
//        System.out.println(matcher2.find());


        String soLuongNguoiThue = "20";
        String regexSoLuongNguoiThue = "^\\d|[1]\\d$";
        Pattern pattern3 = Pattern.compile(regexSoLuongNguoiThue);
        Matcher matcher3 = pattern3.matcher(soLuongNguoiThue);
//        System.out.println(matcher3.find());


        String dichVuDiKem = "massage";
        String regexDichVu = "^(massage|karaoke|food|drink|car|Massage|Karaoke|Food|Drink|Car)$";
        Pattern pattern4 = Pattern.compile(regexDichVu);
        Matcher matcher4 = pattern4.matcher(dichVuDiKem);
//        System.out.println(matcher4.find());


        String ngaySinh = "01/01/2000";
        String regexNgaySinh = "^([0][1-9]|[12][0-9]|[3][01])/([0][1-9]|[1][012])/([2][0][0]([1]|[2]|[0])|[1]\\d{3})$";
        Pattern pattern5 = Pattern.compile(regexNgaySinh);
        Matcher matcher5 = pattern5.matcher(ngaySinh);
//        System.out.println(matcher5.find());

        String a = "SVVL-1324";
        String regexxx = "(SVVL|SVHO|SVRO)-\\d{4}";
        Pattern pattern6 = Pattern.compile(regexxx);
        Matcher matcher6 = pattern6.matcher(a);
//        System.out.println(matcher6.find());


        String email = "teosake199911@abc.com.vn";
        String regexemail = "^\\w{3,}(.?\\w+)*@[a-z]{2,7}(.[a-z]{2,5}){1,3}$";
        Pattern patternEmail = Pattern.compile(regexemail);
        Matcher matcherEmail = patternEmail.matcher(email);
        System.out.println(matcherEmail.find());
    }
}
