package PredefinedFunInterface;

import java.util.function.BiConsumer;

public class BiCunsumerDemo {
    public static void main(String args[]){
        BiConsumer<String,Integer> c=(name,age)->System.out.println(name+"is "+age+" year old");
        c.accept("Virat ", 35);
    }
}
