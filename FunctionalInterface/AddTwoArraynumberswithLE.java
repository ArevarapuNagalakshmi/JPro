package FunctionalInterface;

import java.util.Arrays;

interface AddTwoArrays{
    void m1(int arr1[],int arr2[]);
}
public class AddTwoArraynumberswithLE {
    public static void main(String args[]){
        int[] arr1 = {1, 4, 3, 5, 7};
        int[] arr2 = {2, 5, 4, 3, 6, 8, 1, 2};
        AddTwoArrays A=(a1,a2)->{
            int[] n =new int[a1.length + a2.length];
            System.arraycopy(a1,0,n,0,a1.length);
            System.arraycopy(a2,0,n,a1.length,a2.length);
            Arrays.sort(n);
            System.out.println(Arrays.toString(n));
        };
        A.m1(arr1,arr2);
    }
}
