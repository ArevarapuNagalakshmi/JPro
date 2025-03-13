package FunctionalInterface;

public class PalindramusingForloop {
    public static void main(String[] args) {
        //int n = 153; it is not a palindrom
        //int n=1441;
        //int n=15551;
        int n=33;
        int a = n;
        int r = 0;
        for (int i =n; i>0; i/=10) {
          int sum = i % 10;
            r = r * 10 + sum;
        }
        if(a==r){
            System.out.println(a+ " is a palindrome");
        }else{
            System.out.println(a+" is not a palindrome");
        }
    }
}
