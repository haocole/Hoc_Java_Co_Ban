package OBJECT;

public class SinhVien_2 {
    String name;
    double dToan;
    double dTanh;

    public SinhVien_2(String n, double t, double a){
        name = n;
        dToan = t;
        dTanh = a;

    }
    public SinhVien_2(){

    }
    public double tinhdiem(){
        return (dToan + dTanh)/2;
    }
    
}
