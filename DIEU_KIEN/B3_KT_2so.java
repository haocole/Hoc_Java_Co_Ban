package DIEU_KIEN;
import java.util.Scanner;
public class B3_KT_2so {
    public static void main(String[] args){
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
            int a = nhap.nextInt();
            
            System.out.print("Nhập số thứ hai: ");
            int b = nhap.nextInt();

            // KIỂM TRA BẰNG NHAU
            if (a == b) {
                System.out.println("Kết quả: " + a + " và " + b + " bằng nhau.");
            } else {
                System.out.println("Kết quả: " + a + " và " + b + " không bằng nhau.");
            }

            nhap.close();
    }
}
