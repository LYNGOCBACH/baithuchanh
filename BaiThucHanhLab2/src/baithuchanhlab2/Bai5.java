package baithuchanhlab2;
import java.util.Scanner;
public class Bai5 {
    public static void main(String[] args) {
        int n;
        int tong = 0;
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.println("nhap vao so nguyen: ");
            n = sc.nextInt();
            tong = tong + n;
        }while(tong < 100);
            System.out.println("tong cac so da nhap la: " + tong);
        }
}

    
        
        

        
    
