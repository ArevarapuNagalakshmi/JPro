package Collections.Maps;

import java.util.LinkedHashMap;

public class DemoLHM {
    public static void main(String args[]){
        LinkedHashMap<Integer,String>l1=new LinkedHashMap<>();
        l1.put(1,"Hi");
        l1.put(2,"Hello");
        l1.put(3,"Hari");
        l1.put(4,"Hoo");
        l1.put(5,"ppp");
        l1.replace(3,"Haaa");
        l1.replace(2,"Hello","Heeee");
        System.out.println(l1);
    }
}
