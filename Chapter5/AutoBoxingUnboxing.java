package Chapter5;

public class AutoBoxingUnboxing {
    public static void main(String[] args) {
        int primitiveInt = 10;
        Integer wrapperInt = primitiveInt;
        System.out.println("Wrapper Integer: " + wrapperInt);

        Integer wrapperInt2 = 20;
        int primitiveInt2 = wrapperInt2;
        System.out.println("Primitive int: " + primitiveInt2);

        Integer wrapper1 = 30;
        Integer wrapper2 = 40;
        int sum = wrapper1 + wrapper2;
        System.out.println("Sum: " + sum);
    }
}

