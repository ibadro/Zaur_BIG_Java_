package Black_Belt.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

    public class ArrayListMethods5 {
        public static void main(String[] args) {
            ArrayList<String> arrayList1 = new ArrayList<>();
            arrayList1.add("Oleg");
            arrayList1.add("Ivan");
            arrayList1.add("Mariya");
            arrayList1.add("Kolya");
            arrayList1.add("Elena");
            ArrayList<String> arrayList2 = new ArrayList<>();
            arrayList2.add("zaur");
            arrayList2.add("ivan");
            arrayList1.removeAll(arrayList2);
            System.out.println(arrayList1);


            List<Integer> list1 = List.of(3, 8, 13);//static
            System.out.println(list1);
            //list1.add(100);//Exception

            List<String> list2 = List.copyOf(arrayList1);//static
            System.out.println(list2);

//            System.out.println("ArrayList= " + arrayList1);
//            Object[] array = arrayList1.toArray();
//            String[] array2 = arrayList1.toArray(String[]::new);
//            for (String s : array2) {
//                System.out.println(s);
//                 List<String> myList = arrayList1.subList(1,4);
//                System.out.println("SubList= "+myList);
//                myList.add("Fedor");
//                System.out.println("SubList= "+myList);
//                System.out.println("ArrayList= "+arrayList1);
//                arrayList1.add(2, "Semen");
            }

        }
