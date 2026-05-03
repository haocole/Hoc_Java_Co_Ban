package MANG_ARRAY;
import java.util.Scanner;
public class count_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap so luong phan tu: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        System.out.print("---Nhap du lieu---");
        for(int i = 0; i < n; i++){
            System.out.print("Nhap phan tu numbers["+ i + "]: ");
            numbers[i] = sc.nextInt();
        }
        int count = 0;
        for(int i= 0; i < n; i++){
            if(numbers[i]< 0){
                count++;
            }
        }
        System.out.println("so luong phan tu am trong mang la: "+ count);
        sc.close();
    }
}
