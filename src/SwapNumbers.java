import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwapNumbers {
    public static void main(String[] args) {
        System.out.println(swap(Arrays.asList("komal", "pooja", "ankita"), 1, 2));

    }

//type erusure.

    public static  <T> List<T> swap(List<T> elements,int first, int second){
        List<T> stringCopy = new ArrayList<>(elements);
        T firstIndex = stringCopy.get(first);
        stringCopy.set(first, stringCopy.get(second));
        stringCopy.set(second,firstIndex);
        return stringCopy;
    }
    public static String add(String a,String b){
        return a + b;
    }
    public static int add(int a, int b){
        return a + b;
    }
}
