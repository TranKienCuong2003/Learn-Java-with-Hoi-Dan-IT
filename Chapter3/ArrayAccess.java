package Chapter3;

public class ArrayAccess {
    public static void main(String[] args) {
        int[] mangSo = {1, 2, 3, 4, 5};
        
        System.out.println("Phan tu dau tien cua mang: " + mangSo[0]);
        System.out.println("Phan tu thu ba cua mang: " + mangSo[2]);
        System.out.println("Phan tu cuoi cung cua mang: " + mangSo[4]);
        
        System.out.println("\nIn tat ca cac phan tu trong mang:");
        for (int i = 0; i < mangSo.length; i++) {
            System.out.println("Phan tu thu " + (i + 1) + " la: " + mangSo[i]);
        }
    }
}

