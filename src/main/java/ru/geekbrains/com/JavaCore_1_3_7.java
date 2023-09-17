package ru.geekbrains.com;

public class JavaCore_1_3_7 {
    public static void main(String[] args) {
        System.out.println(checkBalance());
    }

    public static boolean checkBalance() {
        int[] arr = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            leftSum += arr[i];
            int rightSum = sum - leftSum;
            if (leftSum == rightSum) {
                return true;
            }
        }
        return false;
    }
}





