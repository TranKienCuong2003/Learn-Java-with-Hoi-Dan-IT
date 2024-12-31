package Chapter5;

public class Array {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Cac phan tu trong mang:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Phan tu tai vi tri " + i + ": " + numbers[i]);
        }

        System.out.println("\nPhan tu dau tien trong mang: " + numbers[0]);
        System.out.println("Phan tu cuoi cung trong mang: " + numbers[numbers.length - 1]);

        numbers[2] = 100;
        System.out.println("\nSau khi thay doi gia tri phan tu thu 3:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Phan tu tai vi tri " + i + ": " + numbers[i]);
        }
    }
}

