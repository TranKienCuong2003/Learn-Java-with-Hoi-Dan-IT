package Chapter9;

import java.util.Scanner;

class MathOperations {
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divider cannot be equal to zero!");
        }
        return a / b;
    }
}

public class TestThrow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MathOperations mathOperations = new MathOperations();

        System.out.print("Nhap so thu nhat: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap so thu hai: ");
        double b = scanner.nextDouble();

        scanner.close();

        try {
            double result = mathOperations.divide(a, b);
            System.out.println("Ket qua chia: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Loi: " + e.getMessage());
        }
    }
}

