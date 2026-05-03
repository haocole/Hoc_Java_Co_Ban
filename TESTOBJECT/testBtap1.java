package TESTOBJECT;


import OBJECT.Student; // Kết nối tới class Student ở package kia
import java.util.ArrayList;
import java.util.Scanner;

public class testBtap1 {

    // Hàm nhận vào danh sách rỗng kiểu Student và trả về danh sách đã nhập
    public static ArrayList<Student> nhapDanhSachSV(ArrayList<Student> danhSach) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Bạn muốn nhập bao nhiêu sinh viên? ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập sinh viên thứ " + (i + 1) + ":");
            System.out.print(" - Tên: ");
            String ten = sc.nextLine();
            System.out.print(" - Tuổi: ");
            int tuoi = Integer.parseInt(sc.nextLine());

            // TẠO ĐỐI TƯỢNG: Dùng bản thiết kế từ file Student.java
            Student s = new Student(ten, tuoi);
            
            // THÊM VÀO DANH SÁCH:
            danhSach.add(s);
        }
        
        return danhSach; // Trả về danh sách chứa các đối tượng Student
    }

    public static void main(String[] args) {
        // Tạo danh sách rỗng ban đầu kiểu Student
        ArrayList<Student> listSV = new ArrayList<>();

        // Liên kết và gọi hàm nhập
        listSV = nhapDanhSachSV(listSV);

        // In kết quả ra màn hình
        System.out.println("\n--- KẾT QUẢ DANH SÁCH SINH VIÊN ---");
        for (Student sv : listSV) {
            // sv.name và sv.age lấy từ file Student.java sang
            System.out.println("Tên: " + sv.name + " | Tuổi: " + sv.age);
        }
    }
}
    

