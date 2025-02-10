package Interfaces;
interface A{
    public static int add(int a,int b){
        return a+b;
    }
}
public class Demostatic {
    public static void main(String args[]){
        int result=A.add(10,20);
        System.out.println("Sum:" +result);
    }
}
