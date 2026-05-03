package TESTOBJECT;

import java.util.Scanner;

import OBJECT.Phone;

public class testPhone {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Phone[] ds = new Phone[3];

        /////// 1. NHẬP DỮ LIỆU
        for (int i = 0; i < ds.length; i++) {
            System.out.println("Nhap thong tin may thu " + (i + 1));
            System.out.print("Ten: "); String ten = sc.nextLine();
            System.out.print("Gia: "); double gia = Double.parseDouble(sc.nextLine());
            ds[i] = new Phone(ten, gia);
        }

        /////// 2. TÌM MÁY CÓ GIÁ CAO NHẤT (Dùng GET để truy cập)
        // Giả sử máy đầu tiên (index 0) là máy đắt nhất
        int indexMax = 0; 
        for (int i = 1; i < ds.length; i++) {
            // Dùng GET để lấy giá của máy thứ i so sánh với máy max hiện tại
            if (ds[i].getGia() > ds[indexMax].getGia()) {
                indexMax = i;
            }
        }
        System.out.println("\n=> May dat nhat hien tai la: " + ds[indexMax].getTenMay() 
                            + " voi gia: " + ds[indexMax].getGia());

        /////// 3. CẬP NHẬT GIẢM GIÁ 10% (Dùng GET để lấy giá cũ và SET để ghi giá mới)
        System.out.println("\n--- Dang cap nhat giam gia 10% cho tat ca cac may... ---");
        for (int i = 0; i < ds.length; i++) {
            // Bước 3.1: Lấy giá cũ ra bằng GET
            double giaCu = ds[i].getGia();
            
            // Bước 3.2: Tính giá mới
            double giaMoi = giaCu * 0.9;
            
            // Bước 3.3: Đưa giá mới vào lại túi của đối tượng bằng SET
            ds[i].setGia(giaMoi);
        }

        /////// 4. IN KẾT QUẢ CUỐI CÙNG ĐỂ KIỂM TRA
        System.out.println("\n--- DANH SACH SAU KHI CAP NHAT ---");
        for (Phone p : ds) {
            System.out.println("Ten: " + p.getTenMay() + " | Gia moi: " + p.getGia());
        }
    }
    
}
