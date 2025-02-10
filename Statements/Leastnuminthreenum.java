package Statements;

public class Leastnuminthreenum {
    public static void main(String args[]){
      /*  int i=10;
        int j=2;
        int k=3;
        if(i<j && i<k){
            System.out.println("i is the least number");
        }else if(j<i && j<k){
            System.out.println("j is the least nmumber");
        }
        else {
            System.out.println("K is the least number");
        }*/
        int arr[]={10,3,2};
        int l=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<l){
                l=arr[i];
            }
        }
        System.out.println( l+ " is the least number");

    }
}
