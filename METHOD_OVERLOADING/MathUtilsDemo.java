package METHOD_OVERLOADING;
import java.util.Scanner; 
public class MathUtilsDemo {
    public static void main(String[] args){
        // int so_1 = 10;
        // int so_2 = 5;
        // 1. double [] mang = {5.4, 4.3,2.2, 6.3};
        //  for(int i = 0; i < mang.length; i++)
        //     System.out.print(mang[i] + " ");

        // 2.double so_nho_nhat = btap1.min(mang);
        // System.out.println(so_nho_nhat);
    
    //3. Tìm min và trả về mảng là min số đầu tiên
    
    //  double[] KetQua = btap1.thayTheMin(mang);
    //  System.out.print("Mang sau khi tra ve: ");
    //  for ( int i =  0; i < KetQua.length; i++) {
    //     System.out.print(KetQua[i]+ " ");
    // }
    Scanner sc = new Scanner(System.in);
    System.out.print("nhap so: ");
    int so = sc.nextInt();
    System.out.println("Tri tuyet doi cua "  + so + " la: " + MathUtils.tri_tuyet_doi(so));// tham chiếu
    System.out.println("Tri cua so "  + so + " sau khi tin tri tuyet doi la " + so);// nguyên thủy
}
}    

