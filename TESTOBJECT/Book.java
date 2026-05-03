package TESTOBJECT;

public class Book {
//1. tạo đối tượng
    String name;
    int price;
    int public_year;
    static int demsl;

//2. hàm tạo
    public Book(String n, int p, int y){
        name = n;
        price = p;
        public_year = y;
        demsl++;
    }

    public Book(String n, int p){
        name = n;
        price = p;
    }

    public static int dem_so_luong(){
        return demsl; 
    }
    
    public Book(){

    }

    public void setName(String n){
        name = n;
    }
    public void setPrice(int p){
        price = p;
    }
    public void setYear(int y){
        public_year = y;
    }

    public String getName(){
        return name;
    }

    
}
