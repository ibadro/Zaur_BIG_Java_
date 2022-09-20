package Black_Belt.Collection.set_interface;

import java.util.HashSet;

public class HashSetExm2 {
    public static void main(String[] args) {
        HashSet<Integer> hs1 = new HashSet<>();
        hs1.add(1);
        hs1.add(3);
        hs1.add(8);
        hs1.add(5);
        hs1.add(12);

        HashSet<Integer> hs2 = new HashSet<>();
        hs2.add(7);
        hs2.add(3);
        hs2.add(5);
        hs2.add(8);
        hs2.add(4);

        System.out.println(hs1);
        System.out.println(hs2);
        System.out.println("union");

        HashSet<Integer> union = new HashSet<>(hs1);

        System.out.println(union);

        union.addAll(hs2);

        System.out.println(union);
        System.out.println("intersect");

        HashSet<Integer> intersect = new HashSet<>(hs1);
        intersect.retainAll(hs2);
        System.out.println(intersect);
        System.out.println("subtract");

        HashSet<Integer> subtract = new HashSet<>(hs1);
        subtract.removeAll(hs2);
        System.out.println(subtract);

    }
}