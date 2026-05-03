package DIEU_KIEN;
import java.util.Scanner;
public class B5_Kiểm_tra_số_chia_hết_cho3_5 {
    public static void main(String[] args){
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập một số nguyên: ");
        int n = nhap.nextInt();

        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println(n + " chia hết cho cả 3 và 5.");
        } else {
            System.out.println(n + " không chia hết cho đồng thời cả 3 và 5.");
        }
        nhap.close();

    }
    
}
