package ExceptionHandling;

public class TryCatch {
    public static void main(String args[]){
      /*try{
            throw 90;
        }catch(ArithmeticException  e){
            System.out.println(" "+e);
        }*/
        try{
            throw new Exception("Custom exception");
        }catch(Exception  e){
            System.out.println(" "+e.getMessage());
        }
    }
}