package Chapter1;

public class MathematicalFunctions {
    public static void main(String[] args) {
        // Tính căn bậc 2
        double number = 25.0;
        double squareRoot = Math.sqrt(number);
        System.out.println("Can bac 2 cua " + number + " la: " + squareRoot);

        // Tính lũy thừa
        double base = 2.0;
        double exponent = 3.0;
        double power = Math.pow(base, exponent);
        System.out.println(base + " luy thua " + exponent + " la: " + power);

        // Làm tròn số
        double value = 5.6789;
        double roundedValue = Math.round(value * 100.0) / 100.0;
        System.out.println("Gia tri " + value + " sau khi lam tron la: " + roundedValue);

        // Làm tròn lên
        double ceilValue = Math.ceil(value);
        System.out.println("Gia tri " + value + " lam tron len la: " + ceilValue);

        // Làm tròn xuống
        double floorValue = Math.floor(value);
        System.out.println("Gia tri " + value + " lam tron xuong la: " + floorValue);
    }
}
