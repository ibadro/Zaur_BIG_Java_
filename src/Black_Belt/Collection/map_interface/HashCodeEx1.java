package Black_Belt.Collection.map_interface;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeEx1 {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student st1 = new Student("Oleg", "Akulov", 3);
        Student st2 = new Student("Mariya", "Ivanova", 1);
        Student st3 = new Student("Sergey", "Petrov", 4);
        map.put(st1, 7.5);
        map.put(st2, 8.7);
        map.put(st3, 9.2);
 //      System.out.println(map);
 //      System.out.println(map.containsKey(st1));
//       System.out.println(st1.hashCode());
//        st1.course=4;
//        System.out.println(map.containsKey(st1));
//        System.out.println(st1.hashCode());

 //       Student st4 = new Student("Oleg", "Akulov", 3);
  //      Student st5 = new Student("Ig", "Sidorov", 4);
 //       boolean result = map.containsKey(st4);
 //       System.out.println("result= " + result);
       // System.out.println(st1.equals(st4));
 //       System.out.println(st1.hashCode());
//        System.out.println(st5.hashCode());
        for (Map.Entry<Student,Double> entry:map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        Map <Integer, String> map2 = new HashMap<>(16,0.75f);
    }
}

final class Student implements Comparable<Student>{
    final String name;
    final String surname;
    final int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return " Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course &&
                Objects.equals(name, student.name) &&
                Objects.equals(surname, student.surname);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }

    @Override
    public int compareTo(Student o)  {
        return this.name.compareTo(o.name);
    }

}
