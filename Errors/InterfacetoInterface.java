package Errors;
interface  A1{
    void m1();
}
interface A2 extends A1{
    void m1();
}
class A3 implements A2{

    @Override
    public void m1() {

    }
}


public class InterfacetoInterface {
    public static void main(String args[]){

    }
}
