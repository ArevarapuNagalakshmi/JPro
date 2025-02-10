package ExceptionHandling;
/*class B{
    void m1(int p){
        if(p>10){
            throw new ArithmeticException("Access defined");
        }else{
            System.out.println("Acces granted");
        }
    }
}*/
public class ThrowException {
    public static void main(String args[]){
      try{
         int a=10/0;
      }catch(ArithmeticException e){
          System.out.println("Exception");
          throw e;
      }
    }
}
