
package Lesson13;

public class Test1 {
    
     
    
}


class Student {

    int grade;
    
    Student(int grade) {
    
        this.grade = grade;
        
    }
    
    public static void main(String[] args) {
        
        Student st1 = new Student(1);
        
//        if(st1.grade == 2) {
//            System.out.println("student ploh");
//        } else if(st1.grade == 3) {
//            System.out.println("student ploh, no mozhno podnazhat");
//        } else if(st1.grade == 4) {
//            System.out.println("student molodec");
//        } else if(st1.grade == 5) {
//            System.out.println("student otlichnik");
//        } else {
//            System.out.println("ocenka neverna");
//        }

        
        switch(st1.grade) {
        
            case 2: 
                System.out.println("student ploh");
                break; // выход  из тела свича
            case 3:
                System.out.println("student ploh, no mozhno podnazhat"); 
                break;
            case 4:
                System.out.println("student molodec");
                break;
            case 5:
                System.out.println("ocenka neverna");
                break;
            
            default: // срабатывает, когда st1.grade не равна ни одному кейсу и в случаях если не стоят брейки
            System.out.println("ocenka neverna");    
             
        }
        
    }
    
}