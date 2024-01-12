import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FlatteringList {
    public static void main(String[] args) {

        List<Integer> oddList = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> evenList = Arrays.asList(2, 4, 6, 8);
        List<List<Integer>> listofList = Arrays.asList(oddList, evenList);
        List<Integer> collect = listofList.stream().flatMap(dt -> dt.stream()).collect(Collectors.toList());
        System.out.println(collect);

    }
}
