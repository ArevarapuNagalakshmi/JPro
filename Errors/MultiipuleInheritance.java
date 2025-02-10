package Errors;
interface A{
    void m1();
}
interface B{
    void m2();
}
class C implements A,B{

    @Override
    public void m1() {
        System.out.println("m1 method is print");
    }

    @Override
    public void m2() {
        System.out.println("m2 method is print");

    }
}

public class MultiipuleInheritance {
    public static void main(String args[]){
        A m= new B() {
        m.m1();
        m.m2();
    }
}
