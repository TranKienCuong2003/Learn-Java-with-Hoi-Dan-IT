package Chapter1.Lab01;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap chieu dai: ");
        double length = scanner.nextDouble();

        System.out.print("Nhap chieu rong: ");
        double width = scanner.nextDouble();

        double perimeter = (length + width) * 2;

        double area = length * width;

        double minSide = Math.min(length, width);

        System.out.println("\nChu vi hinh chu nhat: " + perimeter);
        System.out.println("Dien tich hinh chu nhat: " + area);
        System.out.println("Canh nho nhat cua hinh chu nhat: " + minSide);

        scanner.close();
    }
}
