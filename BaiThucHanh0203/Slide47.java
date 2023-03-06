import java.util.Scanner;
public class Slide47 {
    public static void main(String[] args) {
        int a[];
               
        int tong=0;
        int i=1;
        Scanner sc=new Scanner(System.in);
        a=new int[20];
        do{
            System.out.print("nhap vao so thu "+ i +": ");
            a[i]=sc.nextInt();
            tong = tong+a[i];
            i++;
        }while(tong<=100);
        System.out.println("Tong cua cac chu so vua nhap la: "+ tong );
    }
}