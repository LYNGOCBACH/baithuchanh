import java.util.Scanner;
public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi khong qua 80 ky tu: ");
        String str = sc.nextLine();
        System.out.print("Nhap mot ky tu bat ky: ");
        char ch = sc.next().charAt(0);
        
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        
        System.out.println("Ky tu " + ch + " xuat hien " + count + " lan trong chuoi.");
    }
}
    

