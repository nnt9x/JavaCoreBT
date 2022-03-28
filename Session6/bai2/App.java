package bai2;

public class App {
    public static void main(String[] args) {
        Cat cat = new Cat("Cat");
        cat.greets();

        // Dog
        Dog dog = new Dog("Dog");
        dog.greets();

        // Big dog
        BigDog bigDog1 = new BigDog("Big dog 1");
        BigDog bigDog2 = new BigDog("Big dog 2");

        // Greeting another dog
        bigDog1.greets(dog);
        bigDog2.greets(bigDog1);

    }
}
