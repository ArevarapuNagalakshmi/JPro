package FunctionalInterface;

public class AmstrongorNot {
    public static void main(String args[]){
        int n=153;
        int temp=n;
        int r;
        int sum=0;
        while(n>0){
            r=n%10;
            n=n/10;
            sum=sum+r*r*r;
        }
        if(temp==sum){
            System.out.println("Print a Amstrong Number");
        }else{
            System.out.println("Print Not a Amstrong Number");
        }


    }
}
