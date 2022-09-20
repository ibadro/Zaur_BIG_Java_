package Black_Belt.L02.Genenrics;

import java.util.ArrayList;
import java.util.List;


public class Test1 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("poka");
        list.add("ok");
        for (Object o : list) {
            System.out.println(o + " dlina " + ((String) o).length());
            //     Object i = Integer.valueOf(42);
            // String s = (String)i;
        }
    }
}