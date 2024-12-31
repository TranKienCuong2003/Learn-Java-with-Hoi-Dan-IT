package Chapter9;

import java.util.Scanner;

class MathOperations {
    public double divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Khong the chia cho 0!");
        }
        return (double) a / b;
    }
}

public class TestThrows {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MathOperations mathOperations = new MathOperations();

        System.out.print("Nhap so thu nhat: ");
        int a = scanner.nextInt();
        System.out.print("Nhap so thu hai: ");
        int b = scanner.nextInt();

        scanner.close();
    
        try {
            double result = mathOperations.divide(a, b);
            System.out.println("Ket qua chia: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Loi: " + e.getMessage());
        }
    }
}

