
package Java_Dlia_nashin.L07.ПакетИМодификаторыВидимости;
/*Пересоздайте класс имполии таким образом, чтобы переменная салари была не доступна вне класса, перменная сурнаме была доступна отовсюду, а переменная Ид только внутри пакета
* Также создайте 3 паблик метода, которые будут показывать на дисплее значения этих переменных. Создайте для данного класса 3 разных конструктора с паблик, дефолт и приват
*  акссес модифаерами. В конструкторе присваивайте переменным класса значения из параметров. Создайте новые классы в том же и в другом пакете. Попытайтесь в них создать обьект класса
* имплоии и вывести на экран значения данного  обьетка с помощью метода принтлн и методов самого класса.*/

public class HW7Employee {
    private double salary;
    public String surname;
    int id;
    public void showSalary() {
        System.out.println(salary);
    }
    public void showSurname() {
        System.out.println(surname);
    }
    public void showId() {
        System.out.println(id);
    }
    
    public HW7Employee (double salary1, String surname1, int id1) {
        salary = salary1;
        surname = surname1;
        id = id1;
    }
    HW7Employee (double salary2, String surname2) {
        this(salary2, surname2, 0);
    }
    private HW7Employee (String surname3) { // never used, тк прайват, я могу его заюзать только внутри класса HW7Employee, не в HW7EmployeeTest
        this(0.0, surname3, 0);
    }
}
