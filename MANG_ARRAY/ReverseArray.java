package MANG_ARRAY;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Nhập số lượng phần tử
        System.out.print("Enter array size: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        // 2. Nhập các phần tử vào mảng
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + i + ": ");
            numbers[i] = scanner.nextInt();
        }

        // In mảng ban đầu ra để đối chiếu
        System.out.println("Original array: " + Arrays.toString(numbers));

        // 3. Thuật toán đảo ngược (Reverse logic)
        for (int i = 0; i < n / 2; i++) {
            // Hoán đổi numbers[i] và numbers[n - 1 - i]
            int temp = numbers[i];
            numbers[i] = numbers[n - 1 - i];
            numbers[n - 1 - i] = temp;
        }

        // 4. In kết quả sau khi đảo
        System.out.println("Reversed array: " + Arrays.toString(numbers));
        
        scanner.close();
    }
    
}
