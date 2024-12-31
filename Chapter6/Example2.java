package Chapter6;

import java.util.ArrayList;

class Student {
    String name;
    int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

public class Example2 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        
        students.add(new Student("Nguyen Minh Dung", 1));
        students.add(new Student("Tran Kien Cuong", 2));
        students.add(new Student("Nguyen Thanh Dat", 3));
        students.add(new Student("Nguyen Quyen Linh", 4));
        students.add(new Student("Nguyen Thi Dung", 5));

        System.out.println("Danh sach sinh vien co ten bat dau bang 'Nguyen':");
        for (Student student : students) {
            if (student.getName().startsWith("Nguyen")) {
                System.out.println("Name: " + student.getName() + ", ID: " + student.getId());
            }
        }
    }
}

