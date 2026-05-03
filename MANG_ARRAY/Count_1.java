package MANG_ARRAY;  // Đếm số chẳn trong mảng
import java.util.Scanner;
public class Count_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //B2: xác định kích thước
        System.out.print("Nhap so luong phan tu cua mang: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        //B3: nhập dữ liệu
        System.out.println("---Nhap du lieu---");
        for( int i = 0; i < n; i++){
            System.out.print("Nhap phan tu numbers["+ i +"]; ");
            numbers[i] = sc.nextInt();
        }
        //B4: xử lý dữ liệu đếm số chẵn
        int count = 0;
        for(int i = 0; i < n; i++){
            if(numbers[i] % 2 ==0){
                count++;
            }

        }
        System.out.println("so luong so chan trong mang la: " + count);
        sc.close();




    }
}
