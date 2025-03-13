package StreamsApi;
interface A{
    public void m1();
}

public class MethodREference {
    public static void m2(){
        System.out.println("This is m2 method");
    }
    public static void main(String args[]){
        A a=MethodREference::m2;
        a.m1();
    }
}
