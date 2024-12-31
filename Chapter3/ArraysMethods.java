package Chapter3;

import java.util.Arrays;

public class ArraysMethods {
    public static void main(String[] args) {
        int[] mangSo = {5, 2, 8, 1, 3};
        
        System.out.println("Mang ban dau:");
        System.out.println(Arrays.toString(mangSo));
        
        Arrays.sort(mangSo);
        System.out.println("\nMang sau khi sap xep:");
        System.out.println(Arrays.toString(mangSo));
        
        int index = Arrays.binarySearch(mangSo, 3);
        System.out.println("\nVi tri cua phan tu 3 trong mang: " + index);
        
        int[] mangCopy = Arrays.copyOf(mangSo, 7);
        System.out.println("\nMang sao chep (sau khi copy):");
        System.out.println(Arrays.toString(mangCopy));
        
        Arrays.fill(mangSo, 0);
        System.out.println("\nMang sau khi duoc fill voi gia tri 0:");
        System.out.println(Arrays.toString(mangSo));
    }
}
