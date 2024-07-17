package ru.geekbrains.lesson8;

import java.util.ArrayList;
import java.util.Random;

public class Java_1_8_4<T> {
    private T[] values;
    private int[] weights;
    private Random random;

    public Java_1_8_4(T[] values, int[] weights) {
        this.values = values;
        this.weights = weights;
        this.random = new Random();
    }


    public T getRandomValue() {
        int totalWeight = 0;
        for (int weight : weights) {
            totalWeight += weight;
        }

        int randomWeight = random.nextInt(totalWeight);
        int currentWeight = 0;

        for (int i = 0; i < weights.length; i++) {
            currentWeight += weights[i];
            if (randomWeight < currentWeight) {
                return values[i];
            }
        }

        return values[weights.length - 1];

    }

    public static void main(String[] args) {
        Integer[] values = {1, 2, 3};
        int[] weights = {1, 2, 10};

        Java_1_8_4<Integer> picker = new Java_1_8_4<>(values, weights);
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for (int i = 0; i < 30; i++) {
            int randomValue = picker.getRandomValue();
            //System.out.println("Random value: " + randomValue);
            if (randomValue == 1) {
                count1++;
            } else if (randomValue == 2) {
                count2++;
            } else {
                count3++;
            }
        }
        System.out.println("One = " + count1);
        System.out.println("Two = " + count2);
        System.out.println("Three = " + count3);
    }
}


