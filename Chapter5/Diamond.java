package Chapter5;

import java.util.ArrayList;

public class Diamond {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Java");
        list1.add("Generics");

        System.out.println("Danh sach 1: " + list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(200);

        System.out.println("Danh sach 2: " + list2);

        ArrayList<Double> list3 = new ArrayList<>();
        list3.add(10.5);
        list3.add(20.75);

        System.out.println("Danh sach 3: " + list3);
    }
}

