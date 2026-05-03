package TOAN_TU;
import java.util.Scanner;
public class bai7 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);

        // 1. Nhập dữ liệu
        System.out.print("nhap ten: ");
        String ten = nhap.nextLine(); // Đọc chuỗi có khoảng trắng

        System.out.print("nhap tuoi: ");
        byte tuoi = nhap.nextByte(); // Đọc số nguyên

        System.out.print("Nhap điem thi mon co so du lieu: ");
        float diem = nhap.nextFloat(); // Đọc số thực

        // DÒNG "HÚT BỤI" THẦN THÁNH Ở ĐÂY Bất cứ khi nào bạn nhập Số 
        // (nextInt, nextFloat, nextByte...) mà ngay sau đó lại nhập Chữ (nextLine),
        //  hãy luôn chèn một dòng nhap.nextLine(); ở giữa để "hút bụi" cái dấu Enter
        nhap.nextLine();
        

        System.out.print("Que quan: ");
        String que = nhap.nextLine(); 

        

        // 2. Hiển thị thông tin ra màn hình theo yêu cầu
        // Sử dụng printf để định dạng điểm số lấy 2 chữ số thập phân (%.2f)
        //System.out.printf("Ten: %s, Tuoi: %d, diem co so du lieu: %.2f\n", ten, tuoi, diem);
          System.out.printf("Ten: %s\n", ten);
          System.out.printf("Tuoi: %d\n", tuoi);
          System.out.printf("diem %.2f\n", diem);
          System.out.printf("Que quan: %s", que);
        
        nhap.close();
    }
}

