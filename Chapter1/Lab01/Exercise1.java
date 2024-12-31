package Chapter1.Lab01;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ten sinh vien: ");
        String name = scanner.nextLine();

        System.out.print("Nhap diem trung binh: ");
        double grade = scanner.nextDouble();

        System.out.println("\n" + name + " co diem = " + grade);

        scanner.close();
    }
}
