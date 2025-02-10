/*package FunctionalInterface;
//import java.lang.reflect.Array;
import java.util.Arrays;



public class Tomergetwoarrays {
    public static void main(String args[]){
       int arr1[]={1,3,2,4,6,7};
        int arr2[]={2,5,10,9,8,3,4,5};
        int[] merged=new int[arr2.length+arr1.length];
        int index=0;
        for(int num:arr1){
            merged[index++]=num;
        }
            for(int num:arr2){
                merged[index++]=num;
            }
                Arrays.sort(merged);
                Arrays.toString(merged);
        //merged=removeduplicates(merged);
                System.out.println("Merge and sort Arrays:" +Arrays.toString(merged));

      private public static int[] removeduplicates(int arr[]){
            //int n=arr.length;
            //int temp[]=new int[n];
            //int j=0;
            if(arr.length==0){
                return arr;
            }
            int j=0;
            for(int i=1;i<arr.length;i++){
                if(arr[i]!=arr[j]){
                    j++;
                   // temp[j++]=arr[i];
                    arr[j]=arr[i];
                }
            }
           //temp[j++]=arr[n-1];
            return Arrays.copyOf(arr,j+1);
        }
    }*/

package FunctionalInterface;

import java.util.Arrays;

public class  Tomergetwoarrays  { // Renamed to avoid conflict with java.lang.reflect.Array

    // Method to remove duplicates (works on sorted array)
    static int[] removeDuplicates(int[] arr) {
        int n = arr.length;
        if (n == 0 || n == 1) return arr; // Handle edge cases

        int[] temp = new int[n]; // Temporary array
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i]; // Store unique elements
            }
        }
        temp[j++] = arr[n - 1]; // Add last unique element

        return Arrays.copyOf(temp, j); // Trim the array to correct size
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 7, 4, 5};
        int[] arr2 = {5, 3, 8, 9, 2, 9, 1};

        // Merging arrays
        int[] merged = new int[arr1.length + arr2.length];
        int index = 0;

        for (int num : arr1) merged[index++] = num;
        for (int num : arr2) merged[index++] = num;

        // Sorting the merged array (Required for removeDuplicates method)
        Arrays.sort(merged);

        // Removing duplicates
        int[] uniqueArray = removeDuplicates(merged);

        // Print result
        System.out.println("Merged and Unique Array: " + Arrays.toString(uniqueArray));
    }
}

