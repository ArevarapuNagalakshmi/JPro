package ExceptionHandling;

public class TrymulCatchblock {
    public static void main(String args[]){
        try{
            int a=100/0;
        }
        catch(Exception e){
          int  a=100/2;
         System.out.println("Print the Exception");
       }
       /* catch(ArithmeticException e){
            int a=100/2;
            System.out.println("Print the Exception");

            //System.out.println("cannot divide the exception");

        }*/
        /*finally {
            int a=100/3;
            System.out.println("Print the Final block");

        }*/
    }
}
