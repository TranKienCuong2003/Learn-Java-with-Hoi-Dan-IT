package Chapter3.Lab03;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap vao 1 so nguyen: ");
        int x = scanner.nextInt();
        
        System.out.println("Bang cuu chuong cua " + x + ":");
        
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", x, i, x * i);
        }
        
        scanner.close();
    }   
}
