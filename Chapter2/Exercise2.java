package Chapter2;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(">> LUA CHON TINH NANG <<");
        System.out.println("++ ------------------ ++");
        System.out.println("| 1. Cong |");
        System.out.println("| 2. Tru |");
        System.out.println("| 3. Ket thuc |");
        System.out.println("++ ------------------ ++");
        System.out.print("Lua chon cua ban la : ");
        
        int luaChon = scanner.nextInt();
        
        if (luaChon == 1) {
            System.out.println("Ban da lua chon phep cong");
        } else if (luaChon == 2) {
            System.out.println("Ban da lua chon phep tru");
        } else if (luaChon == 3) {
            System.out.println("Ban da lua chon thoat chuong trinh");
            System.exit(0);
        }
        
        scanner.close();
    }
}
