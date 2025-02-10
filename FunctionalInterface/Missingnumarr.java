package FunctionalInterface;
public class Missingnumarr {
    public static void main(String args[]) {
        int arr[] = {1, 2, 4, 5, 6};
        int n = arr.length + 1;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        int sum1 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum1 += arr[i];
        }
        int missingNumber = sum - sum1;
        System.out.println("The missing number is: " + missingNumber);
    }
}
