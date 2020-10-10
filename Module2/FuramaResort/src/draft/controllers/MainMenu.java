//package draft.controllers;
//
//import draft.commons.FileUntils;
//import draft.models.*;
//import java.util.*;
//
//public class MainMenu {
//    public static final String FILE_VILLA = "src/draft.data/villa.csv";
//    public static final String FILE_HOUSE = "src/draft.data/house.csv";
//    public static final String FILE_ROOM = "src/draft.data/room.csv";
//    public static final String FILE_CUSTOMER = "src/draft.data/customer.csv";
//    public static final String FILE_BOOKING = "src/draft.data/booking.csv";
//    public static final String FILE_EMPLOYEE = "src/draft.data/employee.csv";
//    public static final String COMMA = ",";
//    private static Scanner scanner = new Scanner(System.in);
//
//    public static List<Customer> customers = new ArrayList<>();
//    public static List<Villa> villas = new ArrayList<>();
//    public static List<House> houses = new ArrayList<>();
//    public static List<Room> rooms = new ArrayList<>();
//    public static Map<String, Employee> nhanVienMap = new TreeMap<>();
//    public static Queue<Customer> customerQueue = new LinkedList<>();
//    public static Stack<Employee> employeeStack = new Stack<>();
//
//
//
//
//    //---------------------------------------------
//
//
//    // Menu Chính.
//    public static void menuChinh() {
//        System.out.println("----------------------------------");
//        System.out.println("1. Thêm mới dịch vụ.");
//        System.out.println("2. Hiện thị danh sách dịch vụ.");
//        System.out.println("3. Thêm mới khách hàng.");
//        System.out.println("4. Hiển thị thông tin khách hàng.");
//        System.out.println("5. Đặt dịch vụ.");
//        System.out.println("6. Hiện thị thông tin nhân viên.");
//        System.out.println("7. Rạp chiếu phim.");
//        System.out.println("8. Tìm kiếm hồ sơ nhân viên");
//        System.out.println("9. Thoát.");
//        System.out.println("----------------------------------");
//        System.out.print("Nhập lựa chọn của bạn: ");
//        String choose = scanner.nextLine();
//        switch (choose) {
//            case "1":
//                AddNewService.themMoiDichVu();
//                menuChinh();
//                break;
//            case "2":
//                ShowListService.hienThiDanhSachDichVu();
//                menuChinh();
//                break;
//            case "3":
//                AddNewCustomer.themMoiKhachHang();
//                menuChinh();
//                break;
//            case "4":
//                ShowInforCustomer.hienThiThongTinKhachHang();
//                menuChinh();
//                break;
//            case "5":
//                Booking.datDichVu();
//                menuChinh();
//                break;
//            case "6":
//                ShowInforEmployee.hienThiThongTinNhanVien();
//                menuChinh();
//                break;
//            case "7":
//                Cinema.muaVeXemPhim4D();
//                menuChinh();
//            case "8":
//                timKiemHoSoNhanVien();
//                menuChinh();
//            case "9":
//                System.exit(0);
//            default:
//                System.err.println("Vui lòng nhập đúng lựa chọn.");
//                menuChinh();
//                break;
//
//        }
//    }
//
//
//
//    public static void timKiemHoSoNhanVien() {
//        boolean flag;
//        int size = employeeStack.size();
//        System.out.println("-----------------------------------");
//        System.out.println("1. Tìm kiếm theo tên nhân viên.");
//        System.out.println("2. Tìm kiếm theo id nhân viên.");
//        System.out.println("3. Trở lại.");
//        System.out.println("4. Thoát.");
//        System.out.println("-----------------------------------");
//        System.out.print("Nhập lựa chọn của bạn: ");
//        String luaChon = scanner.nextLine();
//        switch (luaChon) {
//            case "1":
//                flag = false;
//                System.out.println("Nhập tên nhân viên muốn tìm");
//                String tenNhanVien = scanner.nextLine();
//                for (int i = 0; i < size; i++) {
//                    if (employeeStack.peek().getFullName().equals(tenNhanVien)) {
//                        System.out.println(employeeStack.pop());
//                        flag = true;
//                        continue;
//                    }
//                    employeeStack.pop();
//                }
//                if (!flag) {
//                    System.err.println("Không có nhân viên bạn muốn tìm");
//                }
//                timKiemHoSoNhanVien();
//                break;
//            case "2":
//                flag = false;
//                System.out.println("Nhập tên nhân viên muốn tìm");
//                String iDEmployee = scanner.nextLine();
//                for (int i = 0; i < size; i++) {
//                    if (employeeStack.peek().getIdEmployee().equals(iDEmployee)) {
//                        System.out.println(employeeStack.pop());
//                        flag = true;
//                        continue;
//                    }
//                    employeeStack.pop();
//                }
//                if (!flag) {
//                    System.err.println("Không có nhân viên bạn muốn tìm");
//                }
//                timKiemHoSoNhanVien();
//            case "3":
//                menuChinh();
//                break;
//            case "4":
//                System.exit(0);
//            default:
//                System.err.println("Vui lòng nhập đúng lựa chọn.");
//                timKiemHoSoNhanVien();
//        }
//    }
//
//    //----------------------------------------------------
//
//    public static void main(String[] args) {
//        layThongTinVillasTuFile();
//        layThongTinHousesTuFile();
//        layThongTinRoomsTuFile();
//        layThongTinKhachHangTuFile();
////        layThongTinNhanVienTuFile();
////        NhanVien nhanVien = new NhanVien("Nguyễn Thị Thu" , "25/09/1996", "Đà Nẵng", 994000059, 358665325, "sorake.1996@gmail.com", "Đại học", "Quản lí", 100000);
////        String line;
////        line = nhanVien.getHoVaTen() + COMMA + nhanVien.getNgaySinh() + COMMA +
////                nhanVien.getDiaChi() + COMMA + nhanVien.getcMND() + COMMA + nhanVien.getSoDienThoai() + COMMA + nhanVien.getEmail() + COMMA + nhanVien.getTrinhDo() + COMMA + nhanVien.getViTri() + COMMA + nhanVien.getLuong();
////        FileUntils.writeFile(FILE_EMPLOYEE,line);
//        menuChinh();
//    }
//
//    private static void layThongTinVillasTuFile() {
//        List<String> listLine = FileUntils.readFile(FILE_VILLA);
//        for (String line : listLine) {
//            String[] split = line.split(",");
//            if (split.length != 1) {
//                Villa villa = new Villa(split[0], split[1], Float.parseFloat(split[2]), Integer.parseInt(split[3]), Integer.parseInt(split[4]),
//                        split[5], split[6], split[7], Float.parseFloat(split[8]), Integer.parseInt(split[9]));
//                villas.add(villa);
//            }
//        }
//    }
//
//    private static void layThongTinHousesTuFile() {
//        List<String> listLine = FileUntils.readFile(FILE_HOUSE);
//        for (String line : listLine) {
//            String[] split = line.split(",");
//            if (split.length != 1) {
//                House house = new House(split[0], split[1], Float.parseFloat(split[2]), Integer.parseInt(split[3]),
//                        Integer.parseInt(split[4]), split[5], split[6], split[7], Integer.parseInt(split[8]));
//                houses.add(house);
//            }
//        }
//    }
//
//    private static void layThongTinRoomsTuFile() {
//        List<String> listLine = FileUntils.readFile(FILE_ROOM);
//        for (String line : listLine) {
//            String[] split = line.split(",");
//            if (split.length != 1) {
//                Room room = new Room(split[0], split[1], Float.parseFloat(split[2]),
//                        Integer.parseInt(split[3]), Integer.parseInt(split[4]), split[5], split[6]);
//                rooms.add(room);
//            }
//        }
//    }
//
//    private static void layThongTinKhachHangTuFile() {
//        List<String> listline = FileUntils.readFile(FILE_CUSTOMER);
//        for (String list : listline) {
//            String[] split = list.split(",");
//            if (split.length != 1) {
//                Customer customer = new Customer(split[0], split[1], split[2], split[3], split[4], split[5], split[6], split[7], null);
//                customers.add(customer);
//            }
//        }
//    }
//
////    private static void layThongTinNhanVienTuFile() {
////        List<String> listLine = FileUntils.readFile(FILE_EMPLOYEE);
////        for (String line : listLine) {
////            String[] split = line.split(",");
////            if (split.length != 1) {
////                Employee employee = new Employee(split[0], split[1], split[2], split[3], Long.parseLong(split[4]),
////                        Long.parseLong(split[5]), split[6], split[7], split[8], Long.parseLong(split[9]));
////                nhanVienMap.put(split[0], employee);
////                employeeStack.push(employee);
////            }
////        }
////    }
//}
