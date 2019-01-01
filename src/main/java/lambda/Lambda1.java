package lambda;

import java.util.Comparator;

public class Lambda1 {

    public static void main(String[] args) {
//        System.out.println(comp1("hello", "world"));
//        System.out.println(comp2("hello", "world"));
    }

//    private static boolean comp1(String hello, String world) {
//    }

    static Comparator<String> comp1 = (first, second) -> Integer.compare(first.length(), second.length());

    static Comparator<String> comp2 = (first, second) -> {
        if (first.length() < second.length()) {
            return -1;
        } else if (first.length() > second.length()) {
            return 1;
        } else {
            return 0;
        }
    };
}
