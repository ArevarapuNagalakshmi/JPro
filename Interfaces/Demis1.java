package Interfaces;
interface Vehicle1 {
    //void start();
    static void m1() {
        System.out.println("This is a vehicle");
    }
}
class Bike implements Vehicle1{
    public void start() {
        System.out.println("Car is starting...");
    }
}
public class Demis1 {
    public static void main(String args[]){
        Bike b=new Bike();
        b.start();
        Vehicle1.m1();

    }
}
