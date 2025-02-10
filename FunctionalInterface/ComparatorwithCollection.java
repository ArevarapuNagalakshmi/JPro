package FunctionalInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorwithCollection implements Comparator<Integer> {
    public int compare(Integer I1,Integer I2){
        if(I1<I2){
            return-1;
        }
        else if(I1>I2){
            return+1;
        }else {
            return 0;
        }
    }
}
class Test{
    public static void main(String args[]){
        List l1=new ArrayList();
        l1.add(10);
        l1.add(4);
        l1.add(6);
        l1.add(1);
        l1.add(3);
        l1.add(2);
        l1.add(5);
        System.out.println(l1);

        Collections.sort(l1,new ComparatorwithCollection());
        System.out.println(l1);
    }
}
