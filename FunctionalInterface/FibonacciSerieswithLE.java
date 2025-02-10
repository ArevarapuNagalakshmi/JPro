package FunctionalInterface;
interface Fibonacci{
    public void m1(int n);
}
public class FibonacciSerieswithLE {
    public static void main(String args[]){
        Fibonacci f=(n)->{
            int a=0,b=1,c=0;
            System.out.print(a+","+b);
            for(int i=2;i<n;i++){
                c=a+b;
                System.out.print("," +c);
                a=b;
                b=c;
            }
        };
        f.m1(5);
    }
}
