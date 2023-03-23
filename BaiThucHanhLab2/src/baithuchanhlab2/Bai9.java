package baithuchanhlab2;
import java.util.Scanner;
public class Bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao chuoi bat ky: ");
        String input = scanner.nextLine();
        scanner.close();

        int inhoa = 0, inthuong = 0, chuso = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isUpperCase(c)) {
                inhoa++;
            } else if (Character.isLowerCase(c)) {
                inthuong++;
            } else if (Character.isDigit(c)) {
                chuso++;
            }
        }

        System.out.println("So ky tu in hoa trong chuoi: " + inhoa);
        System.out.println("So ky tu in thuong trong chuoi: " + inthuong);
        System.out.println("So chu so trong chuoi: " + chuso);
    }
}

