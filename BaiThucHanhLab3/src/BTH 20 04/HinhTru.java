package BTH2704;
import java.util.Scanner;
public class HinhTru extends HinhTron {
    private float chieuCao;

    public float getChieuCao() {
        return chieuCao;
    }
    public HinhTru(){
        setTen("Hinh Tru");
    }
    public void setnhapChieuCao(){
        nhapBanKinh();
        System.out.println("Chieu cao = ");
        Scanner scanner = new Scanner(System.in);
        this.chieuCao = scanner.nextFloat();
    }
    public void tinhTheTich(){
        tinhDienTich();
        theTich = dienTich * chieuCao;
    }
}