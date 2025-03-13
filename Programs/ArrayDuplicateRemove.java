package Programs;

import java.util.Arrays;

public class ArrayDuplicateRemove {
    public static void main(String[] args) {
        int arr[]={2,2,3,4,5,4,5,3,6,3};
        int a[]= Arrays.stream(arr).distinct().toArray();
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(a));
    }
}
