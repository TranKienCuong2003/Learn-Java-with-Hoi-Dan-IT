package Chapter8;

interface Animal {
    void animalSound();
    void run();
}

class Dog implements Animal {
    @Override
    public void animalSound() {
        System.out.println("Woof! Woof!");
    }

    @Override
    public void run() {
        System.out.println("The dog is running.");
    }
}

class Cat implements Animal {
    @Override
    public void animalSound() {
        System.out.println("Meow! Meow!");
    }

    @Override
    public void run() {
        System.out.println("The cat is running.");
    }
}

public class Interface {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.animalSound();
        dog.run();

        System.out.println();

        Animal cat = new Cat();
        cat.animalSound();
        cat.run();
    }
}
