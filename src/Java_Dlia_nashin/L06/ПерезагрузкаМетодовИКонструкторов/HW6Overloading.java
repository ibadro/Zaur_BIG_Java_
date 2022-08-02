
package Java_Dlia_nashin.L06.ПерезагрузкаМетодовИКонструкторов;
/* Создайте класс, в котором будет 5 оверлоад методов, которые вычисляют суммму нуля, одного, двух, трех и четырех целых чисел
* соответственно, передают эту сумму в отутпут и выводят на экран. В случае, когда слагаемые отсутствуют (те когда параметров нет) сумма пусть ровняется 0.*/

class  HW6Overloading {
    int summ () {
        int result = 0;
        System.out.println(result);
        return result;
    }
    int summ (int x) {
        int result = x;
        System.out.println(result);
        return result;
    }
    int summ (int x1, int y1) {
        int result = x1 + y1;
        System.out.println(result);
        return result;
    }
    int summ (int x2, int y2, int z2) {
        int result = x2 + y2 + z2;
        System.out.println(result);
        return result;
    }
    int summ (int x3, int y3, int z3, int e3) {
        int result = x3 + y3 + z3 + e3;
        System.out.println(result);
        return result;
    }
}
class HW6OverloadingTest {
    public static void main(String [] args) {
        HW6Overloading overloadedMethod = new HW6Overloading();
        overloadedMethod.summ();
        overloadedMethod.summ(1);
        overloadedMethod.summ(2, 3);
        overloadedMethod.summ(4, 5, 6);
        overloadedMethod.summ(7, 8, 9, 0);
    }
}