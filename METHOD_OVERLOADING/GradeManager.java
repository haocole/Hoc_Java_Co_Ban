package METHOD_OVERLOADING;

import java.util.Scanner;

public class GradeManager {
    // 1. khai báo hàm tính toán
    public static double tinhDTB(double m1, double m2, double m3){
        return (m1 + m2 + m3) / 3;
    }
    // 2 phân loại
    public static String xeploai(double dtb){
        if(dtb >= 8.0) return "Gioi";
        if(dtb >= 6.5) return "Kha";
        if(dtb >= 5.0) return "Trung Binh";
          return "Yeu";
    }
    // 3. In ra 
    public static void hienthi(String ten, double dtb, String loai){
        System.out.println("\n--- KET QUA ---");
        System.out.println("Hoc sinh: " + ten);
        System.out.printf("Diem Trung Binh: %.2f\n", dtb);
        System.out.println("Xep loai: " + loai);
    }
    // 4. Main nhap
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        // 1. nhap du lieu
        System.err.println("nhap ten hoc sinh: ");
        String hoTen = sc.nextLine();
        System.err.println("Nhap diem English: ");
        double TA = sc.nextDouble();
        System.err.println("Nhap diem IT: ");
        double it = sc.nextDouble();
        System.err.println("Nhap diem PLT: ");
        double plt = sc.nextDouble();

        // 2. tinh toan
        double diemTB = tinhDTB(TA, it, plt);
        
        //3. gui ket qua tinh toan qua ham xep loai
        String ketQua = xeploai(diemTB);

        // Bước 4: Gửi tất cả thông tin qua hàm hiển thị
        hienthi(hoTen, diemTB, ketQua);
    }
}
