public class Slide55 {
    static int a[];
    static int n=0,x=0;
    
    public static void main(String[] args) {
        int j=0;
        a=new int[41];
        for(int i = 0;i<201; i++){
            if(i%5==0){
                a[j]=i;
                j++;
            }
        }
        System.out.print("Cac chua so chia het cho 5: ");
        for(int i = 0; i<a.length; i++){
            System.out.print(" "+ a[i]);
        }
        System.out.println("");
    }
}