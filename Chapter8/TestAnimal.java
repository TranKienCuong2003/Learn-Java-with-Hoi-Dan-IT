package Chapter8;

interface Animal {
    void animalSound();
    void sleep();
}

class Pig implements Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }

    public void sleep() {
        System.out.println("Zzz");
    }
}

public class TestAnimal {
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
}

