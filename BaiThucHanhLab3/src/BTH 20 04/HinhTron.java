package BTH2704;
import java.util.Scanner;
public class HinhTron extends HinhHoc {
    private float banKinh;
    public HinhTron(){
        setTen("Hinh Tron");
    }

    public float getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(float banKinh) {
        this.banKinh = banKinh;
    }
    public void nhapBanKinh(){
        System.out.println("Ban kinh = ");
        Scanner scanner = new Scanner(System.in);
        banKinh = scanner.nextFloat();
    }
    public void tinhChuVi(){
        chuVi = 2 * PI * banKinh;
    }
    public void tinhDienTich(){
        dienTich = PI * banKinh * banKinh;
    }
    
}