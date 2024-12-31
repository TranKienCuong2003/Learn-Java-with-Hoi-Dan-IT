package Chapter2.Lab02;

import java.util.Scanner;

public class Exercise2 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = scanner.nextInt();
        System.out.print("Nhap b: ");
        int b = scanner.nextInt();
        System.out.print("Nhap c: ");
        int c = scanner.nextInt();
        
        if (a == 0) {
            if (b == 0 && c == 0) {
                System.out.println("Phuong trinh co vo so nghiem");
            } else if (b == 0 && c != 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else {
                double x = - (double) c / b;
                System.out.println("x = " + x);
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else if (delta == 0) {
                double x = - (double) b / (2 * a);
                System.out.println("Nghiem kep x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Co 2 nghiem rieng biet: x1 = " + x1 + ", x2 = " + x2);
            }
        }
    
        scanner.close();
    }
}
