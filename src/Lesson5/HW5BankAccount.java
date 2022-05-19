
package Lesson5;

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
