package Interfaces;
interface Vehicle {
    void start();
    default void showType() {
        System.out.println("This is a vehicle");
    }
}
class Car implements Vehicle{
    public void start() {
        System.out.println("Car is starting...");
    }
}
public class Demodefault {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
        myCar.showType();
    }
}
