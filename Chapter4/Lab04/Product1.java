package Chapter4.Lab04;

import java.util.Scanner;

class Product {
    String name;
    double price;
    double tax;

    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten san pham: ");
        name = scanner.nextLine();
        System.out.print("Nhap gia san pham: ");
        price = scanner.nextDouble();
        System.out.print("Nhap muc thue: ");
        tax = scanner.nextDouble();

        scanner.close();
    }

    public void xuatThongTin() {
        System.out.println("Ten san pham: " + name);
        System.out.println("Gia san pham: " + price);
        System.out.println("Muc thue: " + tax);
    }

    public double getTaxPrice() {
        return price * tax;
    }
}

public class Product1 {
    public static void main(String[] args) {
        Product product = new Product();
        product.nhapThongTin();
        product.xuatThongTin();
        System.out.println("Tien thue: " + product.getTaxPrice());
    }
}

