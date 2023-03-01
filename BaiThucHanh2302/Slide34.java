package Slide34;
import static java.lang.Math.abs;
import java.util.Scanner;
public class Slide34 {
    static float a, b, c;
    static float delta;
    static void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.print("nhap vao a: ");
        a=sc.nextFloat();
        System.out.print("nhap vao b: ");
        b=sc.nextFloat();
        System.out.print("nhap vao c: ");
        c=sc.nextFloat();
        
    }
    static float tinhDelta(){
        delta=b*b-4*a*c;
        return delta;
    }
    static void timNghiem(){
        if(tinhDelta()>0){
            System.out.println("Phuong trinh co 2 nghiem la:");
            System.out.println("Nghiem 1: " + (-b-abs(tinhDelta()))/(2*a));
            System.out.println("Nghiem 2: " + (-b+abs(tinhDelta()))/(2*a));
        }
        else if(tinhDelta()==0){
            System.out.println("phuong trinh co nghiem kep la: "+ -b/(2*a));
        }
        else {
            System.out.println("Vo nghiem!");
        }
    }
    public static void main(String[] args) {
        nhap();
        tinhDelta();
        timNghiem();
    }
}
