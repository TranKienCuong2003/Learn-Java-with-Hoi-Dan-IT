package Chapter5;

class Box<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class Generics {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.setValue(100);
        System.out.println("Gia tri trong Box Integer: " + intBox.getValue());

        Box<String> strBox = new Box<>();
        strBox.setValue("Hello Generics");
        System.out.println("Gia tri trong Box String: " + strBox.getValue());

        Box<Double> doubleBox = new Box<>();
        doubleBox.setValue(99.99);
        System.out.println("Gia tri trong Box Double: " + doubleBox.getValue());
    }
}

