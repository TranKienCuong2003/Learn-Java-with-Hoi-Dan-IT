package Chapter2;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so tien thue (don vi trieu dong): ");
        double tienThue = scanner.nextDouble();
        
        if (tienThue < 10) {
            System.out.println("Khong dong thue");
        } else if (tienThue >= 10 && tienThue <= 15) {
            System.out.println("Thue 10%");
        } else if (tienThue > 15 && tienThue <= 30) {
            System.out.println("Thue 20%");
        } else {
            System.out.println("Thue 50%");
        }
        
        scanner.close();
    }
}
