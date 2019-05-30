import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwapNumbers {
    public static void main(String[] args) {
        System.out.println(swapNumbers(Arrays.asList(12, 13, 14, 19), 1, 3));
        System.out.println(swapStrings(Arrays.asList("komal", "pooja", "ankita"), 1, 2));

    }

    public static List<Integer> swapNumbers(List<Integer> numbers, int first, int second) {
        List<Integer> numbersCopy = new ArrayList<>(numbers);
        int numberAtFirstIndex = numbersCopy.get(first);
        numbersCopy.set(first, numbersCopy.get(second));
        numbersCopy.set(second, numberAtFirstIndex);
        return numbersCopy;
    }

    public static List<String> swapStrings(List<String> strings, int first, int second) {
        List<String> stringCopy = new ArrayList<>(strings);
        String stringAtFirstIndex = stringCopy.get(first);
        stringCopy.set(first, stringCopy.get(second));
        stringCopy.set(second, stringAtFirstIndex);
        return stringCopy;
    }
}
