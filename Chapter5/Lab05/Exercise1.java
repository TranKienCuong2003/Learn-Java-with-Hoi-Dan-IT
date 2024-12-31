package Chapter5.Lab05;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();
        
        while(true) {
            System.out.print("Nhap mot so thuc: ");
            Double x = scanner.nextDouble();
            list.add(x);

            scanner.nextLine(); 

            String choice = "";
            while(true) {
                System.out.print("Nhap them (Y/N)? ");
                choice = scanner.nextLine();
                
                if(choice.equalsIgnoreCase("Y") || choice.equalsIgnoreCase("N")) {
                    break;
                } else {
                    System.out.println("Loi: Vui long nhap 'Y' hoac 'N'!");
                }
            }

            if(choice.equalsIgnoreCase("N")) {
                break;
            }
        }
        scanner.close();

        System.out.println("Danh sach so thuc ban da nhap: ");
        for(Double num : list) {
            System.out.println(num);
        }

        double sum = 0;
        for(Double num : list) {
            sum += num;
        }

        System.out.println("Tong cua danh sach so thuc: " + sum);
    }
}
