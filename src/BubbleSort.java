import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


public class BubbleSort {
    public List<Comparable> sort(List<Comparable> inputList) {
        if(inputList == null){
            throw new RuntimeException();
        }
        List<Comparable> input = inputList.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toList());

        boolean exit = false;
        while (!exit) {
            exit = true;
            for (int i = 1; i < input.size(); i++) {
                Comparable prevEl = input.get(i - 1);
                Comparable el = input.get(i);
                if (el.compareTo(prevEl) < 0) {
                    Collections.swap(input, i, i - 1);
                    exit = false;
                }
            }
        }
        return input;
    }
}
