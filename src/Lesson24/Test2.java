
package Lesson24;

public class Test2 {
    // абстракт бывают только методы и классы, абстакт переменных не бывает
    public static void main(String[] args) {
        // можно обращаться через абстаркт класс к его детям, которые не абстакт
//        Figura f1 = new Kvadrat();
//        System.out.println(f1.kolvo); // 0
        // выводит количество 0, потому что в классе
        // Figura kolvo = 0
        // compile time binding
        
//        f1.ploshad(); // ploshad kvadrata = 100
        // run time binding
        // абстактный метод класса Figura заоверрайдился
        
        
        Figura f2 = new Kvadrat(5);
        System.out.println(f2.kolvo); // 5
        f2.perimetr(); // perimetr kvadrata = 40
        
        
    }
    
    
}
// обстрактные классы и методы используются для того, чтобы обозначить, что такие
// методы будут в сабклассах, но что именно там будет, родительскому абстракт классу
// неизвестно

abstract class Figura{ // абстракт класс может и не содержать абстракт методов
    // абстакт класс может содержать конструктор, соответсвенно его дети, тоже должны его содержать
    Figura(int kolvo) {
        this.kolvo = kolvo;
    }
    
    abstract void perimetr(); // заметь, что в абстрактных методах нет боди
    abstract void ploshad(); //  заметь, что в абстрактных методах нет боди
    
    void showInfo(){ // обычный метод может существовать в абстрактном классе
        System.out.println("eto figura");
    }
    
    int kolvo = 0;
    
}

// дочерний класс должен либо перезаписать абстракт методы, либо тоже быть абстрактом
class Kvadrat extends Figura{
    // так создаются конструкторы в детях
    Kvadrat(int kolvo) {
        super(kolvo);
        this.kolvo = kolvo;
    }
    int storona = 10;
    int kolvo = 4;
    
    void perimetr(){
        System.out.println("perimetr kvadrata = " + (storona * 4));
    }
    
    void ploshad(){
        System.out.println("ploshad kvadrata = " + (storona * storona));
    }
    // как только мы прописали методы, которые были абстакт у родителя, ошибка пропала
}
// дочерний класс должен либо перезаписать абстракт методы, либо тоже быть абстрактом
class Pramougolnik extends Figura{
    
    // так создаются конструкторы в детях
    Pramougolnik(int kolvo) {
        super(kolvo);
        this.kolvo = kolvo;
    }
    
    int storona1 = 8;
    int storona2 = 5;
    int kolvo = 4;
    
    void perimetr(){
        System.out.println("perimetr Pramougolnika = " + 2* (storona1+ storona2));
    }
    
    void ploshad(){
        System.out.println("ploshad Pramougolnika = " + (storona1 * storona2));
    }
    // как только мы прописали методы, которые были абстакт у родителя, ошибка пропала
}
// дочерний класс должен либо перезаписать абстракт методы, либо тоже быть абстрактом
class Krug extends Figura{
    
    // так создаются конструкторы в детях
    Krug(int kolvo) {
        super(kolvo);
        this.kolvo = kolvo;
    }
    
    int storona = 0;
    int radius = 3;
    
    void perimetr(){
        System.out.println("perimetr Kruga = " + (2 * 3.14 * radius));
    }
    
    void ploshad(){
        System.out.println("ploshad Kruga = " + (3.14 * radius * radius));
    }
    // как только мы прописали методы, которые были абстакт у родителя, ошибка пропала
}

abstract class Chetirexugolnik extends Figura{ // делаем класс абстракт, потому что не хотим вставлять 
                                      // туда методы, которые были абстакт в классе родителе
    
    // так создаются конструкторы в детях
    Chetirexugolnik(int kolvo) {
        super(kolvo);
        this.kolvo = kolvo;
    }
    void def(){
        System.out.println("eto Chetirexugolnik");
    }
    
}