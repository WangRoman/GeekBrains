package ru.geekbrains.com;

import java.io.IOException;

public class Cat {
    private String name;
    private int appetite;
    private boolean fullness;

    public Cat(String name, int appetite, boolean fullness) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = fullness;
    }


    public void eat(Plate plate, int food) throws IOException {
        if (plate.getFood() >= appetite) {
            plate.decreaseFood(appetite, name);
            appetite = 0;
            fullness = true;
        } else {
            System.out.println("It's not enough for " + name + ", that's why he doesn't eat");
            plate.addFood();
        }
    }

    public boolean fullness() {
        return appetite == 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean getFullness() {
        return fullness;
    }

    public void setFullness(boolean fullness) {
        this.fullness = fullness;
    }


}
