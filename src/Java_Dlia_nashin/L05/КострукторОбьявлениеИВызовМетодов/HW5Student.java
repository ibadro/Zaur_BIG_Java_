
package Java_Dlia_nashin.L05.КострукторОбьявлениеИВызовМетодов;
/* Измените класс студентест так, чтобы среднюю арифметическую оценку студента выводил на экран метод.
* т е создайте 1 метод, параметр которого - это обект класса студент, а в теле метода будет вычисляться средняя арифмет оценка и выводить на экран */
class HW5Student {
    int ticketNumber;
    String firstName;
    String lastName;
    int year;
    HW5Student (String fName, String lName, int y, int tNumber) {
        firstName = fName;
        lastName = lName;
        year = y;       
        ticketNumber = tNumber;
    }
    double averagePoint (double m, double e, double f) {
        double result;
        result = (m + e + f) / 3;
        System.out.println("firstName: " + firstName + ", last name: " + lastName + ", average point: " + result);
        return result;
    }
}
class HW5StudentTest {
    public static void main(String [] args) {
        HW5Student studentFromChina = new HW5Student("Hung", "Wan", 3, 111);
        HW5Student studentFromIran = new HW5Student("Ali", "Ibragim", 3, 222);
        HW5Student studentFromRussia = new HW5Student("Alex", "Bondarev", 3, 333);
        studentFromChina.averagePoint(7, 8.6, 4.2);
        studentFromIran.averagePoint(2.2, 8.8, 10.0);
        studentFromRussia.averagePoint(7.4, 6.8, 10);
    }
}
