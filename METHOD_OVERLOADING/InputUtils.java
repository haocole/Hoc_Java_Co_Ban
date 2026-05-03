package METHOD_OVERLOADING;


    import java.util.Scanner;

public class InputUtils {

    // Hàm nhận vào mảng, cho nhập liệu và trả về mảng đó
    public static double[] nhapDuLieu(double[] mang) {
        Scanner sc = new Scanner(System.in);
        
        
        for (int i = 0; i < mang.length; i++) {
            System.out.print("Gia  thu " + (i + 1) + ": ");
            mang[i] = sc.nextDouble(); // Lưu số vừa nhập vào vị trí i
        }
        
        return mang; // Trả về mảng sau khi đã điền đầy đủ số
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Hỏi người dùng muốn nhập bao nhiêu số
        System.out.print("Ban muon nhap bnh so? ");
        int n = sc.nextInt();

        // 2. Tạo một mảng "rỗng" (nhưng có kích thước n)
        double[] mangTrong = new double[n];

        // 3. Gọi hàm để điền thông tin vào mảng đó
        double[] mangDaNhap = nhapDuLieu(mangTrong);

        // 4. In ra kiểm tra
        System.out.print("Danh sach ban vua nhap: ");
        for (double x : mangDaNhap) {
            System.out.print(x + " ");
        }
    }
}

