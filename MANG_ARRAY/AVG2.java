package MANG_ARRAY;

import java.util.Scanner;

public class AVG2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Bước 1: Nhập số lượng phần tử
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        int tong = 0;
        
        // Bước 2: Nhập từng phần tử và cộng dồn luôn để tối ưu
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            arr[i] = sc.nextInt();
            tong += arr[i]; // Cộng dồn ngay khi vừa nhập xong
        }
        
        // Bước 3: Tính trung bình cộng
        double trungBinh = (double) tong / n;
        
        System.out.println("--- Kết quả ---");
        System.out.println("Tổng: " + tong);
        System.out.println("Trung bình cộng: " + trungBinh);
        
        sc.close(); // Đóng scanner để giải phóng tài nguyên
    }
    
}
