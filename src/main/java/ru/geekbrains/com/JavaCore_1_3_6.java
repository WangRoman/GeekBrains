package ru.geekbrains.com;

import java.util.Arrays;
import java.util.Random;

public class JavaCore_1_3_6 {
    public static void main(String[] args) {
        Random rand = new Random();
        int [] arr = new int [10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);

    }
}
