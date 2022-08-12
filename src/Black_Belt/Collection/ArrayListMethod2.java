package Black_Belt.Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ArrayListMethod2 {
    public static void main(String[] args) {

        Student st1 = new Student("Ivan", 'm', 22, 3,   8.3);
        Student st2 = new Student("Nick", 'm', 28, 2,   6.4);
        Student st3 = new Student("Elena", 'w', 19, 1,   8.9);
        Student st4 = new Student("Petr", 'm', 35, 4,   7);
        Student st5 = new Student("Mariya", 'w', 23, 5,    7.7);

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);
        for (Student stAM : studentList) { //
            System.out.println(stAM);
        }
        System.out.println("*************************");

        //Шестой студент точно такой же, как и пятый. Но они ссылаются на разные
        //объекты. Поэтому он не удалится. чтобы удалить объект с такими
        // параметрами надо переопределить метод equals()
        Student student6 = new Student("Mariya", 'w', 23, 5, 7.7);
        //method remove()
        studentList.remove(student6);
        for (Student stAM : studentList) {
            System.out.println(stAM);
        }
        System.out.println("*************************");
    }
}

    class Student {
        private String name;
        private char sex;
        private int age;
        private int course;
        private double avgGrade;

        public Student(String name, char sex, int age, int course, double avgGrade) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.course = course;
            this.avgGrade = avgGrade;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", sex=" + sex +
                    ", age=" + age +
                    ", course=" + course +
                    ", avgGrade=" + avgGrade +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return sex == student.sex && age == student.age && course == student.course && Double.compare(student.avgGrade, avgGrade) == 0 && Objects.equals(name, student.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, sex, age, course, avgGrade);
        }
    }

