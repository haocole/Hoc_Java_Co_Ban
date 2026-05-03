package METHOD_OVERLOADING;

public class SquareProvider {
    public static void TinhBinhPhuon(int n){
        int ketqua = n*n;
        System.err.println("Binh phuong cua " + n + " la: "+ ketqua);

    }
    public static void main(String[] args) {
        TinhBinhPhuon(5);
        TinhBinhPhuon(10);
        TinhBinhPhuon(6);
    }

    
}
