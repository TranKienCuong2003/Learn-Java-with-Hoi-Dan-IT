package Chapter3.Lab03;

import java.util.Scanner;

public class Exercise1 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap vao 1 so nguyen: ");
        int soNguyen = scanner.nextInt();
        
        boolean laSoNguyenTo = true;
        
        if (soNguyen <= 1) {
            laSoNguyenTo = false;
        } else {
            for (int i = 2; i <= soNguyen - 1; i++) {
                if (soNguyen % i == 0) {
                    laSoNguyenTo = false;
                    break;
                }
            }
        }
        
        if (laSoNguyenTo) {
            System.out.println(soNguyen + " la so nguyen to.");
        } else {
            System.out.println(soNguyen + " khong phai la so nguyen to.");
        }
        
        scanner.close();
    }
}
