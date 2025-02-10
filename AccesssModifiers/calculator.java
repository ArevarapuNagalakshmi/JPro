package AccesssModifiers;

public class calculator{
    public int add(int a,int b){

        return a+b;
    }
    public static void main(String args[]){
        calculator c=new calculator();
        System.out.println(c.add(3,5));
    }

}
