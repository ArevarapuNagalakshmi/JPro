package FunctionalInterface;
class A{
    void m1(){
        System.out.println("Hello");
    }
}
class B1 extends A{
    void m2(){
        System.out.println("Hi");
    }
}
public class UpCasting {
    public static void main(String args[]){
        A a=new B1();
        //B b=(B) a;
        //b.m2();
        a.m1();
    }
}
