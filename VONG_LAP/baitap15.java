package VONG_LAP;
import java.util.Scanner;
public class baitap15 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sInput = ""; // Khởi tạo biến kiểu Chuỗi để chứa mọi thứ

        // "Chừng nào nội dung nhập vào chưa phải là số 5"
        while (!sInput.equals("5")) {
            System.out.print("Nhap anything: ");
            
            // Dùng nextLine() để hốt trọn bộ những gì người dùng gõ
            sInput = sc.nextLine();

            if (sInput.equals("5")) {
                System.out.println("You're Die. The Ending!");
            } else {
                System.out.println("Keep going, don't give up");
            }
        }
        
        sc.close();
    
}
}
