package Chapter1.Lab01;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap canh cua khoi lap phuong: ");
        double canh = scanner.nextDouble();

        double theTich = Math.pow(canh, 3);

        System.out.println("The tich cua khoi lap phuong la: " + theTich);

        scanner.close();
    }
}
