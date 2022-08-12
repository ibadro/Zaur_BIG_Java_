package Black_Belt.Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("zaur");
        arrayList1.add("ivan");
        arrayList1.add("zmaria");
        System.out.println(arrayList1);
        ArrayList<String> arrayList2 = new ArrayList<>(200); // создали размером 200
        arrayList2.add("zaur");
        arrayList2.add("ivan");
        List<String> arrayList3 = new ArrayList<>();
        ArrayList<String> arrayList4 = new ArrayList<>(arrayList1);
        System.out.println(arrayList4);
    }


}
