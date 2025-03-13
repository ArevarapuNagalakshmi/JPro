package FunctionalInterface;
class Aaaa{
    void m1(){
        System.out.println("Hello");
    }
}
class Bbbb extends Aaaa {
    void m2(){
        System.out.println("Hi");
    }
}
public class DownCasting {

        public static void main(String args[]){
            Aaaa a=new Bbbb();
            //a.m1();
            Bbbb b=(Bbbb) a;
            //a.m1();
            b.m2();

        }
    }


