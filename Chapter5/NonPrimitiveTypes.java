package Chapter5;

public class NonPrimitiveTypes {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println("String value: " + str);

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.print("Array values: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        Student student = new Student("John", 20);
        System.out.println("Student name: " + student.getName());
        System.out.println("Student age: " + student.getAge());
    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

