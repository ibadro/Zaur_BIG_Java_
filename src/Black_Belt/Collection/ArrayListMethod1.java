package Black_Belt.Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethod1 {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();

        //method add()
        arrayList.add("Alex");
        arrayList.add("Stiv");
        arrayList.add("Rob");
        //можно написать добавление таким образом
        arrayList.add(1, "Michael");
        for (String str : arrayList) {
            System.out.println(str);
        }
        System.out.println("********************1");

        //method get()
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println("********************2");

        //method set()
        //в этом примере мы вставляем Rob на позицию 1
        arrayList.set(1, "Rob");
        for (String s : arrayList) {
            System.out.println(s);
        }
        System.out.println("********************3");

        //method remove()
        //после удаления все элементы смещаются влево
        arrayList.remove(0);
        arrayList.remove("Rob");

        List<String> arrayLis2 = new ArrayList<>(arrayList);
        System.out.println(arrayLis2);
    }
}
