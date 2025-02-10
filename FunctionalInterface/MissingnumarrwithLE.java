package FunctionalInterface;
interface MissingNum{
    void m1(int arr[]);
}
public class MissingnumarrwithLE {
    public static void main(String args[]){
        int arr[] = {1, 2, 4, 5, 6};
        MissingNum m=(array)->{
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
        };
        m.m1(arr);
    }
}
