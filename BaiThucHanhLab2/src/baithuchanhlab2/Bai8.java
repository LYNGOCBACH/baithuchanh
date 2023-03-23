package baithuchanhlab2;
import java.util.Scanner;
public class Bai8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); // create scanner object
        int n;
        System.out.println("nhap vao so luong phan tu cua day so: ");
        n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("nhap vao so thu " + (i+1) + ": ");
             a[i] = sc.nextInt();    
        }
        double tong = 0;
        
       
for(int i = 0; i < n; i++){
            tong = tong + a[i];
        }
double tb = tong/n;
        System.out.println("tung binh cong cua cac phan tu la: " + tb);
         }
}

   