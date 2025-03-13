package Oops;
abstract  class A2{
    abstract void start();

    void m1(){

        System.out.println("m1 is a A2 class");
    }
}
class B2 extends A2{
   // @Override
    void start(){

        System.out.println("B2 is a ley");
    }
}
public class AbstractClass {
    public static void main(String args[]){
        B2 b=new B2();
        b.m1();


    }
}
