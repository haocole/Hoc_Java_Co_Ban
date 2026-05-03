package MANG_ARRAY;
import java.util.Scanner;
public class MaxArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Nhap numbers[" + i + "]: ");
            numbers[i] = sc.nextInt();
        }
        int max = numbers[0];
        for(int i = 1; i < n; i++){
            if (numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println("Phan tu lon nhat trong mang la: "+ max);

        }
    }
    

