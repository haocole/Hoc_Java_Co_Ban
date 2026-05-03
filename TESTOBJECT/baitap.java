package TESTOBJECT;
import java.util.Scanner;
public class baitap {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu: ");
        int n = sc.nextInt();

        double[] a = new double[n];
        for(int i =0; i < n; i++){
            System.out.print("nhap phan tu: " + (i+1) +":");
            a[i] = sc.nextDouble();

        }
        double tong = 0;
        double max = a[0];
        for(int i = 1; i < n; i++){
            tong += a[i];
            if(a[i] > max){
                max = a[i];
            }
        }
        System.out.println("-----KET QUA ----");
        System.out.println("Tong phan tu trong mang: " + tong);
        System.out.println("So lon nhat trong mang la: " + max);
    }
    
}
