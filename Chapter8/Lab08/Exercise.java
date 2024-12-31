package Chapter8.Lab08;

import java.util.Scanner;

interface IPerson {
    void input();
    void display();
}

class Person implements IPerson {
    protected String id;
    protected String name;
    protected int age;

    public Person(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ID: ");
        this.id = scanner.nextLine();
        System.out.print("Enter Name: ");
        this.name = scanner.nextLine();
        System.out.print("Enter Age: ");
        this.age = scanner.nextInt();

        scanner.close();
    }

    @Override
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    private int mark;
    private String grade;

    public Student(String id, String name, int age, int mark) {
        super(id, name, age);
        this.mark = mark;
        setGrade(mark);
    }

    public int getMark() {
        return mark;
    }

    public String getGrade() {
        return grade;
    }

    public void setMark(int mark) {
        this.mark = mark;
        setGrade(mark);
    }

    public void setGrade(int mark) {
        if (mark >= 8) {
            this.grade = "A";
        } else if (mark >= 7) {
            this.grade = "B";
        } else if (mark >= 6) {
            this.grade = "C";
        } else if (mark >= 5) {
            this.grade = "D";
        } else {
            this.grade = "Tach cmnr";
        }
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Mark: " + mark);
        System.out.println("Grade: " + grade);
    }
}

public class Exercise {
    public static void main(String[] args) {
        Student student = new Student("001", "Tran Kien Cuong", 21, 9);
        student.display();

        System.out.println();

        Student anotherStudent = new Student("002", "Nguyen Thanh Dat", 20, 7);
        anotherStudent.display();
    }
}
