package StreamsApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergintolistusingStreams {
    public static void main(String args[]){
        List<String> list1 = Arrays.asList("A", "B", "C");
        List<String> list2 = Arrays.asList("D", "E", "F");
        List<String> mergedList = Stream.concat(list1.stream(), list2.stream())
                .collect(Collectors.toList());//toList()

        System.out.println("Merged List: " + mergedList);
    }
}
