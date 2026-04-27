package VONG_LAP;
import java.util.Scanner;
public class baitap4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so: ");
          int n = sc.nextInt();
             long giaiThua = 1; // Bắt đầu từ 1

           for (int i = 1; i <= n; i++) {
           giaiThua = giaiThua * i; // Nhân dồn vào
        }
            System.out.println(n + "! = " +  giaiThua);
            sc.close();
    }
    
   
}

