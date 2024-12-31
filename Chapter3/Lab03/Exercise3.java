package Chapter3.Lab03;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap vao so phan tu trong mang: ");
        int n = scanner.nextInt();
        
        int[] mang = new int[n];
        
        System.out.println("Nhap vao cac phan tu trong mang:");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            mang[i] = scanner.nextInt();
        }
        
        Arrays.sort(mang);
        
        System.out.println("\nMang sau khi sap xep:");
        System.out.println(Arrays.toString(mang));
        
        int giaTriMin = mang[0];
        int giaTriMax = mang[n - 1];
        
        System.out.println("\nPhan tu co gia tri nho nhat: " + giaTriMin);
        System.out.println("Phan tu co gia tri lon nhat: " + giaTriMax);
        
        scanner.close();
    }
}
