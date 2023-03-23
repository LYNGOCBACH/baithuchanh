package baithuchanhlab2;
import java.util.Scanner;
public class Bai3 {
    static String ten;
    static int tuoi;
    public static void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap vao ten: ");
        ten=sc.nextLine();
        System.out.print("Nhap cao tuoi: ");
        tuoi=sc.nextInt();
    }
    public static void kiemTra(){
        if(tuoi<16)     System.out.println("Ban "+ten+"  o tuoi vi thanh nien");
        if(tuoi>=16 && tuoi<18)     System.out.println("Ban "+ten+" o tuoi truong thanh");
        else    System.out.println("Ban da gia");
    }
    public static void main(String[] args) {
        nhap();
        kiemTra();
    }
}
    

