package QuanLyNhanVien;

import java.io.*;
import java.util.Scanner;

public class Menu {
     int luong;
     String name;
    public static StaffManagement staffManagement = new StaffManagement();
    public static void hienThiMenuChinh() {
        System.out.println("___Chương Trình Quản Lý Nhân Viên ___");
        System.out.println("0.Hiển thị tất cả nhân viên ");
        System.out.println("1.Thêm");
        System.out.println("2.Tìm kiếm");
        System.out.println("3.In ra danh sách nhân viên full time");
        System.out.println("4.Sửa");
        System.out.println("5.Đổi trạng thái ");
        System.out.println("6.Tính tổng lương nhân viên");
        System.out.println("7.Thoát");
    }
    public static void hienthi(){
        staffManagement.hienThi();
    }
    public  static void chucNangThem() {
        Scanner scanner = new Scanner(System.in);
        Scanner scs = new Scanner(System.in);
        System.out.println("Nhập status");
        String status = scanner.nextLine();
        System.out.println("Nhập họ và tên");
        String hoTen = scanner.nextLine();
        System.out.println("Type");
        String type = scanner.nextLine();
        System.out.println("Lương");
        int luong = scs.nextInt();
        Staff staff = new Staff(hoTen,type,status,luong);
        staffManagement.add(staff);
    }
    public static void timKiemMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên : ");
        String name = scanner.nextLine();
        staffManagement.timKiemTen(name);
    }
    public  void chucNangCapNhat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập status");
        String status = scanner.nextLine();
        System.out.println("Nhập họ và tên");
        String hoTen = scanner.nextLine();
        System.out.println("Lương");
        String gioiTinh = scanner.nextLine();
        System.out.println("Type");
        String type = scanner.nextLine();
        String email = scanner.nextLine();
        Staff staff = new Staff(name,status,type,luong);
    }
    public static void chucNangXoa() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        String type = scanner.nextLine();
    }

    public static void chucNangTimKiem() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        String soDienThoai = scanner.nextLine();

    }

    public static void chucNangDocVaoFile() throws IOException {
        FileReader fr = new FileReader("money.csv");
        BufferedReader br = new BufferedReader(fr);
        String content = br.readLine();
        while ((content = br.readLine()) != null){
            System.out.println(content + "\n");
        }
    }
    public static void chucNangGhiVaoFile() throws IOException {
        FileWriter pw = new FileWriter("money.csv");
        BufferedWriter bw = new BufferedWriter(pw);
        bw.close();
    }
}
