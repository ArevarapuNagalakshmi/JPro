package AccesssModifiers;
class A{
    private String name="Lucky";
    private void m1(){
        System.out.println("Namee:"+name);
    }
}
public class DemoPrivate {
    public static void main(String args[]){
        A a=new A();

    }
}
