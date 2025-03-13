package StreamsApi.Intermediate;

import java.util.Arrays;
import java.util.List;

public class Filter1 {
    public static void main(String args[]) {
        List<Integer> list = Arrays.asList(66, 67, 65, 45, 12, 30);
        list.stream().filter(i -> i > 20).forEach(i -> System.out.println(i));
        list.stream().filter(i -> i < 20).forEach(i -> System.out.println("Below 20 numbers : "+i));

    }
}
