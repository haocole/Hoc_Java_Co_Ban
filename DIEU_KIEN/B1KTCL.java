package DIEU_KIEN;
import java.util.Scanner;

public class B1KTCL {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);

        System.out.print("Nhap so nguyen: ");
        int so = nhap.nextInt();

        if (so % 2 == 0){
            System.out.print(so +  " La so chan ");
        }
        else {
            System.out.print(so + " La so le ");
        }

nhap.close();
    }
    
}
