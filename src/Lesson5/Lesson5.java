
package Lesson5;

public class Lesson5 {
    
    int summa(int a, int b, int c) {
    // int - return type, summa - name of method
    // (int a, int b, int c) - parameters of method
    
        int result = a + b + c;
        return result;
        // return ВСЕГДА должен возвращать тот же тип данных
        // который указан в return type
           
    }
    // таким образом создается метод
    
    
    int averageNumber(int a1, int b1, int c1) {
    
        int result2 = summa(a1, b1, c1) / 3;
        return result2;
        // вызываем метод сумма внутри нового метода averageNumber
        
    }
    
    
}

class Lesson5_1 {

    public static void main(String[] args) {
    
        Lesson5 less5 = new Lesson5();
        // ВСЕГДА! name of contructor (new Lesson5()) = name of class (class Lesson5)
       
        int summaTrex = less5.summa(1, 2, 3); // (1, 2, 3) - аргументы метода summa объекта less5 класса Lesson5
    // System.out.println(summaTrex);
    // таким образом вызывается метод, он должен вызываться в методе мейн
    // следовательно мы создаем объект класса Lesson5, в котором
    // существует метод summa, результат метода сумма присваиваем переменной
    // типа интеджер, тк int summa, и выводим его принтом
        System.out.println(less5.summa(4, 5, 1));
        // вызываем ф-ию сумма, которая принадлежит обхекту лесс5 прямо в принте
    
        
        System.out.println(less5.averageNumber(20, 40, 60)); // 40
    
    }

}
