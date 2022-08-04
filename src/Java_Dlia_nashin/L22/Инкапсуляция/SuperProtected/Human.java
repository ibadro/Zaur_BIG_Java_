
package Java_Dlia_nashin.L22.Инкапсуляция.SuperProtected;

public class Human {
    
    final String pol;
    
    Human(String pol){   this.pol = pol;
    }
    // ПРИВАТ АКСЕСС МОДЕФАЕР ВИДЕН ТОЛЬКО ВНУТРИ КЛАССА, ОБРАЩАТЬСЯ К НЕМУ МОЖНО ТОЛЬКО
    // ЧЕРЕЗ ПАБЛИК ГЕТТЕР И ПАБЛИК СЕТТЕР
    
    // инкапсуляция параметра name
    private String name;
    public String getName(){
        return name;
    }  // геттер
    public void setName(String s){
        name = s;
    } // сеттер
    // инкапсуляция параметра age
    private int age;   // инкапсуляция параметра age
    public int getAge(){
        return age;
    }    // геттер
    public void setAge(int i) {     // сеттер
        if (i > 0 && i < 100) {
            age = i;
        }
    }
    // инкапсуляция параметра weight
    private int weight;
    public int getweight(){
        return weight;
    }  // геттер
    public void setWeight(int w){   // сеттер
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
