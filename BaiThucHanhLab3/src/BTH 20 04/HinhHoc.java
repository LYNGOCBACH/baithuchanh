package BTH2704;
public class HinhHoc {
    public final float PI = 3.14f;
    private String ten;
    public float chuVi;
    public float dienTich;
    public float theTich;
    public void xuatTen(){
        System.out.println("\n\n==== " + ten + " ====");
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public float getChuVi() {
        return chuVi;
    }

    public void setChuVi(float chuVi) {
        this.chuVi = chuVi;
    }

    public float getDienTich() {
        return dienTich;
    }

    public void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }

    public float getTheTich() {
        return theTich;
    }

    public void setTheTich(float theTich) {
        this.theTich = theTich;
    }
    public void inChuVi(){
        System.out.println("Chu vi = " + chuVi);
    }
    public void inDienTich(){
        System.out.println("Dien Tich = " + dienTich);
    }
    public void inTheTich(){
        System.out.println("The tich = " + theTich);
    }
}