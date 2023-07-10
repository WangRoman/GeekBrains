package GeekBrains;

import java.util.Arrays;
import java.util.Random;

public class JavaCore_1_2 {
    public static void main(String[] args) {

        //Manual Task 0
        /*int [][] arr = new int [5][];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print('*');
            }
            System.out.println();
        }*/

        //Manual Task 1
        /*int [][] arr = new int [6][];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }*/

        //Manual Task 2
        /*int [][] arr = new int [6][];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (j <= 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }*/

        //Manual Task 3
        /*int [][] arr = new int[6][];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i > 0 && i < 5 && j > 0 && j < 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }*/

        //Manual Task 4
        /*int [][] arr = new int [6][];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }*/

        //Manual Task 5
        /*int [][] arr = new int [6][];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i > j) {
                    System.out.print("0  ");
                } else if (j > i) {
                    System.out.print("*  ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }*/

        //Manual Task 6
        /*int [][] arr = new int [6][];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i > 0 && i < 5 && j > 0 && j < 5) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }*/

        //Manual Task 7
        /*int[][] arr = new int[6][];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i > 0 && i < 5 && j > 0 && j < 5 && i > j) {
                    System.out.print("  ");
                } else if (i > 0 && i < 5 && j > 0 && j < 5 && i < j) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }*/

        //Manual Task 8
        /*int[][] arr = new int[6][];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i > 0 && i < 5 && j > 0 && j < 5 && i > j) {
                    System.out.print("  ");
                } else if (i >= 0 && i <= 5 && j >= 0 && j <= 5 && i < j) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }*/

        //Manual Task 9
        /*int [][] arr = new int [6][];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i > 1 && i < 4 && j > 1 && j < 4) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }*/

        //Manual Task 10
        /*int [][] arr = new int[6][];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i > 3 && j < 2 || i < 2 && j > 3) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }*/

        //Task 1
        /*int [] arr = {1,1,0,0,1,0,1,1,0,0};;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
            }
        }*/

        //Task 2
        /*int [] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
            System.out.print(arr[i] + " ");
        }*/

        //Task 3
        /*int [] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
            System.out.print(arr[i] + " ");
        }*/

        //Task 4
        /*int [][] arr = new int [6][];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    System.out.print("1 ");
                } else if (i == 0 && j == 5 || i == 1 && j == 4 || i == 2 && j == 3 || i == 3 && j == 2 ||
                i == 4 && j == 1 || i == 5 && j == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }*/

        //Task 5
        /*int[] arr = {2, 6, 2, 7, 25, 6, 1, 5, 14, 8};
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
        }
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);*/

        //Random numbers
        /*int [] arr = new int[10];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
            System.out.print(arr[i] + " ");
        }*/

        //Temporary array and Delete index
        /*int[] arr = {3,1,6,5,2,8,4};
        int[] newArr = null;
        int elementToBeDeleted = 5;
        System.out.println("Original Array is: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] == elementToBeDeleted){
                newArr = new int[arr.length - 1];
                for(int index = 0; index < i; index++){
                    newArr[index] = arr[index];
                }
                for(int j = i; j < arr.length - 1; j++){
                    newArr[j] = arr[j+1];
                }
                break;
            }
        }
        System.out.println("New Array: " + Arrays.toString(newArr));*/


    }
}

