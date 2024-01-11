import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharacterOccurrence {

    public static void main(String[] args) {
        String input = "gainjavaknowledge";

        Map<String, Long> output = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Output : " + output);

    }
}