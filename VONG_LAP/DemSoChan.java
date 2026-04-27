package VONG_LAP;
import java.util.Scanner;
public class DemSoChan {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();

        int count = 0;
        for (int i = 1; i <= n; ++i){
            if (i % 2 == 0){
                count++; // tăng biến đếm lên 
            }

        }
        System.out.println("Co " + count + " so chan tu 1 den " + n);


    }
    }
    

