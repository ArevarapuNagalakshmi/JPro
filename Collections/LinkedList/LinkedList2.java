package Collections.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedList2 {
    public static void main(String args[]){
        List<String>l1=new LinkedList<>();
        l1.add("Mani");
        l1.add("Mahi");
        l1.add("Sravs");
        l1.add("Hari");
        System.out.println(l1);
        List<String>l2=new LinkedList<>();
        l2.add("Hari");
        l2.add("Raghava");
        l2.add("Ravi");
        l2.remove("Ravi");
        l2.add(2,"Manu");
        System.out.println(l2);
        l1.addAll(l2);
        System.out.println(l1);

    }
}
