package Chapter6;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap username: ");
        String username = scanner.nextLine();

        System.out.print("Nhap password: ");
        String password = scanner.nextLine();

        if(username.equals("TranKienCuong") && password.length() > 6) {
            System.out.println("Dang nhap thanh cong!");
        } else {
            System.out.println("Thong tin dang nhap khong hop le!");
        }

        scanner.close();
    }
}

