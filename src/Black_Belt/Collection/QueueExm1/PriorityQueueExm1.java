package Black_Belt.Collection.QueueExm1;
import java.util.Objects;
import java.util.PriorityQueue;

public class PriorityQueueExm1 {
    public static void main(String[] args) {
        Student3 st1 = new Student3("Ruslan",5);
        Student3 st2 = new Student3("Irina",4);
        Student3 st3 = new Student3("Oksana",1);
        Student3 st4 = new Student3("Oleh",3);
        Student3 st5 = new Student3("Anton",2);
        PriorityQueue<Student3> pq1=new PriorityQueue<>(9);
        pq1.add(st1);
        pq1.add(st2);
        pq1.add(st3);
        pq1.add(st4);
        pq1.add(st5);
        System.out.println(pq1);

    }
}

class Student3 implements Comparable<Student3> {
    private String name;
    private Integer course;

    @Override
    public int compareTo(Student3 o) {
        return this.course.compareTo(o.course);
    }

    public Student3(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student3 student3 = (Student3) o;
        return course == student3.course &&
                Objects.equals(name, student3.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course);
    }

    @Override
    public String toString() {
        return "("+
                "name='" + name + '\'' +
                ", course=" + course +
                ')';
    }
}