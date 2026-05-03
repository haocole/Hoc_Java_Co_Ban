package DIEU_KIEN;
import java.util.Scanner;
public class B5_kt_Năm_nhuận {
    public static void main(String[] args){
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập một năm: ");
        int nam = nhap.nextInt();

        if ((nam % 400 == 0) || (nam % 4 == 0 && nam % 100 != 0)) {
            System.out.println(nam + " là năm nhuận.");
        } else {
            System.out.println(nam + " không phải năm nhuận.");
        }
        nhap.close();
    }
}
