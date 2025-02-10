package StreamsApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenorOdd {
    public static void main(String args[]){
        List<Integer> l1= Arrays.asList(1,7,6,5,4,3,8,9);
        List<Integer> l2=l1.stream().filter(i->i>5).collect(Collectors.toList());
        System.out.println(l2);
    }
}
