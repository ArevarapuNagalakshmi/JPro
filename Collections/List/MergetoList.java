package Collections.List;

import java.util.ArrayList;
import java.util.List;

public class MergetoList {
    public static void main(String args[]){
        List<Integer>l1=new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(20);
        List<Integer>l2=new ArrayList<>();
        l2.add(1);
        l2.add(2);
        l2.add(20);
        l1.addAll(l1);
        System.out.println(l1);


    }
}
