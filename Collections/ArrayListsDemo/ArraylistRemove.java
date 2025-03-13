package Collections.ArrayListsDemo;

import java.util.ArrayList;

public class ArraylistRemove {
        public static void main(String args[]) {
            ArrayList<String> l1 = new ArrayList<>();
            l1.add("Mahi");
            l1.add("Hari");
            l1.add("Jyo");
            l1.add("Lucky");
            l1.add("Sravs");
            l1.add("Navya");
            l1.remove("Lucky");
            l1.add(3,"Jyothi");
            System.out.println(l1);
            for (String l : l1) {
                System.out.println(l);
            }

        }
}


