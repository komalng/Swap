import java.util.Arrays;
import java.util.List;

public class SwapNumbers {
    public static void main(String[] args) {
        System.out.println(getNumbers(Arrays.asList(12,13,14,19),0,1));


    }
    public static List<Integer> getNumbers(List<Integer> numbers, int first, int second){
        int numberAtFirstIndex = numbers.get(first);
        int numberAtSecondIndex = numbers.get(second);
        for(int i = 0; i < numbers.size();i++){
            if(numberAtFirstIndex == numbers.get(i)){
                numbers.set(first,numberAtSecondIndex);
            }
            else if(numberAtSecondIndex == numbers.get(i)){
                numbers.set(second, numberAtFirstIndex);
            }
        }
        return numbers;
    }
}
