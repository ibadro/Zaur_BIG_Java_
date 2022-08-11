package Black_Belt.L02.Genenrics;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
//        List<Object> list = new ArrayList<Integer>();
        List<?> list = new ArrayList<Integer>();
        //list.add("string");

        List<? extends Number> list21 = new ArrayList<Integer>();

        List<Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(3.15);
        list1.add(3.16);
        showListInfo(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("privet");
        list2.add("poka");
        list2.add("ok");
        showListInfo(list2);

        ArrayList<Double> arrayListD = new ArrayList<>();
        arrayListD.add(3.14);
        arrayListD.add(3.15);
        arrayListD.add(3.16);
        System.out.println(summ(arrayListD));

        ArrayList<Integer> arrayListI = new ArrayList<>();
        arrayListI.add(3);
        arrayListI.add(35);
        arrayListI.add(36);
        System.out.println(summ(arrayListI));
    }

    static void showListInfo(List<?> list) {
        System.out.println("list soderzhit sled. elementy: " + list);
    }

    public static double summ(ArrayList<? extends Number> arrayList) {
        double summ = 0;
        for (Number n : arrayList) {
            summ += n.doubleValue();
        }
        return summ;
    }
}

