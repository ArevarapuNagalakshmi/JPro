package Oops;
class S {
    void m1() {
        System.out.println("M1 method is printed");
    }
}
    class T extends S{
        void m2(){
            System.out.println("M2 method is printed");
        }
    }
public class DowncastingDemo {
    public static void main(String[] lakshmi){
        S s=new T();
        s.m1();
        T t= (T) s;
        t.m2();
    }
}
