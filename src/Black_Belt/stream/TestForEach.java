package Black_Belt.stream;

import java.util.Arrays;

public class TestForEach {
    public static void main(String[] args) {


        int[] array = {5, 9, 3, 8, 1};
        Arrays.stream(array).forEach(e -> {
            e *= 2;
            System.out.println(e);
        });
        Arrays.stream(array).forEach(e -> {
            System.out.println(e);
        });
        Arrays.stream(array).forEach(System.out::println);
        Arrays.stream(array).forEach(Utils::myMethod);
        Arrays.stream(array).forEach(el -> Utils.myMethod(el));

    }
}

class Utils {
    public static void myMethod(int a) {
        a += 5;
        System.out.println("Element = " + a);
    }
}
