package BaiThucHanh0405.Lists;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         ArrayList<Student> stdList = new ArrayList<>();
        int choice;

        do {
            System.out.println("1. Nhap thong tin");
            System.out.println("2. Hien thi thong tin");
            System.out.println("3. Them moi thong tin");
            System.out.println("4. Sua thong tin");
            System.out.println("5. Xoa thong tin");
            System.out.println("6. Thoat");

            System.out.print("Lua chon: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Student.add(stdList);
                    break;
                case 2:
                    Student.nhapthongtin(stdList);
                    break;
                case 3:
                    Student.hienthithongtin(stdList);
                    break;
                case 4:
                    Student.suathongtin(stdList);
                    break;
                case 5:
                    Student.xoathongtin(stdList);
                    break;
                case 6:
                    System.out.println(" ");
                default:
                    System.out.println("Lua chon khong hop le vui long chon lai");
                    break;
            }

        } while (choice != 6);

    }
}
