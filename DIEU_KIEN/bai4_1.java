package DIEU_KIEN;

import java.util.Scanner;

public class bai4_1 {
     public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        
        System.out.print("Nhap ten hoc sinh: ");
        String ten = nhap.nextLine();

        float diem_it, diem_ta, diem_plt;

        // Chặn nhập điểm IT
        do {
            System.out.print("Nhap diem mon IT (0-10): ");
            diem_it = nhap.nextFloat();
            if (diem_it < 0 || diem_it > 10) System.out.println("Nhap sai, hay nhap lai!");
        } while (diem_it < 0 || diem_it >10);

        // Chặn nhập điểm English
        do {
            System.out.print("Nhap diem mon English (0-10): ");
            diem_ta = nhap.nextFloat();
            if (diem_ta <0 || diem_ta > 10) System.out.println("Nhap sai, hay nhap lai!");
        } while (diem_ta < 0 || diem_ta >10);

        // Chặn nhập điểm PLT
        do {
            System.out.print("Nhap diem mon PLT (0-10): ");
            diem_plt = nhap.nextFloat();
            if (diem_plt <0 || diem_plt >10) System.out.println("Nhap sai, hay nhap lai!");
        } while (diem_plt < 0 || diem_plt >10);

        float diemtb = (diem_it + diem_ta + diem_plt) / 3;

        System.out.print("Ket qua: ");
        if (diemtb >= 8) {
            System.out.println(ten + " la hoc sinh gioi");
        } else if (diemtb >= 6.5) {
            System.out.println(ten + " la hoc sinh kha");
        } else if (diemtb >= 5) {
            System.out.println(ten + " la hoc sinh trung binh");
        } else {
            System.out.println(ten + " la hoc sinh yeu");
        }

        nhap.close();
    }
    
}
