package ExceptionHandling;
class A{
    void m1(int a,int b) {
        if(a==0){
            throw new ArithmeticException("cannot divide by zero");
        }
        System.out.println("Throws to the Exception:" +(a/b));
    }
}
public class ThrowsException {
    public static void main(String args[]) throws ArithmeticException{
        try{
            int a=10/0;
        }catch(ArithmeticException e){
            System.out.println("Exception"+e.getMessage());
        }
        System.out.println("Program continues");
    }
}
