package FunctionalInterface;

import java.util.Arrays;

interface SecBiggest{
    public void m1(int arr[]);
}
public class SecBiggestNumArraywithLE {
    public static void main(String args[]) {
        SecBiggest sb = (arr) -> {
            Arrays.sort(arr);
            System.out.println("Reverse of a string: " + arr[arr.length - 2]);
        };
        sb.m1(new int[]{1, 3, 4, 5, 7, 98, 34});
    }
}
