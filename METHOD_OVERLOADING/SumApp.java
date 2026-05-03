package METHOD_OVERLOADING;

import java.util.Scanner;

public class SumApp {
    static int tinh_tong(int a, int b ){
        return (a+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so 1: ");
        int so1 = sc.nextInt();
        System.out.print("Nhap so 2: ");
        int so2 = sc.nextInt();
        int tong = tinh_tong(so1,so2);
        System.out.printf("%d + %d = %d", so1,so2, tong);
    }

    
}
