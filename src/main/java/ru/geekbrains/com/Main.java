package ru.geekbrains.com;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int foodCount = 40;
        Cat [] cat = new Cat [3]; {
            cat[0] = new Cat("Barsik", 15, false);
            cat[1] = new Cat("Murzik", 15, false);
            cat[2] = new Cat("Vaska", 15, false);
        }
        Plate plate = new Plate(foodCount);
        while (cat[2].getAppetite() != 0) {
            plate.info();
            System.out.println("Аппетит у кота " + cat[0].getName() + ": " + cat[0].getAppetite());
            System.out.println("Сытость у кота " + cat[0].getName() + ": " + cat[0].fullness());
            cat[0].eat(plate, foodCount);
            plate.info();
            System.out.println("Аппетит у кота " + cat[1].getName() + ": " + cat[1].getAppetite());
            System.out.println("Сытость у кота " + cat[1].getName() + ": " + cat[1].fullness());
            cat[1].eat(plate, foodCount);
            plate.info();
            System.out.println("Аппетит у кота " + cat[2].getName() + ": " + cat[2].getAppetite());
            System.out.println("Сытость у кота " + cat[2].getName() + ": " + cat[2].fullness());
            cat[2].eat(plate, foodCount);
            plate.info();
        }
    }
}
