import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.copy;

public class SwapNumbers {
    public static void main(String[] args) {
        System.out.println(getNumbers(Arrays.asList(12,13,14,19),1,3));
        System.out.println(getNumbers(Arrays.asList(12,13,14,1),1,3));

    }
    public static List<Integer> getNumbers(List<Integer> numbers, int first, int second){
        List<Integer> numbersCopy = new ArrayList<>(numbers);
        int numberAtFirstIndex = numbersCopy.get(first);
        numbersCopy.set(first,numbersCopy.get(second));
        numbersCopy.set(second,numberAtFirstIndex);
        return numbersCopy;
    }
}
