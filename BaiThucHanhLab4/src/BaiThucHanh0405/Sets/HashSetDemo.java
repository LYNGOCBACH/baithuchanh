package BaiThucHanh0405.Sets;
import BaiThucHanh0405.Lists.Student;
import java.util.HashSet;
import java.util.Scanner;

public class HashSetDemo {
    public static void main(String[] args) {
         HashSet<Student> hashset = new HashSet<>();
         Scanner sc = new Scanner(System.in);
         int b = 0;
         Student.nhapthongtinhashset(hashset, b);
         Student.hienthithongtinhashset(hashset);
         System.out.println("1. hien thi thong tin sinh vien");
         System.out.println("2. sua thong tin sinh vien");
         System.out.println("3. xoa thong tin sinh vien");
         System.out.println("vui long lua chon chuc nang");
         int n = sc.nextInt();
         switch(n){
             case 1:
                 Student.hienthithongtinhashset(hashset);
                 break;
             case 2:
                 Student.suathongtinhashset(hashset);
                 Student.hienthithongtinhashset(hashset);
                 break;
             case 3:
                 Student.xoathongtinhashset(hashset);
                 Student.hienthithongtinhashset(hashset);
                 break;
             default: System.out.println("lua chon khong họp le");
         }

    }
    
}