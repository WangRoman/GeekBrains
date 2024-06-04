package ru.geekbrains.com;

public class Dog extends Animal {
    @Override
    public void run(int length) {
        if (length <= 500) {
            System.out.println("Run");
        } else {
            System.out.println("Dog can't run such a distance");
        }
    }

    @Override
    public void swim(int length) {
        if (length <= 10) {
            System.out.println("Run");
        } else {
            System.out.println("Dog can't run such a distance");
        }
    }

    @Override
    public void jump(double height) {
        if (height <= 0.5) {
            System.out.println("Jump");
        } else {
            System.out.println("Dog can't jump so high");
        }
    }
}
