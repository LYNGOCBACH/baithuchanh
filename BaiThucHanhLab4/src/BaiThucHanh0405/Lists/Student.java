package BaiThucHanh0405.Lists;
import java.util.List;
import java.util.Scanner;
public class Student {
    String Fullname;
    int Age;
    // add 
    public  void add(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ho va ten: ");
        Fullname = sc.nextLine();
        System.out.println("nhap vao tuoi: ");
        Age = sc.nextInt();
    }
    // nhập thông tin
    public static void nhapthongtin(List<Student> list, int n){
        for (int i = 0; i < n; i++){
            Student std = new Student();
            std.add();
            list.add(std);   
        }
        
    }
    // hiển thị thông tin
    public static void hienthithongtin(List<Student> list){
        for (int i = 0; i < list.size(); i++){
            System.out.printf("ho va ten: " + list.get(i).Fullname);
            System.out.println("tuoi: " + list.get(i).Age);
        }
    }
    // sửa thông tin 
    
    public static void suathongtin(List<Student> list){
        // nhap họ và tên  can sửa
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao ho va ten can sua: ");
        String ten = sc.nextLine();
        // tìm họ và tên và sửa
        for (int i = 0; i < list.size(); i++){
            if(list.get(i).Fullname.equals(ten)){
                Student std = new Student();
                std.add();
                list.set(i,std);
            }
            else{
                System.out.println("ho va ten khong tim thay");
            }
  
            
        }
    }
    // xóa thông tin
    public static void xoathongtin(List<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao ho va ten can xoa: ");
        String ten = sc.nextLine();
        for (int i = 0; i < list.size(); i++){
            if(list.get(i).Fullname.equals(ten)){
               list.remove(i);
            }
            else{
                System.out.println("ho va ten khong tim thay");
            }
        }
    }
}

