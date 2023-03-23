package baithuchanhlab2;
import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so a: ");
        a = sc.nextInt();
        System.out.println("nhap vao so b: ");
        b = sc.nextInt();
        int tong = a + b;
        System.out.println(a + " + " + b + " = " + tong);
        int hieu = a - b;
        System.out.println(a + " - " + b + " = " + hieu);
        float thuong = a / b;
        System.out.println(a + " / " + b + " = " + thuong);
        float laydu= a % b;
        System.out.println(a + " % " + b + " = " +laydu);
        {
            if(a<b){
                System.out.println(" so nho la: " +a);
            } else{
                System.out.println("so nho la: " +b);
           
            }
        }
    }
}
