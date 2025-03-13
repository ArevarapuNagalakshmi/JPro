package FunctionalInterface;
class Aaa{
     void m1(){
        System.out.println("Hello");
    }
}
class Bbb extends Aaa{
    void m1(){
        System.out.println("Hii");
    }
}
public class StaticHinding {
    public static void main(String args[]){
        Aaa a=new Bbb();
        a.m1();
        Bbb b=new Bbb();
        b.m1();


    }
}
