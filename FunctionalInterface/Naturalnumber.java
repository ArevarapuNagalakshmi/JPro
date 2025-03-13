package FunctionalInterface;

public class Naturalnumber {
    public static void main(String args[]){
        int n=10;
        int sum=0;
       /* while(n>0){
            sum=sum+n;
            n=n-1;
        }*/
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
