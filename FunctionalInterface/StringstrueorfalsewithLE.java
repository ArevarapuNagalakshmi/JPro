package FunctionalInterface;
interface StringTF{
    void m1(String a,String b);
}
public class StringstrueorfalsewithLE {
    public static void main(String args[]){
        StringTF s=(a,b)->{
            System.out.println("Using '==' :" +(a==b));//
            System.out.println("Using equals() :" +a.equals(b));
            b="Python";
            System.out.println("After Mmodifying b:");//false
            System.out.println("Using '==' :" +(a==b));//
            System.out.println("Using equals() :" +a.equals(b));
        };
        s.m1("Java","Java");
    }
}
