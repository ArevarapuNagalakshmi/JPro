package FunctionalInterface;

public class BubblesortwithoutLE {
    public static void main(String args[]){
        int arr[]={1,3,2,4,6,7,65,87};
        for(int i=0;i<arr.length -1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){  //swap if the left element is greater than right
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int num:arr){
            System.out.print(num +",");
        }
    }
}
