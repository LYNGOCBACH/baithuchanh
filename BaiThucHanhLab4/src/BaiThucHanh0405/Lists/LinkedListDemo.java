package BaiThucHanh0405.Lists;


import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListDemo {
    public static void main(String[] args) {
         LinkedList<Student> LikedList = new LinkedList<>();
         Scanner sc = new Scanner(System.in);
         int b = 0;
         Student.nhapthongtin(LikedList, b);
         Student.hienthithongtin(LikedList);
         System.out.println("1. hien thi thong tin sinh vien");
         System.out.println("2. sua thong tin sinh vien");
         System.out.println("3. xoa thong tin sinh vien");
         System.out.println("vui long lua chon chuc nang");
         int n = sc.nextInt();
         switch(n){
             case 1:
                 Student.hienthithongtin(LikedList);
                 break;
             case 2:
                 Student.suathongtin(LikedList);
                 Student.hienthithongtin(LikedList);
                 break;
             case 3:
                 Student.xoathongtin(LikedList);
                 Student.hienthithongtin(LikedList);
                 break;
             default: System.out.println("lua chon khong họp le");
         }

    }
    
}