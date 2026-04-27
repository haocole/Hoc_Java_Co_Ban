package VONG_LAP;
import java.util.Scanner;
public class baitap3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       System.out.print("Nhap n: ");
        int n = sc.nextInt();

        int tong = 0;

        for (int i = 1; i <= n; i++) {
            tong += i; // Cộng dồn i vào tổng

            // Xử lý in định dạng
            if (i == n) {
                System.out.print(i + " = "); // Số cuối cùng thì in dấu "="
            } else {
                System.out.print(i + " + "); // Chưa đến số cuối thì in dấu "+"
            }
        }

        System.out.println(tong); // In kết quả cuối cùng 
    }
    
}
