// РЕШИМ ПРОБЛЕМУ ИЗ ПРОШЛОГО КЛАССА
package Lesson22;

public class Human_3 {
    
    final StringBuilder sex;
    
    Human_3(StringBuilder sex){
        this.sex = sex;
    }

    private StringBuilder name;
    
    // таким образом мы будем работать с копией private StringBuilder name
    public StringBuilder getName(){
        StringBuilder sb1 = new StringBuilder(name);
        return sb1; // возвращаю не сам объект, а его копию
    }

    public void setName(StringBuilder s){
        name = s;
    }

    private int age;

    public int getAge(){
        return age;
    }

    public void setAge(int a) {
        if (a > 0 && a < 100) {
            age = a;
        }
    }

    private int weight;

    public int getweight(){
        return weight;
    }

    public void setWeight(int w){
        if (w > 0 && w < 200) {
            weight = w;
        }
    }
    
}

class Test3_3{

    public static void main(String[] args) {
        
        Human_3 h1 = new Human_3(new StringBuilder("male"));
        
        h1.setName(new StringBuilder("Petro"));
        h1.setAge(25);
        h1.setWeight(67);

        
        System.out.println(h1.getName()); // Petia
        System.out.println(h1.getAge()); // 25
        System.out.println(h1.getweight()); // 67
        

        h1.getName().append("ggg");
        System.out.println(h1.getName()); // Petro
        // проблема решена, теперь через геттер, если мы что-то и поменяем, то поменяется лишь копия
        // а сам объект не изменяется
        
        
    }
    
}
