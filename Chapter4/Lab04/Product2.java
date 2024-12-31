package Chapter4.Lab04;

class Product {
    String name;
    double price;
    double tax;

    public Product(String name, double price, double tax) {
        this.name = name;
        this.price = price;
        this.tax = tax;
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

public class Product2 {
    public static void main(String[] args) {
        Product product1 = new Product("San pham 1", 100, 0.1);
        Product product2 = new Product("San pham 2", 200, 0.2);

        product1.xuatThongTin();
        System.out.println("Tien thue: " + product1.getTaxPrice());

        System.out.println();

        product2.xuatThongTin();
        System.out.println("Tien thue: " + product2.getTaxPrice());
    }
}

