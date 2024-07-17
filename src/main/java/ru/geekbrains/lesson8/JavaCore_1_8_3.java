package ru.geekbrains.lesson8;

import java.util.Random;

public class JavaCore_1_8_3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = 0;
        int [] arr = new int[10];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(0,5);
            if (arr[i] == number) {
                count++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int [] arrCopied = new int[arr.length - count];
        int newArrayIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != number) {
                arrCopied[newArrayIndex++] = arr[i];
            }
        }
        for (int i = 0; i < arrCopied.length; i++) {
            System.out.print(arrCopied[i] + " ");
        }
    }
}
