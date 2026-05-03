package METHOD_OVERLOADING;

public class MathOperations {

    // Hàm tính tổng của 2 số nguyên
    public int tinh_tong(int a, int b) {
        return a + b;
    }

    // Nạp chồng (Overloading): Hàm tính tổng của 3 số nguyên
    // Vẫn cùng tên là tinh_tong nhưng nhận vào 3 tham số
    public int tinh_tong(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        // Tạo đối tượng để gọi các hàm non-static
        MathOperations tinhToan = new MathOperations();

        // 1. Gọi hàm tính tổng 2 số
        int tong2 = tinhToan.tinh_tong(10, 20);
        System.out.println("Tong 2 so (10 + 20) = " + tong2);

        // 2. Gọi hàm tính tổng 3 số
        int tong3 = tinhToan.tinh_tong(10, 20, 30);
        System.out.println("Tong 3 so (10 + 20 + 30) = " + tong3);
    }
}
    

