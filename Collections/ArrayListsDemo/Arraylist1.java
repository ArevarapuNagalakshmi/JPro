package Collections.ArrayListsDemo;

import java.util.ArrayList;

public class Arraylist1 {
    public static void main(String args[]){
        ArrayList<String>l1=new ArrayList<>();
        l1.add("Mahi");
        l1.add("Hari");
        l1.add("Jyo");
        l1.add("Lucky");
        l1.add("Sravs");
        l1.add("Navya");
        for(String l:l1){
            System.out.println(l);
        }
        System.out.println("First Element: " +l1.get(0));
        System.out.println("Last Element: " +l1.get(5));
        System.out.println("Middle Element: " +l1.get(2));
    }
}
