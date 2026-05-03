package MANG_ARRAY;

import java.util.Scanner;

public class InPhanTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Nhập kích thước mảng
        System.out.print("Nhap so luong phan tu cua mang: ");
        int n = sc.nextInt();

        // 2. Khởi tạo mảng với kích thước n
        int[] arr = new int[n];

        // 3. Vòng lặp để nhập từng phần tử
        System.out.println("--- Nhap gia tri cua mang ---");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        // 4. In mảng ra màn hình
        System.out.println("\n--- Mang ban vua nhap la ---");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        
    }
}
