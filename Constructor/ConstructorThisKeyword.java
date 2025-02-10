package Constructor;
class A {
    static int i = 10;
                public A() {
        System.out.println(this.i);
                }
}
public class ConstructorThisKeyword {
    public static void main(String args[]){
       A aa=new A();

    }
}
