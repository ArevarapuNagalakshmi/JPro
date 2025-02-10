package ExceptionHandling;

public class ExampleofEH {
    public static void main(String args[]){
        try{
            int a=100/2;
            System.out.println(a);
        }catch(ArithmeticException e){
            //int a=100/5;
            System.out.println("Exception");
        }finally{
            //int a=100/5;
            System.out.println("All ways Execute");
        }
    }
}
