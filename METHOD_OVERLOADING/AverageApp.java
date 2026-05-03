package METHOD_OVERLOADING;
import java.util.Scanner;
public class AverageApp {
    public static void tinhTrungBinh(double[] mang) {
        double tong = 0;
        for (int i = 0; i < mang.length; i++) {
            tong += mang[i];
        }
        double tb = tong / mang.length;
        for (int i = 0; i < mang.length; i++) {
            mang[i] = tb;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            System.out.print("Nhap so luong: ");
            int n = sc.nextInt();
            
            double[] a = new double[n];

            for(int i = 0; i < n; i++){
                System.out.println("phan tu thu "+ (i + 1) + ":");
                a[i] = sc.nextDouble();

            }
             tinhTrungBinh(a);
            System.out.println("Mang sau khi cap nhat:");
            for(double x : a) System.out.print(x + " ");


        
    }
    
}
