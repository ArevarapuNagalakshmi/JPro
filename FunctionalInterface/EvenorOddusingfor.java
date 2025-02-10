package FunctionalInterface;

public class EvenorOddusingfor {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8,9,56,35};
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.println("Even");
            }else{
                System.out.println("Odd");
            }
        }
    }
}
