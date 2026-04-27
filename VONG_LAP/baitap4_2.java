package VONG_LAP;
import java.util.Scanner;
public class baitap4_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so: ");
        int n = sc.nextInt();
        int giaithua = 1;
        int i = 1;
        System.out.print(n + "!" + "=");
        do{
            giaithua *= i; 
            i++;
         } while (i <= n);
         System.out.println(giaithua);
         
         sc.close();
    }
    
}
