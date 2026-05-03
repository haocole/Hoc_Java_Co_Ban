package OBJECT;

public class Phone {
    /////// 1. Thuộc tính
    private String tenMay;
    private double gia;
    public static int count = 0;

    /////// 2. Constructor
    public Phone(String tenMay, double gia) {
        this.tenMay = tenMay;
        this.gia = gia;
        count++;
    }

    /////// 3. Getter/Setter
    public String getTenMay() { return tenMay; }
    public void setTenMay(String tenMay) { this.tenMay = tenMay; }
    public double getGia() { return gia; }
    public void setGia(double gia) { this.gia = gia; }
}
    

