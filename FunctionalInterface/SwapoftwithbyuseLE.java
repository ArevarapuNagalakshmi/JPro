package FunctionalInterface;
interface Swap{
    public void m1(int a,int b);
}
public class SwapoftwithbyuseLE {
    public static void main(String args[]){
        int a=10,b=20;
        System.out.println("BeforeSwaping: a= " +a+",b=" +b);
        Swap swap=(x,y)->{System.out.println("After Swaping: a= " +y+",b=" +x);
        };
        swap.m1(a,b);
    }
}
