package DIEU_KIEN;
import java.util.Scanner;
public class B6_Kiểm_tra_bội_7 {
    public static void main(String[] args){
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập một số nguyên: ");
        int n = nhap.nextInt();

        if (n % 7 == 0) {
            System.out.println(n + " là bội của 7.");
        } else {
            System.out.println(n + " không phải là bội của 7.");
        }
        nhap.close();
    }
    
}
