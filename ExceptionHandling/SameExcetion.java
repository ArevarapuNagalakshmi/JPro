package ExceptionHandling;

class A2{
    void m1() throws ArithmeticException{
        System.out.println("Hello");
    }
}
class B2 extends A1{
    void m1() throws ArithmeticException {
        System.out.println("Hi");
    }
}

public class SameExcetion {
    public static void main(String args[]) {

        A1 a=new A1();
        a.m1();


    }
}


