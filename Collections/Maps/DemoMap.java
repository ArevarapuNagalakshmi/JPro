package Collections.Maps;

import java.util.HashMap;
import java.util.Map;
public class DemoMap {
    public static void main(String[] args) {
            Map<Integer, String> m = new HashMap<>();
            m.put(1, "Apple");
            m.put(2, "Banana");
            m.put(3, "Cherry");
            System.out.println("Key 2: " + m.get(3));
            System.out.println("Contains key 3? " + m.containsKey(3));
            System.out.println("Contains value 'Mango'? " + m.containsValue("Mango"));
            m.remove(1);
            System.out.println("After removing key 1: " + m);
            System.out.println("Size of map: " + m.size());
            m.clear();
            System.out.println("Is map empty? " + m.isEmpty());
        }
    }


