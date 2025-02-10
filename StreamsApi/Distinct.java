package StreamsApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Distinct {
    public static void main(String args[]){
        List<Integer> l1= Arrays.asList(1,2,2,1,3,4,1,4,5,1);
        List<Integer> l2=l1.stream().distinct().collect(Collectors.toList());
        System.out.println(l2);
    }
}
