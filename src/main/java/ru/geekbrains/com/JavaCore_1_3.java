package ru.geekbrains.com;

import java.util.Arrays;

public class JavaCore_1_3 {
    public static void main(String[] args) {
        //System.out.println(Arrays.toString(oneToZero()));
        //System.out.println(Arrays.toString(hundred()));
        //System.out.println(Arrays.toString(doubleNumber()));
        //System.out.println(squareArray());
        //System.out.println(Arrays.toString(lenArray(5, 2)));
    }


    //First task
    /*public static int [] oneToZero() {
        int [] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] ^ 1;
        }
        return arr;
    }*/

    //Second task
    /*public static int [] hundred() {
        int [] arr = new int [100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }*/

    //Third task
    /*public static int [] doubleNumber() {
        int [] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        return arr;
    }*/

    //Fourth number
   /* public static int[][] squareArray() {
        int[][] arr = new int[5][];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j || i == arr.length - j - 1) {
                    System.out.print("1 ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        return arr;
    }*/

    //Fifth task
    /*public static int [] lenArray (int len, int initialValue) {
        int [] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }*/
}

