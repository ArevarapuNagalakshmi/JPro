package FunctionalInterface;

import java.util.HashMap;
import java.util.Map;

public class OccurenceofnumberArray {
    public static void main(String args[]){
        int arr[]={1,1,2,2,3,5,7,8,2,1,3,4,5};
        HashMap<Integer,Integer> a=new HashMap<>();
        for(int num :arr){
            a.put(num,a.getOrDefault(num,0) +1);
        }
        for(int keys : a.keySet()){
            System.out.println(keys+ "-" + a.get(keys));
        }
    }
}
