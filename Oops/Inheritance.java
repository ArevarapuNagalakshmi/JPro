package Oops;
class A1{
    void m1(){
        System.out.println("A1 is a class");
    }
}
class B extends A1{
    void m2(){
        System.out.println("B is a class");
    }

}
public class Inheritance {
    public static void main(String args[]){
        B b=new B();
        b.m1();
        b.m2();

    }
}
