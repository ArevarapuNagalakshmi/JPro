package PredefinedFunInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String args[]){
        Consumer<String>c=(name)->System.out.println(name+ "Good Morning");
        c.accept("abc ");
        c.accept("bdcdf ");
        c.accept("dssfcdvfv ");
        List<Integer>num= Arrays.asList(1,2,3,4,5);
    }
}
