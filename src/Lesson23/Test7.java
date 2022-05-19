
package Lesson23;

public class Test7 {
    
    public static void main(String[] args) {
        
        Mouse3 m1 = new Mouse3();
        m1.showInfoAboutAnimal(); // Name: some Animal
        m1.showInfoAboutMouse(); // Name: Jerry
        // потому что showName статик, соответственно происходит не оверрайдинг, а хайдинг
        // если бы showName был нон-статик 2 раза вывело бы Name: Jerry
        // так как метод бы ПЕРЕПИСАЛСЯ
        
        // если бы метод был не нон статик, то компилятор смотрел бы на метод  showName именно сабкласса маус
        
    }
    
}

class Animal3{

    static String showName(){
        return "some Animal";
    }
    
    void showInfoAboutAnimal(){
        System.out.println("Name: " + showName());
    }
    
}

class Mouse3 extends Animal3{
   
    static String showName(){
        return "Jerry";
    }
    
    void showInfoAboutMouse(){
        System.out.println("Name: " + showName());
    }
    
}