package Qlnv;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManagementStaff managementStaff = new ManagementStaff();
        int choice = 0;
        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("=====MENU======");
            System.out.println("1.Hien Thi tat ca nhan vien \n" +
                    "2.Them\n" +
                    "3.Tim Kiem\n" +
                    "4.In ra danh sach nhan vien full time\n" +
                    "5.sua\n" +
                    "6. Doi trang thai\n" +
                    "7.Tinh tong luong nhan vien\n" +
                    "8.thoat\n");
            System.out.println("Vui Long chon chuc nang : ");
            choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 1) {
                managementStaff.show();
            } else if (choice == 2) {
                System.out.println("Nhap ten :");
                String nhapTen = scanner.nextLine();
                System.out.println("nhap loai (Fulltime/Parttime): ");
                String nhapLoai = scanner.nextLine();
                System.out.println("Nhap trang thai (Dang lam/thoi viec):");
                String nhapSt = scanner.nextLine();
                System.out.println("nhap luong : ");
                int nhapLuong = scanner.nextInt();
                Staff staff = new Staff(nhapTen, nhapLoai, nhapSt, nhapLuong);
                managementStaff.add(staff);
            } else if (choice == 3) {
                System.out.println("nhap ten can tim :");
                String timKiem = scanner.nextLine();
                managementStaff.finByName(timKiem);
            } else if (choice == 4) {
                managementStaff.displayFullTime();
            } else if (choice == 5) {
                System.out.println("Nhap ten can sua : ");
                String nhapSua = scanner.nextLine();
                System.out.println("Nhap ten :");
                String nhapTen = scanner.nextLine();
                System.out.println("nhap loai (Fulltime/Parttime): ");
                String nhapLoai = scanner.nextLine();
                System.out.println("Nhap trang thai (Dang lam/thoi viec):");
                String nhapSt = scanner.nextLine();
                System.out.println("nhap luong : ");
                int nhapLuong = scanner.nextInt();
                Staff staff1 = new Staff(nhapTen, nhapLoai, nhapSt, nhapLuong);
                managementStaff.editByName(nhapSua, staff1);
            } else if (choice == 6) {
                System.out.println("nhap ten nhan vien dang lam :");
                String trangThai = scanner.nextLine();
                managementStaff.updateStaffStatus(trangThai);
            } else if (choice == 7) {
                managementStaff.calSalary();
            } else if (choice == 8) {
                System.exit(0);
            }
        } while (choice != 0);
    }
}