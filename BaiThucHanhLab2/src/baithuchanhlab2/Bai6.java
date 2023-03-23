package baithuchanhlab2;
import java.util.Scanner;
public class Bai6 {
    public static void main(String[] args){
        int giaithua = 1;
        int n;
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so nguyen duong: ");
        n = sc.nextInt();
        for(i=1; i<=n; i++){
            giaithua = giaithua * i;
        }
        System.out.println(" giai thua cua " + n +  " la: " + giaithua);
                
        
    }
}
