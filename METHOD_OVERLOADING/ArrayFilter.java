package METHOD_OVERLOADING;

import java.util.Scanner;

public class ArrayFilter {
    public static void show(int[] arr ){
        for(int i = 0; i < arr.length; i++){
            if (arr[i] % 3 == 0 && arr[i] % 5 != 0) {
                System.out.print(arr[i] + " ");
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Nhap so luong phan tu: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }

       System.err.println("So chia het cho 3 la: ");
        show(arr);
        
        sc.close();
    
    }
    
}
