package FunctionalInterface;


public class DemoFactorial {
 public static long A(int n){
    int a=1;
    for(int i=2;i<=n;i++){
        a*=i;
    }
    return a;
}

    public static void main(String args[]){

       System.out.println(A(5));
       /* int n=5;
        int a=1;
        for(int i=2;i<=n;i++){
            a*=i;
            System.out.println("Factotial" +n+ "," +a);
        }*/




    }
}
