
package Java_Dlia_nashin.L05.КострукторОбьявлениеИВызовМетодов;
/*В класс банкакк добавьте 2 метода. Первый метод называется  пополнениесчета и увеличивает баланс на сумму, которая указана в параметре этого метода.
* Второй метод называется снятиесосчета и уменьшает баланс на сумму которая указана в параметре этого метода*/
class HW5BankAccount {
    int id;
   String name;
    double balance = 100;
    double popolnenieSceta(double summ) {
        balance += summ;
         return balance;
    }
    double snytieSoSceta(double summ) {
        balance -= summ;
        return balance;
    }
}
class HW5BankAccountTest {
    public static void main(String[] args) {
        HW5BankAccount dimaBA = new HW5BankAccount();
        double balance = dimaBA.balance;
        System.out.println(balance);
        double outputPopolnenie = dimaBA.popolnenieSceta(45);
        double outputSnytie = dimaBA.snytieSoSceta(35);
        System.out.println("after popolnenie: " + outputPopolnenie);
        System.out.println("after snyatie: " + outputSnytie);
    }
}
