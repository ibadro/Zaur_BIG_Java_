package Black_Belt.Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Oleg");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add("Kolya");
        arrayList1.add("Elena");

        Iterator<String> iterator  = arrayList1.iterator(); // повторитель
        while (iterator.hasNext()){
          //   iterator.next();
            //    iterator.remove();
             System.out.println(iterator.next());

        }
        System.out.println(arrayList1);
    }

}