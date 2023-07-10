package GeekBrains;

public class LeftRightSum {

    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println(checkBalance(arr));
    }

    public static boolean checkBalance(int[] arr) {
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
