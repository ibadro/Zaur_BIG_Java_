package Black_Belt.Collection.TreMap1;

import java.util.Objects;
import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {
        TreeMap <Student1, Integer> treeMap = new TreeMap<>();
        Student1 st1 = new Student1("Ruslan","Huba",3);
        Student1 st2 = new Student1("Oleh","Ivanov",2);
        Student1 st3 = new Student1("Ihor","Belov",1);
        Student1 st4 = new Student1("Elena","Samoilenko",5);
        Student1 st5 = new Student1("Ekaterina","Petrova",2);
        Student1 st6 = new Student1("Irina","Lyah",4);
        Student1 st7 = new Student1("Zahar","Berkut",4);
        treeMap.put(st1,5);
        treeMap.put(st2,4);
        treeMap.put(st3,8);
        treeMap.put(st4,1);
        treeMap.put(st5,9);
        treeMap.put(st6,12);
        treeMap.put(st7,6);

//        System.out.println(treeMap);
//        System.out.println(treeMap.get(st2));
//        System.out.println(treeMap.descendingMap());
        TreeMap <Integer, Student1> treeMap2 = new TreeMap<>();
        treeMap2.put(1,st1);
        treeMap2.put(4,st2);
        treeMap2.put(7,st3);
        treeMap2.put(15,st4);
        treeMap2.put(8,st5);
        treeMap2.put(6,st6);
        treeMap2.put(5,st7);
       // System.out.println(treeMap2);
        System.out.println(treeMap2.tailMap(7));
        System.out.println(treeMap2.headMap(7));
        System.out.println(treeMap2.lastEntry());
        System.out.println(treeMap2.firstEntry());

    }
}

class Student1 implements Comparable<Student1> {
    private String name;
    private String surname;
    private int cource;

    public Student1(String name, String surname, int cource) {
        this.name = name;
        this.surname = surname;
        this.cource = cource;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getCource() {
        return cource;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", cource=" + cource +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student1 student1 = (Student1) o;
//        return cource == student1.cource &&
//                Objects.equals(name, student1.name) &&
//                Objects.equals(surname, student1.surname);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, surname, cource);
//    }


    @Override
    public int compareTo(Student1 o) {
        return name.compareTo(o.name);
    }

}
