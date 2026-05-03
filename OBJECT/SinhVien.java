package OBJECT;

public class SinhVien {
    public String name;
    public double score;
    public int count;

    public SinhVien(String t, double d){
        name = t;
        score = d;
        count++;
    }
    
    public void setTen(String ten){
        name = ten;
    }
    public void setDiem(double diem){
        score = diem;
    }

    public String getTen(){
        return name;
    }
    public double getDiem(){
        return score;
    }

    public String xepLoai(){
        if(score >= 8) 
            return "Gioi";
        else if(score >=5)
            return "Kha";
        else
            return "Yeu";


    }
}
