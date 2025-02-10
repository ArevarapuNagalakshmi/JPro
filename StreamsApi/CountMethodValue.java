package StreamsApi;

import java.util.Arrays;
import java.util.List;

public class CountMethodValue {
    public static void main(String[] args){
        List<Integer> l1= Arrays.asList(1,2,4,5,7,8,9,3);
        long count = l1.stream().filter(i->i>5).count();
        System.out.println();
    }
}
