package Chapter2.Lab02;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so dien su dung: ");
        int soDien = scanner.nextInt();
        
        double soTien;
        
        if (soDien <= 100) {
            soTien = soDien * 1000;
        } else {
            soTien = 100 * 1000 + (soDien - 100) * 1500;
        }
        
        System.out.println("So tien dien can thanh toan: " + soTien);
        
        scanner.close();
    }
}
