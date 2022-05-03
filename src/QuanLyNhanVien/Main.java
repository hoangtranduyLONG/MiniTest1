package QuanLyNhanVien;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        int choose = 1;
        do {
            Menu.hienThiMenuChinh();
            Scanner scanner = new Scanner(System.in);
            do {
                if (choose > 8) {
                    System.out.println("Vui lòng nhập lựa chọn trong menu!");
                }
                try {
                    choose = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.err.println("Nhập đúng lựa chọn !");
                }
            } while (choose < 1 || choose > 8);
            switch (choose) {
                case 0:
                    Menu.hienthi();
                    break;
                case 1:
                    Menu.chucNangThem();
                    break;
                case 2:
                    Menu.timKiemMenu();
                    break;
                case 3:
                    menu.chucNangCapNhat();
                    break;
                case 4:
                    Menu.chucNangXoa();
                    break;
                case 8:
                    System.exit(0);
            }
        } while (choose!=7);
    }

    }

