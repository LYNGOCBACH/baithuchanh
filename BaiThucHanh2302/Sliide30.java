package Sliide30;

import java.util.Scanner;
public class Sliide30 {
    static int n;
    static float m;
    static int dem=0;
    static int a[];
    static int tong;
    static void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap tu ban phim so n bat ky: ");
        n=sc.nextInt();
        m=n;
    }
    static int tinhSoPTu(){
        do{
            dem=dem+1;
            m/=10;
        } while(m>9.999);
        return dem;
    }
    static void cacCSTrongn(){
        a=new int[dem];
        for(int i=0; i<a.length;i++){
            a[i] = n%10;
            n=n/10;
        }
        
    }
    static int tong(){
        for(int i=0; i<a.length;i++){
            tong+=a[i];
        }
        return tong;
    }
    public static void main(String[] args) {
        nhap();
        tinhSoPTu();
        tinhSoPTu();
        cacCSTrongn();
        System.out.println("tong cac chu so cua n: "+ tong());
    }
}
