package OBJECT;

public class Square {
    public double canh;
    public static int dem;

    public Square(double c){
        canh = c;
        dem++;
    }
    public double tinhChuVi(){
        return canh * 4;
    }
}
