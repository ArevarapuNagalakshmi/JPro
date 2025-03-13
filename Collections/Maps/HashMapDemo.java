package Collections.Maps;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String args[]){
        HashMap<Integer,String>l1=new HashMap<Integer,String>();
        l1.put(1,"Mani");
        l1.put(2,"Mahi");
        l1.put(3,"Jyo");
        l1.put(4,"Sravani");
        l1.put(5,"Lucky");
        System.out.println("Before Remove :"+l1);
        l1.remove(1);
        System.out.println("After Remove :"+l1);
        l1.put(1,"Manu");
        l1.putIfAbsent(1,"Manu");
        System.out.println(l1);
        l1.clear();
        System.out.println(l1);
    }
}
