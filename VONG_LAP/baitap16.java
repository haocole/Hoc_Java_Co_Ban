package VONG_LAP;

import java.util.Scanner;

public class baitap16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tong = 0;
        String sInput;

        System.out.println("Chuong trinh se dung khi tong dat >= 10");

        // Vong lap: Chừng nào tong vẫn còn NHỎ HƠN 10
        while (tong < 10) {
            System.out.print("Nhap so: ");
            sInput = sc.nextLine();

            // Kỹ thuật kiểm tra xem chuỗi nhập vào có phải là số không
            try {
                int soHienTai = Integer.parseInt(sInput); // Chuyển chữ thành số
                tong += soHienTai; // Cộng dồn
                System.out.println("-> Ban vua nhap so: " + soHienTai + ". Tong hien tai = " + tong);
            } catch (NumberFormatException e) {
                // Nếu người dùng nhập chữ (không phải số), máy sẽ nhảy vào đây
                System.out.println("-> [" + sInput + "] khong phai la so. Toi se khong cong vao tong.");
            }
        }

        System.out.println("Tong da dat " + tong + " (lon hon hoac bang 10). DUNG CHUONG TRINH!");
        sc.close();
    }
    
}
