package FunctionalInterface;

public class Amstrong1 {
    public static void main(String args[]){
        int n=154,temp,a=0;
        int b=0;
        while(n>0)
        {
            temp=n/10;
            temp= (int) Math.pow(temp,3);
            a=a+temp;
            n=n/10;

        }
        if(a==b){
            System.out.println("It is Armstrong number");
        }else{
            System.out.println("It is Not Armstrong number");
        }

    }
}
