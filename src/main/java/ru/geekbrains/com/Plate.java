package ru.geekbrains.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Plate {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("On plate " + food  + " food in quantity");
    }

    public void decreaseFood(int appetite, String name) {
            food -= appetite;
    }

    public void addFood () throws IOException {
            System.out.println("How much food do you want to add? ");
            food += Integer.parseInt(reader.readLine());
            System.out.println("Food quantity is " + food);
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }
}
