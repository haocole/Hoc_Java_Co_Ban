package DIEU_KIEN;

import java.util.Scanner;

public class bt8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Bước 1: Nhập 3 cạnh của tam giác
        System.out.print("Nhap canh a: ");
        double a = sc.nextDouble();
        System.out.print("Nhap canh b: ");
        double b = sc.nextDouble();
        System.out.print("Nhap canh c: ");
        double c = sc.nextDouble();

        // Bước 2: Kiểm tra xem 3 cạnh có tạo thành tam giác không
        // (Tổng 2 cạnh bất kỳ phải lớn hơn cạnh còn lại)
        if (a + b > c && a + c > b && b + c > a) {
            
            // Bước 3: Xác định loại tam giác
            if (a == b && b == c) {
                // Cả 3 cạnh bằng nhau
                System.out.println("Day la tam giac deu.");
            } 
            else if (a == b || b == c || a == c) {
                // Có ít nhất 2 cạnh bằng nhau
                System.out.println("Day la tam giac can.");
            } 
            else {
                // Không có cạnh nào bằng nhau
                System.out.println("Day la tam giac thuong.");
            }
            
        } else {
            System.out.println("Ba canh nay khong tao thanh mot tam giac!");
        }
    }
    
}
