package Chapter3;

public class ArrayTraversal {
    public static void main(String[] args) {
        int[] mangSo = {10, 20, 30, 40, 50};
        
        System.out.println("Duyet tat ca phan tu cua mang:");
        for (int i = 0; i < mangSo.length; i++) {
            System.out.println("Phan tu thu " + (i + 1) + " la: " + mangSo[i]);
        }
    }
}
