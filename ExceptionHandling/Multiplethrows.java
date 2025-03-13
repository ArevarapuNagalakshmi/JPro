package ExceptionHandling;
class Auto {
    public void m1() throws Exception {
        try {
            int a = 10 / 5;
        } catch (ArithmeticException e) {
            int a = 10 / 2;
            System.out.println(a);
        }
    }
}
public class Multiplethrows {
    public static void main(String args[]) throws Exception{
        try{
            int a=10/5;
        }catch ( ArithmeticException e){
            int b=10/2;
            System.out.println(b);
        }
        }
    }


