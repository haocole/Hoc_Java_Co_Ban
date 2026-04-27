package VONG_LAP;
import java.util.Scanner;
 public class TimSoLonNhat {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  muốn nhập bao nhiêu số
        System.out.print("Ban muon nhap bao nhieu so: ");
        int n = sc.nextInt();

        //  Giả sử số đầu tiên nhập vào là số lớn nhất (max)
        System.out.print("Nhap so thu 1: ");
        int max = sc.nextInt();

        //  Dung vong lap for de nhap cac so con lai
        for (int i = 2; i <= n; i++) {
            System.out.print("Nhap so thu " + i + ": ");
            int soTiepTheo = sc.nextInt();

            // So sanh so vua nhap voi max hien tai
            if (soTiepTheo > max) {
                max = soTiepTheo; // Neu lon hon thi cap nhat max
            }
        }

        // 4. In ket qua cuoi cung
        System.out.println("So lon nhat trong " + n + " so vua nhap la: " + max);
    }
}

        
    
    

