package OBJECT;

public class HocSinh {
    // 1. Khai báo thuộc tính (Dữ liệu)
    public String ten;
    public double diemta, diemit, diemplt;
    public String quequan;
    public int namSinh;
    
    // BIẾN STATIC: Dùng chung để đếm tổng số học sinh
    public static int dem_sl = 0; 

    // 2. Hàm khởi tạo (Constructor)
    public HocSinh(String name, double diemTA, double diemIT, double diemPLT, String provide, int Birthday) {
        ten = name;
        diemta = diemTA;
        diemit = diemIT;
        diemplt = diemPLT;
        quequan = provide;
        namSinh = Birthday;
        
        // Mỗi lần 'new', biến dùng chung này sẽ tăng lên 1
        dem_sl++; 
    }

    // 3. Hàm tính điểm trung bình (Không dùng static vì tính cho từng HS)
    public double tinhTB() {
        return (diemta + diemit + diemplt) / 3.0;
    }

    // 4. Hàm lấy tên (Để sửa lỗi dòng 25 bạn từng gặp)
    public String getName() {
        return ten;
    }

    // 5. Hàm lấy số lượng (Dùng static vì đây là thông tin chung của lớp)
    public static int get_so_luong() {
        return dem_sl;
    }

    // 6. Hàm main để chạy chương trình
    public static void main(String[] args) {
        // Tạo đối tượng học sinh 1
        HocSinh hs1 = new HocSinh("A LANG HAO", 7.2, 9.0, 8.7, "QUANG NAM", 2007);
        
        // In thông tin cơ bản
        System.out.println("--- Thong tin Hoc Sinh ---");
        System.out.println("Ten: " + hs1.getName());
        System.out.println("Que quan: " + hs1.quequan);
        System.out.println("Nam sinh: " + hs1.namSinh);
        
        // In điểm trung bình (Dùng printf với dấu phẩy để định dạng 2 số thập phân)
        System.out.printf("Diem Trung Binh: %.2f \n", hs1.tinhTB());
        
        System.out.println("--------------------------");
        
        // In tổng số lượng học sinh (Gọi thông qua tên Lớp vì là biến static)
        System.out.println("Tong so hoc sinh hien tai: " + HocSinh.get_so_luong());
    }
}
   
