package FunctionalInterface;

public class FibonacciSeries {
    public static void main(String args[]) {
       /* int a=0,b=1,c,count=10;
        System.out.print(a+ "," +b);
        for(int i=1;i<count;i++){
            c=a+b;
            System.out.print(","+c);
            a=b;
            b=c;
    }*/
        int n=10;
        int a=0;
        int b=1;;
        System.out.println("Fabinocci series " +n);
        for(int i=2;i<=n;i++){
            System.out.print(a+",");
            int c=a+b;
            a=b;
            b=c;

        }
    }}