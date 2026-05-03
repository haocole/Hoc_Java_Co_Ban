package OBJECT;

public class QuanLyDiem {
    //1. đối tượng
    String Ten;
    double It, Anh, Plt;

    //2. hàm khởi tạo
    public QuanLyDiem(String ten, double it, double anh, double plt){
        Ten = ten;
        Anh = anh;
        It= it;
         Plt = plt;

    }
    public static double tinhDTB(QuanLyDiem s){
        return (s.It + s.Anh + s.Plt) / 3;
    }

    public static String xepLoai(double dtb) {
        if (dtb >= 8) return "Gioi";
        if (dtb >= 6.5) return "Kha";
        if (dtb >= 5) return "Trung binh";
        return "Yeu";
    }
   public void hienThiToanBo() {
        double dtb = QuanLyDiem.tinhDTB(this);
        String loai = QuanLyDiem.xepLoai(dtb); 

        System.out.println("\n--- KET QUA ---");
        System.out.println("Hoc sinh: " + Ten);
        System.out.printf("Diem Trung Binh: %.2f\n", dtb);
        System.out.println("Xep loai: " + loai);
}


}
     