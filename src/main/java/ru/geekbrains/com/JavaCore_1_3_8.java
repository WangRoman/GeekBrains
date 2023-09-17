package ru.geekbrains.com;

import java.util.Arrays;

public class JavaCore_1_3_8 {
    public static void main(String[] args) {

        shiftArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 5);
    }

    public static void shiftArray(int [] arr, int n) {
        int len = arr.length;
        if (n < 0) {
            n += len;
        }
        if (n > len) {
            n %= len;
        }
        for (int i = 0; i < n; i++) {
            int last = arr[len - 1];

            for (int j = len - 2; j >= 0; j--) {
                arr[j + 1] = arr[j];
            }
            arr[0] = last;
        }
        System.out.println(Arrays.toString(arr));
    }
}

