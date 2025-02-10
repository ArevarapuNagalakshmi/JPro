package Oops;
class B1{
    int add(int p,int q){
        return p+q;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
}
public class PolyOverload {
    public static void main(String args[]){
        B1 a=new B1();
        System.out.println(a.add(2,3));
        System.out.println(a.add(2,3,4));
    }
}
