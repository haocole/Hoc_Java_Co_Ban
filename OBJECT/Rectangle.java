package OBJECT;

public class Rectangle {
    private double chieuDai;
    private double chieuRong;
    
//////đếm đối tượng
    public static int count =0;

///////2. cóntuctor có tham số
    public Rectangle(double dai, double rong){
        chieuDai = dai;
        chieuRong = rong;
        count++;
    }
    
////////3. constuctor không có tham số
    public Rectangle(){
        // chieuDai = 0;
        // chieuRong = 0;
        count++;
    }

//////4. setters
    public void setChieuDai(double dai){
        chieuDai = dai;
    }
    public void setChieuRong(double rong){
        chieuRong = rong;
    }

//////5. getters
    public double getChieuDai() {
        return chieuDai;
    }
    public double getChieuRong() {
        return chieuRong;
    }

//////6. Tính diện tích
    public double tinhDienTich(){
        return chieuDai * chieuRong;
    }

    }

