package ru.geekbrains.com;

public class Cat extends Animal {

    @Override
    public void run(int length) {
        if (length <= 200) {
            System.out.println("Run");
        } else {
            System.out.println("Cat can't run such a distance");
        }
    }

    @Override
    public void swim(int length) {
        System.out.println("Cat can't swim");
    }

    @Override
    public void jump(double height) {
        if (height <= 2) {
            System.out.println("Jump");
        } else {
            System.out.println("Cat can't jump so high");
        }
    }
}
