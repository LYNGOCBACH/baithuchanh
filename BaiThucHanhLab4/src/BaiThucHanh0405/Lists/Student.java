package BaiThucHanh0405.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
public class Student {

    
    public String fullname;
    public int age;
    public void add(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ho ten: ");
        fullname = sc.nextLine();
        System.out.println("nhap tuoi: ");
        age = sc.nextInt();
    }
    // nhap thong tin 
    public static void nhapthongtin(List<Student> list, int n){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so phan tu sinh vien: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i ++){
            Student std = new Student();
            std.add();
            list.add(std);
        }
        
    }
    public static void nhapthongtinhashset(Set<Student> set, int n){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so phan tu sinh vien: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i ++){
            Student std = new Student();
            std.add();
            set.add(std);
        }
        
    }
    // hien thi thong tin 
    public static void hienthithongtin(List<Student> list){
        System.out.println("danh sach sinh vien da nhap ");
        for (int i = 0; i < list.size(); i ++){
            System.out.printf("ho va ten: " + list.get(i).fullname);
            System.out.println("tuoi: " + list.get(i).age);
        }
    }
     public static void hienthithongtinhashset(Set<Student> set){
        System.out.println("danh sach sinh vien da nhap ");
        for (Student stdset : set){
            System.out.printf("ho va ten: " + stdset.fullname);
            System.out.println("tuoi: " + stdset.age);
        }
    }
    
    // sua thong tin
 public static void suathongtin(List<Student> list){
        // nhap họ và tên  can sửa
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao ho va ten can sua: ");
        String ten = sc.nextLine();
        // tìm họ và tên và sửa
        for (int i = 0; i < list.size(); i++){
            if(list.get(i).fullname.equals(ten)){
                Student std = new Student();
                std.add();
                list.set(i,std);
            }
            else{
                System.out.println("ho va ten khong tim thay");
            }
  
            
        }
    }
  public static void suathongtinhashset(Set<Student> set){
        // nhap họ và tên  can sửa
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao ho va ten can sua: ");
        String ten = sc.nextLine();
        // tìm họ và tên và sửa
        for (Student stdset : set){
            if(stdset.fullname.equals(ten)){
                Student std = new Student();
                std.add();
            }
            else{
                System.out.println("ho va ten khong tim thay");
            }
  
            
        }
    }
// xoa thong tin
    public static void xoathongtin(List<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ho va ten can xoa: ");
        String name = sc.nextLine();
        for (int i = 0; i < list.size(); i ++){
            if (list.get(i).fullname.equals(name)){
            list.remove(i);
                    }
            else{
                System.out.println("khong tim thay ho va ten");
            }
        }
        
    }
    public static void xoathongtinhashset(Set<Student> set){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ho va ten can xoa: ");
        String name = sc.nextLine();
        for (Student stdset : set){
            if (stdset.fullname.equals(name)){
            set.remove(stdset);
                    }
            else{
                System.out.println("khong tim thay ho va ten");
            }
        }
        
    }
    
}