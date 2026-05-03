package MANG_ARRAY;

public class AVG {
    public static void main(String[] args) {
        // Khai báo và gán giá trị cố định cho mảng
        int[] arr = {1, 2, 8, 4, 5}; 
        
        int tong = 0;
        for (int x : arr) {
            tong += x; // Cộng dồn từng phần tử vào biến tong
        }
        
        // Ép kiểu (double) để phép chia có số thập phân
        double trungBinh = (double) tong / arr.length;
        
        System.out.println("Tổng các phần tử: " + tong);
        System.out.println("Trung bình cộng: " + trungBinh);
    }
    
}
