package MANG_ARRAY;
import java.util.Scanner;
public class FindMaxIndex {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 1. nhấp số số lượng phần tử
        System.out.print("Nhap so luong phan tu: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        //2. nhập giá trị vào mảng
        for(int i = 0; i < n; i++){
            System.out.print("Phan tu thu "+ i + ": ");
            arr[i] = sc.nextInt();
        }
        // xử lý tím vị trí
        int maxIndex = 0; 
        for(int i = 1; i < n; ++i){
            if(arr[i] > arr[maxIndex]){
                maxIndex = i;
            }
        }
        // in kết quả
        System.out.println("---");
        System.out.println("Phan tu lon nhat la: " + arr[maxIndex]);
        System.out.println("m o vi tri (index) so: " + maxIndex);

    }
    
}
