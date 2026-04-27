package VONG_LAP;

import java.util.Scanner;

public class bai14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so: ");
          int n = sc.nextInt();
             int i = 1;
             long giaiThua = 1; // Bắt đầu từ 1
           while (i <= n){
           giaiThua = giaiThua * i; // Nhân dồn vào
           i++;
        }
            System.out.println(n + "! = " + giaiThua);
            sc.close();
    }
    
}
