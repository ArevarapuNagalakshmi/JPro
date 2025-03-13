package FunctionalInterface;

public class EvenOddNumber {
    public static void main(String[] args) {
       /*int n=10;
        for(int i=2;i<=n;i+=2){
            System.out.println(i+" is a even number");
        }
        for(int i=1;i<=n;i+=2){
            System.out.println(i+" is a odd number");
        }*/
        int a=10;
        System.out.println((a&1) == 0?"Even" : "Odd");


    }
}