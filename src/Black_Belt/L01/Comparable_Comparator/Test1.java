package Black_Belt.L01.Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {

    public static void main(String[] args) {
        List<Emloyee> list = new ArrayList<>();
        Emloyee emp1 = new Emloyee(11232,"Zaur", "errrrrrrf",234);
        Emloyee emp2 = new Emloyee(1234124,"Zaur1", "aeeeeee",23334);
        Emloyee emp3 = new Emloyee(55555,"Zaur1", "qqweqweqw",2343);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println(" До сортировки \n " + list);
        Collections.sort(list);
        System.out.println(" После сортировки \n " + list);

    }
}
class  Emloyee implements Comparable<Emloyee> {
    int id;
    String name;
    String surname;
    int salary;

    // вызов конструктора альт+insert и выбираем все параметры конструктора
    public Emloyee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    // мед tostring альт+insert и выбираем все параметры
    public String toString() {
        return "Emloyee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Emloyee anotherEmp) {
        // первый вариант сортировки по Id
//        if (this.id == anotherEmp.id){
//            return 0;
//        }
//        else if (this.id< anotherEmp.id){
//            return -1;
//        }
//        else {
//            return 1;
//        }


        //  return this.id- anotherEmp.id; // альтернативный метод поска по Id

        int res = this.name.compareTo(anotherEmp.name); // сортировка по имени
        if (res == 0) {
            res = this.surname.compareTo(anotherEmp.surname);
        }
        return res;
    }
}