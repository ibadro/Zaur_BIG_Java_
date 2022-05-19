
package Lesson13;

public class HW13Month {
    
    int month;
    
    public static void getMonth(int nessMonth) { // чтобы постоянно не создавать объект класса HW13Month, делаю метод статичным
    
        switch(nessMonth) {
        
            case 2:
                System.out.println("в этом месяце в 2015 было 28 дней");
                break;
            case 4:
            case 6:  
            case 9:
            case 11: 
                System.out.println("в этом месяце в 2015 было 30 дней");
                break;
            case 1:
            case 3:
            case 5:
            case 7:    
            case 8:
            case 10:
            case 12:
                System.out.println("в этом месяце в 2015 был 31 день");
                break;
            default:
                System.out.println("в году всего 12 месяцев, попробуй снова");
                
        }
        
    }
    
    public static void main(String[] args) {
        
        getMonth(12); // так вызываю, потому что метод статик
        HW13Month.getMonth(2);
 
    }
    
}
