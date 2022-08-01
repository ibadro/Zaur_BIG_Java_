
package Java_Dlia_nashin.L05.КострукторОбьявлениеИВызовМетодов;
/*Создайте класс эмплои с атрибутами ид, имя, фамилия, зарплата, департамент, которые должны задаваться в конструкторе.
* В данном классе также создайте метод увеличения зп вдвое. Создайте второй метод класса эмплоитест, в котором создайте 2 объекта эмплои.
* Увеличьте зп каждому работнику вдвое с помощью метода и выведите на экран значение новой зп.
*  */

public class  HW5Employee {
    int id;
    String surname;
    int age;
    int salary;
    String department;
    HW5Employee (int id1, String surname1, int age1, int salary1, String department1) {
        id = id1;
        surname = surname1;
        age = age1;
        salary = salary1;
        department = department1;
    }
    double x2Salary() {  // метод увеличения зп
        salary *= 2;
        return salary;
    }
}
class HW5EmployeeTest {
    public static void main(String [] args) {
    
        HW5Employee dimaEmployee = new HW5Employee(142, "Dmitry", 26, 1200, "QA");
        HW5Employee AlexEmployee = new HW5Employee(143, "Alexey", 37, 2700, "Dev");
        
        System.out.println(dimaEmployee.salary);
        dimaEmployee.x2Salary();
        System.out.println("new salary: " + dimaEmployee.salary);
        
        System.out.println(AlexEmployee.salary);
        AlexEmployee.x2Salary();
        System.out.println("new salary: " + AlexEmployee.salary);
    
    }

}