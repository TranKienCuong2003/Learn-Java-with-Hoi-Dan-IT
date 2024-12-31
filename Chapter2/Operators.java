package Chapter2;

public class Operators {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y);
        System.out.println(x++);
        System.out.println(x--);
        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println(x > y);
        System.out.println(x < y);
        System.out.println(x >= y);
        System.out.println(x <= y);
        System.out.println(x > 3 && x < 10);
        System.out.println(x > 3 || x < 4);
        System.out.println(!(x > 3 && x < 10));        
    }
}
