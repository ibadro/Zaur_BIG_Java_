
package Lesson17;

class Car{}

public class Test2 {
    
    public static void main(String[] args) {
        
        StringBuilder sb1 = new StringBuilder("hi world");
        StringBuilder sb2 = new StringBuilder("nnn");
        
        // sb1.append() - добавляет в конец
        sb1.append(22); // int
        System.out.println(sb1); // hi world22
        
        sb1.append('#'); // char
        System.out.println(sb1); // hi world22#
        
        sb1.append(true); // boolean
        System.out.println(sb1); // hi world22#true
        
        sb1.append(" этот стринбилдер бездонный");
        System.out.println(sb1); // hi world22#true этот стринбилдер бездонный
        
        sb1.append(sb2); // моэно вообще другой StringBuilder прокинуть
        System.out.println(sb1); // hi world22#true этот стринбилдер бездонныйnnn
        
        
        sb1.append(new Car()); // можно даже присоединить только что созданный объект класса кар
        System.out.println(sb1); // Lesson17.Car@7dc36524 - так выглядит визуализация объекта класса кар
        // hi world22#true этот стринбилдер бездонныйnnnLesson17.Car@7dc36524
        
        
        // данный метод МЕНЯЕТ САМ СТРИНГБИЛДЕР СБ1
        // РАБОТАЕЬ ПОЧТИ СО ВСЕМИ ТИПАМИ ДАННЫХ, ПЕРЕВОДЯ ВСЁ В СТРИНГБИЛДЕР
        
        
        
    }
    
}
