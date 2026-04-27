package VONG_LAP;

import java.util.Scanner;

public class baitap4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        float giaiThua = 1;

        System.out.print( n +"!"+ " = ");
        for (int i = 1; i <= n; i++) {
            giaiThua *= i;
            
            // Xử lý in dấu " x " hoặc dấu " = "
            if (i == n) {
                System.out.print(i + " = ");
            } else {
                System.out.print(i + " x ");
            }
        }
        System.out.println(giaiThua);
        sc.close();
    }
    
}
