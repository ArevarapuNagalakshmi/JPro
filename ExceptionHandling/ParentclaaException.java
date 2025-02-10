package ExceptionHandling;

class A4 {
    void m1() throws ArithmeticException{
        System.out.println("Hello");
    }
}
class B4 extends A4{
    void m1()  {
        System.out.println("Hi");
    }
}
public class ParentclaaException {
    public static void main(String args[]) {

        A4 a=new A4();
        a.m1();


    }
}
