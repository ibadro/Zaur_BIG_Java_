package Black_Belt.L01.Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.*;

public class Test1_1 {
    public static void main(String[] args) {
        List<Emloyee1> list = new ArrayList<>();
        Emloyee1 emp11 = new Emloyee1(11232,"Zaur", "errrrrrrf",234);
        Emloyee1 emp22 = new Emloyee1(1234124,"Zaur1", "aeeeeee",23334);
        Emloyee1 emp33 = new Emloyee1(55555,"Zaur1", "qqweqweqw",2343);
        list.add(emp11);
        list.add(emp22);
        list.add(emp33);
        System.out.println(" До сортировки \n " + list);
        Collections.sort(list, new SalaryComporator());
        System.out.println(" После сортировки \n " + list);
    }
}
class  Emloyee1 {

    int id;
    String name;
    String surname;
    int salary;

    public Emloyee1(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Emloyee1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }
}
class IdComporator implements Comparator<Emloyee1> {
    @Override
    public int compare(Emloyee1 emp1, Emloyee1 emp2) { // сравниваем 2 работников
        if (emp1.id == emp2.id) {
            return 0;
        } else if (emp1.id < emp2.id) {
            return -1;
        } else {
            return 1;
        }
    }
}

class nameComporator implements Comparator<Emloyee1> {
    @Override
    public int compare (Emloyee1 emp1, Emloyee1 emp2){
        return emp1.name.compareTo(emp2.name);
    }

}
class SalaryComporator implements Comparator<Emloyee1> {
    @Override
    public int compare (Emloyee1 emp1, Emloyee1 emp2){
        return emp1.name.compareTo(emp2.name);
    }

}