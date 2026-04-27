package VONG_LAP;

import java.util.Scanner;

public class TamGiacSao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số dòng n: ");
        int n = sc.nextInt();

        // Vòng lặp ngoài quản lý số dòng
        for (int i = 1; i <= n; i++) {
            
            // Vòng lặp trong quản lý số dấu sao trên mỗi dòng
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // In dấu sao nhưng không xuống dòng
            }
            
            System.out.println(); // Sau khi in xong sao ở một dòng thì mới xuống dòng
        }
    
}
}
