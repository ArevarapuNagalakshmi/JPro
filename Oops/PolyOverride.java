package Oops;
class C{
    void m1(){
        System.out.println("C is a method");
    }

}

class D extends C{
    @Override
    void m1(){
        System.out.println("D is method");
    }
}
public class PolyOverride {
    public static void main(String args[]){
        C c=new C();
        c.m1();
    }
}
