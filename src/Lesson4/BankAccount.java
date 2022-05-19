
package Lesson4;
// тут будет шаблон класса BankAccount
public class BankAccount {
    
    int id; // по дефолту равен 0
    String name; // по дефолту равен null
    double balance; // по дефолту равен 0.0
    // дефолтные значения у char - 0; boolean - false
    // ВСЕ ЭТИ ПЕРЕМЕННЫЕ - INSTANCE VARIABLES
    
    
    // если задать этим переменным определенные значения, то именно они будут значениями по умолчанию
}



class BankAccountTest {
// тут будут 3 обхекта класса BankAccount
    public static void main (String [] args) {
    
        BankAccount MyAccount = new BankAccount();
        // любой класс - это тип данных
        // bA - переменная типа данных BankAccount
        // чтобы создать объект типа данных BankAccount мы используем конструкцию
        // new BankAccount(); // новый объект типа данных (класса) BankAccount
        
        
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();
               
        MyAccount.id = 1;
        // присваиваем объекту MyAccount id, тк id int, мы можем присвоить ему 1
        
        MyAccount.name = "Dmitry";
        // присваиваем объекту MyAccount name, тк name String, мы можем присвоить ему "Dmitry"
        
        MyAccount.balance = 12.35;
        // присваиваем объекту MyAccount balace, тк balace double, мы можем присвоить ему "12.35"
             
        System.out.println(MyAccount.id);
        System.out.println(MyAccount.name);
        System.out.println(MyAccount.balance);

        // System.out.println(HisAccount.name); // null
        // String по дефолту равна null
        // любой референс тип данных по умолчанию null (ничто)   
        
        YourAccount.id = 2;
        YourAccount.name = "Mike";
        YourAccount.balance = 2.05;
       
        HisAccount.id = 3;
        HisAccount.name = "Nick";
        HisAccount.balance = 1.33;
        
    }

}