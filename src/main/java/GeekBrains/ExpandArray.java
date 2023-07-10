package GeekBrains;

import java.util.Arrays;

public class ExpandArray {

    public static void main(String[] args) {

        shiftArray(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}, -2);

    }

        public static void shiftArray (int [] arr, int n) {
            int len = arr.length;
            // Если n отрицательное, переводим его в положительное эквивалентное значение
            if (n < 0) {
                n = len + n;
            }
            // Если n больше длины массива, вычисляем эквивалентное значение
            if (n > len) {
                n = n % len;
            }
            // Смещаем элементы массива
            for (int i = 0; i < n; i++) {
                // Сохраняем последний элемент массива
                int last = arr[len - 1];
                // Смещаем остальные элементы на одну позицию вправо
                for (int j = len - 2; j >= 0; j--) {
                    arr[j + 1] = arr[j];
                }
                // Помещаем последний элемент на первую позицию массива
                arr[0] = last;
            }
            System.out.print(Arrays.toString(arr));
        }
}
