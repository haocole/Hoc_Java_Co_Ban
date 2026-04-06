package TOAN_TU;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        // Bước 2: Khởi tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner sc = new Scanner(System.in);

        // Bước 3: Thông báo và nhận dữ liệu
        System.out.print("Nhap so thu nhat (a): ");
        double a = sc.nextDouble(); 

        System.out.print("Nhap so thu hai (b): ");
        double b = sc.nextDouble();

        // Bước 4: Tính toán các giá trị
        double tong = a + b;
        double hieu = a - b;
        double tich = a * b;
        double thuong = a / b;

        // Bước 5: Hiển thị kết quả làm tròn 2 chữ số thập phân
        System.out.println("---------- KET QUA ----------");
        System.out.printf("Tong   : %.2f \n", tong);
        System.out.printf("Hieu   : %.2f \n", hieu);
        System.out.printf("Tich   : %.2f \n", tich);
        System.out.printf("Thuong : %.2f \n", thuong);
       
        System.out.println("-----------------------------");

       
    }
}

