package ru.geekbrains.com;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal cat = new Cat();
        Animal dog = new Dog();
        cat.run(50);
        dog.run(600);
        cat.swim(30);
        dog.swim(5);
        cat.jump(2);
        dog.jump(0.7);

    }
}
