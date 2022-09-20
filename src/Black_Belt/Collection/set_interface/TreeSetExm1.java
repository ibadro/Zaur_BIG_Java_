package Black_Belt.Collection.set_interface;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExm1 {
    public static void main(String[] args) {
        Set<Integer> ts1 = new TreeSet<>();
        ts1.add(5);
        ts1.add(7);
        ts1.add(1);
        ts1.add(10);
        ts1.add(3);
        // System.out.println(ts1);
        Student2 st1 = new Student2("Ruslan", 5);
        Student2 st2 = new Student2("Oleh", 2);
        Student2 st3 = new Student2("Irina", 1);
        Student2 st4 = new Student2("Zaur", 4);
        Student2 st5 = new Student2("Oksana", 3);
        Student2 st6 = new Student2("Pavel", 2);
        Student2 st7 = new Student2("Katerina", 4);
        TreeSet<Student2> treeSet2 = new TreeSet<>();
        treeSet2.add(st1);
        treeSet2.add(st2);
        treeSet2.add(st3);
        treeSet2.add(st4);
        treeSet2.add(st5);
        System.out.println(treeSet2);
//        System.out.println(treeSet2.contains(st6));
        System.out.println(treeSet2.first());
        System.out.println(treeSet2.last());
        System.out.println(treeSet2.headSet(st6));
        System.out.println(treeSet2.tailSet(st6));
        System.out.println(treeSet2.subSet(st6,st7));
    }
}

class Student2 implements Comparable<Student2> {
    private String name;
    private Integer cours;

    public Student2(String name, int cours) {
        this.name = name;
        this.cours = cours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student2 student2 = (Student2) o;
        return cours == student2.cours &&
                Objects.equals(name, student2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cours);
    }

    @Override
    public String toString() {
        return "(" +
                "name='" + name + '\'' +
                ", cours=" + cours +
                ')';
    }

    @Override
    public int compareTo(Student2 o) {
        return cours.compareTo(o.cours);
    }
}