package MANG_ARRAY; // tính tổng các phần tử
import java.util.Scanner;
public class TotalPhanTu {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;  // biến để lưu trữ
        for(int i = 0; i < n; i++){
            System.out.print("Nhap arr[" + i + "]: ");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println("Tong cua phan tu la: "+ sum);

    }
    
}
