package METHOD_OVERLOADING;

public class ArrayProcessor {
    
    public static void giaiBai1(double[] mang) {
        double tong = 0;
        int n = mang.length; // Số lượng phần tử

        // 1. TÍNH TỔNG
        for (int i = 0; i < n; i++) {
            tong += mang[i];
        }

        // 2. TÍNH TRUNG BÌNH
        double trungBinh = tong / n;

        // 3. CẬP NHẬT LẠI MẢNG
        for (int i = 0; i < n; i++) {
            mang[i] = trungBinh;
        }
    }

    // --- Chỗ này để chạy thử ---
    public static void main(String[] args) {
        double[] a = {1, 2, 3};
        
        giaiBai1(a);

        // In kết quả ra xem
        for (double x : a) System.out.print(x + " "); 
    }
}
    
    

