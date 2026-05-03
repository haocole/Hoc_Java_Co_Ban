package DIEU_KIEN;
import java.util.Scanner;
public class TimSoLonNhat {
    public static void main(String[] args){
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất : ");
            int a = nhap.nextInt();
            System.out.print("Nhập số thứ hai : ");
            int b = nhap.nextInt();
            System.out.print("Nhập số thứ ba : ");
            int c = nhap.nextInt();
            System.out.print("=> Số lớn nhất là: ");

            // // Bắt đầu so sánh và in trực tiếp
            // if (a > b) {
            //     if (a > c) {
            //         System.out.println(a);}// a thắng cả b và c
            //      else {
            //         System.out.println(c); }}// c thắng a (mà a đã thắng b)
                
            // else  {
            //     if (b > c) {
            //         System.out.println(b); }// b thắng cả a và c
            //      else {
            //         System.out.println(c); }}// c thắng b (mà b đã thắng a)
            // Kiểm tra xem tất cả có bằng nhau không
        if (a == b && b == c) {
            System.out.println("Ba số bằng nhau.");
        } 
        // Dùng toán tử && để tìm số lớn nhất
        else if (a > b && a > c) {
            System.out.println( a);
        } else if (b > a && b > c) {
            System.out.println( b);
        } else {
            System.out.println(c);
        }

            nhap.close();
    }
}
