package DIEU_KIEN;
import java.util.Scanner;
public class B4_Nhap_tendiem_SX {
    public static void main(String[] args){
      Scanner nhap = new Scanner(System.in);
      System.out.print("Nhap ten hoc sinh: ");
            String ten = nhap.nextLine();

            System.out.println("Nhap diem mon IT: ");
            float diem_it = nhap.nextFloat();
            System.out.println("Nhap diem mon English: ");
            float diem_ta = nhap.nextFloat();
            System.out.println("Nhap diem mon PLT: ");
            float diem_plt = nhap.nextFloat();
            float diemtb = (diem_it + diem_ta + diem_plt)/3;



            System.out.print("Ket qua: ");
            if (diemtb >= 8) {
                System.out.println(ten + " la hoc sinh gioi");}
             else if (diemtb >= 6.5) {
                System.out.println(ten + " la hoc sinh kha");}
             else if (diemtb >= 5) {
                System.out.println(ten + " la hoc sinh trung binh");}
             else {
                System.out.println(ten + " la hoc sinh yeu");}
            

            nhap.close();

    }
}
