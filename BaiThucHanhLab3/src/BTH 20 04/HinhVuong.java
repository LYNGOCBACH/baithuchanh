package BTH2704;
import java.util.Scanner;
public class HinhVuong extends HinhChuNhat {
    private float canh;

    public float getCanh() {
        return canh;
    }
    public HinhVuong(){
        setTen("Hinh Vuong");
    }
    public void nhapCanh(){
        System.out.println("Canh = ");
        Scanner scanner = new Scanner(System.in);
        this.canh = scanner.nextFloat();
    }
    
}
