package lambda;

import java.util.Arrays;
import java.util.List;

public class Lambda2 {

    public static void main(String[] args) {
        Integer[] array = new Integer[]{23, 5, 66, 23, 8, 45, 8, 34, 8, 95, 46, 8, 43, 46, 765};

        Arrays.sort(array, (first, second) -> Integer.compare(first, second));

        List<Integer> list = Arrays.asList(array);
        list.forEach(item -> {
            System.out.print(item + " ");
        });


        System.out.println();
        list.forEach(System.out::print);
    }

}
