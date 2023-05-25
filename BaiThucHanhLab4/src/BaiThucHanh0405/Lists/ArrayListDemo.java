package BaiThucHanh0405.Lists;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListDemo {
    public static void main(String[] args) {
         ArrayList<Student> stdList = new ArrayList<>();
         Scanner sc = new Scanner(System.in);
         int b = 0;
         Student.nhapthongtin(stdList, b);
         Student.hienthithongtin(stdList);
         System.out.println("1. hien thi thong tin sinh vien");
         System.out.println("2. sua thong tin sinh vien");
         System.out.println("3. xoa thong tin sinh vien");
         System.out.println("vui long lua chon chuc nang");
         int n = sc.nextInt();
         switch(n){
             case 1:
                 Student.hienthithongtin(stdList);
                 break;
             case 2:
                 Student.suathongtin(stdList);
                 Student.hienthithongtin(stdList);
                 break;
             case 3:
                 Student.xoathongtin(stdList);
                 Student.hienthithongtin(stdList);
                 break;
             default: System.out.println("lua chon khong họp le");
         }

    }
    
}
