package VONG_LAP;

import java.util.Scanner;

public class baitap13 {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       System.out.print("Nhap n: ");
        int n = sc.nextInt();

        int i = 1;
        int tong = 0;
        while( i <= n){
            tong += i;
           // Xử lý in định dạng
            if (i == n) {
                System.out.print(i + " = "); // Số cuối cùng thì in dấu "="
            } else {
                System.out.print(i + " + "); // Chưa đến số cuối thì in dấu "+"
            }
            i++;
        }
        

        System.out.println(tong); // In kết quả cuối cùng 
    }
    
}
