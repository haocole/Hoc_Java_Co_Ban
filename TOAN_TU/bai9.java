package TOAN_TU;
import java.util.Scanner;
public class bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Nhập lương cơ bản từ bàn phím
        System.out.print("Nhap luong co ban (Basic Salary): ");
        double basicSalary = sc.nextDouble();

        // 2. Tính toán các khoản phụ cấp (Allowances)
        double da = basicSalary * 0.12;       // 12% lương cơ bản
        double hra = 150000;                  // Cố định
        double ta = 120000;                   // Cố định
        double others = 450000;               // Cố định

        // 3. Tính toán các khoản khấu trừ (Deductions)
        double pf = basicSalary * 0.14;       // 14% lương cơ bản
        double it = basicSalary * 0.15;       // 15% lương cơ bản

        // 4. Áp dụng công thức tính Lương thực nhận (Net Salary)
        double netSalary = (basicSalary + da + hra + ta + others) - (pf + it);

        // 5. Hiển thị bảng lương chi tiết
        System.out.println("\n========= BANG TINH LUONG CHI TIET =========");
        System.out.printf("Luong co ban       : %,.0f VND\n", basicSalary);
        System.out.printf("Phu cap DA (12%%)   : %,.0f VND\n", da);
        System.out.printf("Phu cap HRA        : %,.0f VND\n", hra);
        System.out.printf("Phu cap TA         : %,.0f VND\n", ta);
        System.out.printf("Khoan khac         : %,.0f VND\n", others);
        System.out.println("---------------------------------------------");
        System.out.printf("Khau tru PF (14%%)  : %,.0f VND\n", pf);
        System.out.printf("Khau tru IT (15%%)  : %,.0f VND\n", it);
        System.out.println("---------------------------------------------");
        System.out.printf("LUONG THUC NHAN    : %,.0f VND\n", netSalary);
        System.out.println("=============================================");

        sc.close();
    }
    
}
