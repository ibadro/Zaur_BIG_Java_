package Black_Belt.Collection.set_interface;

import java.util.HashSet;
import java.util.Set;

public class HashSetExm1 {
    public static void main(String[] args) {


        Set<String> set1 = new HashSet<>();
        set1.add("Ruslan");
        set1.add("Roman");
        set1.add("Karolina");
        set1.add("Irina");
        set1.add("Irina");
set1.remove("Rusaln");
        System.out.println(set1.size());
        System.out.println(set1);

        for (String s : set1) {
            System.out.println(s);
        }

    }


}
