package Chapter2.Lab02;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println(">> LUA CHON TINH NANG <<");
            System.out.println("++ ----------------------------------------- ++");
            System.out.println("| 1. Giai phuong trinh bac nhat |");
            System.out.println("| 2. Giai phuong trinh bac hai |");
            System.out.println("| 3. Tinh so tien dien |");
            System.out.println("| 4. Ket thuc |");
            System.out.println("++ ------------------ ++");
            System.out.print("Nhap lua chon cua ban: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    giaiPhuongTrinhBacNhat(scanner);
                    break;
                case 2:
                    giaiPhuongTrinhBacHai(scanner);
                    break;
                case 3:
                    tinhSoTienDien(scanner);
                    break;
                case 4:
                    System.out.println("Ket thuc chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
            }
        } while (choice != 4);
        
        scanner.close();
    }
    
    public static void giaiPhuongTrinhBacNhat(Scanner scanner) {
        System.out.println("Giai phuong trinh bac nhat ax + b = 0");
        System.out.print("Nhap a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap b: ");
        double b = scanner.nextDouble();
        
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh co vo so nghiem.");
            } else {
                System.out.println("Phuong trinh vo nghiem.");
            }
        } else {
            double x = -b / a;
            System.out.println("Nghiem cua phuong trinh: x = " + x);
        }
    }
    
    public static void giaiPhuongTrinhBacHai(Scanner scanner) {
        System.out.println("Giai phuong trinh bac hai ax^2 + bx + c = 0");
        System.out.print("Nhap a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhap c: ");
        double c = scanner.nextDouble();
        
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phuong trinh co vo so nghiem.");
                } else {
                    System.out.println("Phuong trinh vo nghiem.");
                }
            } else {
                double x = -c / b;
                System.out.println("Nghiem cua phuong trinh bac nhat: x = " + x);
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem.");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Phuong trinh co nghiem kep: x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phuong trinh co hai nghiem: x1 = " + x1 + ", x2 = " + x2);
            }
        }
    }
    
    public static void tinhSoTienDien(Scanner scanner) {
        System.out.println("Tinh so tien dien");
        System.out.print("Nhap so kWh su dung: ");
        double kWh = scanner.nextDouble();
        
        double tienDien;
        if (kWh <= 50) {
            tienDien = kWh * 1678;
        } else if (kWh <= 100) {
            tienDien = 50 * 1678 + (kWh - 50) * 1734;
        } else if (kWh <= 150) {
            tienDien = 50 * 1678 + 50 * 1734 + (kWh - 100) * 2014;
        } else if (kWh <= 200) {
            tienDien = 50 * 1678 + 50 * 1734 + 50 * 2014 + (kWh - 150) * 2536;
        } else {
            tienDien = 50 * 1678 + 50 * 1734 + 50 * 2014 + 50 * 2536 + (kWh - 200) * 2834;
        }
        
        System.out.println("So tien dien phai tra: " + tienDien + " VND");
    }
}
