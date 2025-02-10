package FunctionalInterface;

import java.util.Arrays;
public class Mergetwoarrays {
    public static void main(String args[]) {
        int arr1[] = {1, 4, 3, 5, 7};
        int arr2[] = {2, 3, 4, 3, 6, 8, 1, 2};
        int merge[] = new int[arr1.length + arr2.length];
        int index = 0;
        for (int num : arr1)
            merge[index++] = num;
        for (int num : arr2)
            merge[index++] = num;
        Arrays.sort(merge);
       int a[]=removeDuplicates(merge);
    System.out.println("Remove Duplicates: " +Arrays.toString(a));
    }
    private static int[] removeDuplicates(int sortedArray[]){
        if(sortedArray.length==0){
            return new int[0];
        }
        int a[]=new int[sortedArray.length];
        int Count=0;
        for(int i=0;i<sortedArray.length;i++){
            if(i==0 || sortedArray[i] !=sortedArray[i-1]){
                a[Count++]=sortedArray[i];
            }
        }
        return Arrays.copyOf(a,Count);

    }
}
