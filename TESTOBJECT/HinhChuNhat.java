package TESTOBJECT;

public class HinhChuNhat {
   // 1. Thuộc tính (Đặc điểm)
    double dai, rong;
    // 2. Hàm khởi tạo (Constructor) - Giúp gán giá trị khi tạo đối tượng
    public HinhChuNhat(double d, double r) {
        this.dai = d;
        this.rong = r;
    }
    // 3. Phương thức (Hành vi)
    double tinhDienTich() {
        return dai * rong;
    }
    public static void main(String[] args) {
        // Tạo đối tượng hcn1 từ lớp HinhChuNhat (Xây nhà A)
        HinhChuNhat hcn1 = new HinhChuNhat(5, 10);
        
        // Tạo đối tượng hcn2 từ lớp HinhChuNhat (Xây nhà B)
        HinhChuNhat hcn2 = new HinhChuNhat(3, 4);

        System.out.println("Dien tich HCN 1: " + hcn1.tinhDienTich());
        System.out.println("Dien tich HCN 2: " + hcn2.tinhDienTich());
    }
}