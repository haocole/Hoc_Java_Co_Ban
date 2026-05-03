package TESTOBJECT;




import java.util.Scanner;
import OBJECT.Square;

public class tesstSquare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap canh: ");
        double n = sc.nextDouble();

        Square N = new Square(n);

        System.out.println("Chu vi hinh vuong: " + N.tinhChuVi());

        System.out.println("So hinh vuong da tao: " + Square.dem);

        sc.close();
    }
}


    

    

