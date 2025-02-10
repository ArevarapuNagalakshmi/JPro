package ExceptionHandling;


//import java.sql.SQLException;

class A1{
    void m1(){
        System.out.println("Hello");
    }
}
class B1 extends A1{
    void m1() throws ArithmeticException {
        System.out.println("Hi");
    }
}

public class UncheckedException {
    public static void main(String args[]) {

            A1 a=new A1();
            a.m1();


    }
}
