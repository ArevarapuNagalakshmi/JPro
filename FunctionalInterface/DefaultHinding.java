package FunctionalInterface;
class Aa{
    int x=10;

}
class Bb extends Aa{
    int x=20;
}
public class DefaultHinding {
    public static void main(String args[]){
        Aa a= new Bb();
        System.out.println(a.x);
    }
}
