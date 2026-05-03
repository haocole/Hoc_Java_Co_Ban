package TESTOBJECT;

import OBJECT.Rectangle;
import java.util.Scanner;
public class testRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

///////// tạo ob và gán
        Rectangle r = new Rectangle(10.7, 5.2);
        // in kết quả
        // System.out.printf("Hinh chu nhat{%.2f, %.2f}", r.getChieuDai(), r.getChieuRong());
        //System.out.printf("Hinh chu nhat{%.2f, %.2f, %.2f}", r.getChieuDai(), r.getChieuRong(), r.tinhDienTich());

        // in kết quả
        // System.out.println("Dien tich ban dau: " + r.tinhDienTich());

///////// cập nhật bằng setter
         Rectangle r2 = new Rectangle();
        r2.setChieuDai(3);
        r2.setChieuRong(5);
        System.out.println("Dien tich moi: " + r2.tinhDienTich());

// ////////test constructor rỗng
//         Rectangle r2 = new Rectangle();
//         System.out.println("Dien tich r2: " + r2.tinhDienTich());

//         System.out.println("So hinh da tao: " + Rectangle.count);

// //////// Tạo nhập mới 
        System.err.println("---CAP NHAT  THAY DOI DU LIEU---");
        System.out.print("Nhap chieu dai: ");
        double D = sc.nextDouble();
        System.out.print("Nhap chieu rong: ");
        double R = sc.nextDouble();
// //////// Tạo object mới 
        Rectangle T = new Rectangle(D, R);
       //System.err.printf("Chieu dai: %.2f", D);
       //System.err.printf("\nChieu dai: %.2f", R);
        System.out.printf("Hinh chu nhat{%.2f, %.2f, %.2f}", T.getChieuDai(), T.getChieuRong(), T.tinhDienTich());
// //////// đếm object
         System.out.println("\nSo hinh da tao: " + Rectangle.count);



         sc.close();
    
    
    }
    
}
