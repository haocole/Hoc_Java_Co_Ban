package MANG_ARRAY;

public class TotalArray {
    public static void TinhTongMang(int[] arr){
        int tong =0;
        for(int i = 0; i < arr.length; i++){
            tong += arr[i];
        }
        System.err.println("Tong cua cac so trong mang la: "+ tong);
    }
    public static void main(String[] args) {
        int[] danhsachso ={10,20,30,40,50};
        TinhTongMang(danhsachso);

        int[] mangmoi={1,2,3};
        TinhTongMang(mangmoi);
    }
    
}
