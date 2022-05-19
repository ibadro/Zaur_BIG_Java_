
package Lesson22;

public class Human {
    
    final String sex;
    
    Human(String sex){
        this.sex = sex;
    }
    
    // ПРИВАТ АКСЕСС МОДЕФАЕР ВИДЕН ТОЛЬКО ВНУТРИ КЛАССА, ОБРАЩАТЬСЯ К НЕМУ МОЖНО ТОЛЬКО
    // ЧЕРЕЗ ПАБЛИК ГЕТТЕР И ПАБЛИК СЕТТЕР
    
    // инкапсуляция параметра name
    private String name;
    // геттер
    public String getName(){
        return name;
    }
    // сеттер
    public void setName(String s){
        name = s;
    }
    
    // инкапсуляция параметра age
    private int age;
    // геттер
    public int getAge(){
        return age;
    }
    // сеттер
    public void setAge(int a) {
        if (a > 0 && a < 100) {
            age = a;
        }
    }
    
    // инкапсуляция параметра age
    private int weight;
    // геттер
    public int getweight(){
        return weight;
    }
    // сеттер
    public void setWeight(int w){
        if (w > 0 && w < 200) {
            weight = w;
        }
    }
    
}

class Test{

    public static void main(String[] args) {
        
        Human h1 = new Human("male");
        // теперь просто нельзя задать значение объекту класса хьюман
        // h1.name = "peta"; - не сработает, потому что параметр нейм заинкапсулирован
        // и засетать его можно только через сеттер метод 
        // тоже самое и с другими заинкапсулированными параметрами
        
        h1.setName("Petia");
        h1.setAge(25);
        h1.setWeight(67);
        
        // выводить же значения будем через геттеры
        
        System.out.println(h1.getName()); // Petia
        System.out.println(h1.getAge()); // 25
        System.out.println(h1.getweight()); // 67
        
        // зададим невалидные значения возрасту и весу
        
        h1.setAge(999);
        h1.setWeight(-55);
        
        System.out.println(h1.getAge()); // 25
        System.out.println(h1.getweight()); // 67
        
        // значения не поменялись
        
    }
    
}
