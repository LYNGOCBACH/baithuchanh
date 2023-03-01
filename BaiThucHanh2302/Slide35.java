package Slide35;
import java.util.Scanner;
public class Slide35 {
    static float a;
    static float b;
    static void nhap(){
        Scanner sc =new Scanner(System.in);
        System.out.print("Nhap vao so a: ");
        a=sc.nextFloat();
        System.out.print("Nhap vao so b: ");
        b=sc.nextFloat();
    }
    static void soSanh(){
        if(a<b){
            System.out.print("So nho nhat la a: "+a);
        }
        else{
            System.out.println("So nho nhat la b: "+b);
        }
    }
    public static void main(String[] args) {
        nhap();
        soSanh();
    }
}
