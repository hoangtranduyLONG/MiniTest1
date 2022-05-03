package Qlnv;

import java.util.ArrayList;

public class ManagementStaff {
    ArrayList<Staff> staffList = new ArrayList<>();

    public void StaffManagement() {

    }

    static final String FULL = "fulltime";

    public void show() {
        for (int i = 0; i < staffList.size(); i++) {
            System.out.println(staffList.get(i));
        }
    }


    public void add(Staff staff) {
        staffList.add(staff);
    }


    public int finByName(String name) {
        for (int i = 0; i < staffList.size(); i++) {
            if (this.staffList.get(i).getName().equals(name)) {
                System.out.println(staffList.get(i));
                return i;
            }
        }
        return -1;
    }

    public void displayFullTime() {
        for (int i = 0; i < staffList.size(); i++) {
            if (staffList.get(i).getType().equals(FULL)) {
                System.out.println(staffList.get(i));
            }
        }
    }


    public void editByName(String name, Staff staff) {
        int indexOf = finByName(name);
        if (indexOf == -1) {
            System.out.println("khong co ten nay !!!! ");
        } else {
            staffList.set(indexOf, staff);
        }
    }


    public void updateStaffStatus(String name) {
        for (int i = 0; i < staffList.size(); i++) {
            if (staffList.get(i).getName().equals(name)) {
                if (staffList.get(i).getStatus().equals("Nghi")) {
                    System.out.println("Nhan vien nay da nghi roi ");
                }
            } else {
                staffList.get(i).setStatus("Nghi");
            }
        }
    }

    public void calSalary(){
        int sum = 0;
        for (int i = 0; i < staffList.size(); i++) {
            if(staffList.get(i).getStatus().equals("Dang lam")){
                sum += staffList.get(i).getSalary();
            }
        }
        System.out.println("Tong luong nhan vien: "+ sum);
    }
}