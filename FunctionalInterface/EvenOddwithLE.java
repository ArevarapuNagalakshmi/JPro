package FunctionalInterface;
interface EvenOdd{
    void m1(int i);
}
public class EvenOddwithLE {
    public static void main(String[] args){
        EvenOdd Even1=(i)->{
            if(i%2==0)
            {
                System.out.println("Even");
            }
            else{
                System.out.println("Odd");
            }};
        Even1.m1(20);
    }
}
