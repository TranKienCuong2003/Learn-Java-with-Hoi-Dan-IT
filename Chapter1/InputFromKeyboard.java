package Chapter1;

import java.util.Scanner;

public class InputFromKeyboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Your name is: ");
        String name = scanner.nextLine();

        System.out.println("Your age is: ");
        int age = scanner.nextInt();

        System.out.println("My name is " + name + ", age = " + age);
        
        scanner.close();
    }
}