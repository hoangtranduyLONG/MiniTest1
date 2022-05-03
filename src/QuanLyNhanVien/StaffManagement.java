package QuanLyNhanVien;

import java.util.ArrayList;
import java.util.List;

public class StaffManagement  {
      List<Staff> list = new ArrayList<>();


    public  void add(Staff staff){
        list.add(staff);
    }
    public void hienThi(){
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }
    public void timKiemTen(String name){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().contains(name)){
                System.out.println(list.get(i));
            }
        }
    }


}