package BTH2704;
import java.util.Scanner;
public class HinhChuNhat extends HinhHoc {
    private float dai;
    private float rong;

    public float getDai() {
        return dai;
    }

    public float getRong() {
        return rong;
    }
  
    public HinhChuNhat(){
        setTen("Hinh Chu Nhat");
    }
    public void setnhapChieuDai(){
        System.out.println("Chieu dai = ");
        Scanner scanner = new Scanner(System.in);
        this.dai = scanner.nextFloat();
    }
    public void setnhapChieuRong(){
        System.out.println("Chieu rong = ");
        Scanner scanner = new Scanner(System.in);
        this.rong = scanner.nextFloat();
    }
    public void tinhChuVi(){
        chuVi = 2 * (dai + rong);
    }
    public void tinhDienTich(){
        dienTich = dai * rong;
    }
}