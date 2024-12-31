package Chapter5;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Danh sach sau khi them phan tu:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Phan tu tai vi tri " + i + ": " + list.get(i));
        }

        list.remove(2);

        System.out.println("\nDanh sach sau khi xoa phan tu tai vi tri 2:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Phan tu tai vi tri " + i + ": " + list.get(i));
        }

        list.clear();

        System.out.println("\nDanh sach sau khi xoa tat ca phan tu:");
        System.out.println("Danh sach hien tai: " + list);
    }
}

