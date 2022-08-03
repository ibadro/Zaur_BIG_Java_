package Java_Dlia_nashin.L11.ПримитивныеИСылочныеДанныеПриПриВызовеМетода;
/*Создайте класс Cat с тремя переменными; цвет, мотор и количество дверей. Затем создайте класс CarTest, в котором должны быть 2 метода.
1-ый изменяет количество дверей объекта класса Car на количество, прописанное в параметре метода.
2-ой принимает в параметры 2 объекта класса Car и меняет их цвета местами.
Примените оба метода в main и выведите на экран атрибуты всех объектов.*/
public class HW11Car {

    String color;
    String engine;
    int doorsCount;
    public HW11Car(String color, String engine, int doorsCount) {
        this.color = color;
        this.engine = engine;
        this.doorsCount = doorsCount;
    }
}
class CarTest {
    void changedoorsCount(HW11Car c1, int doorsCount1) {
        c1.doorsCount = doorsCount1;
    }
    void changeColor(HW11Car car1, HW11Car car2) {
        String color3 = car1.color;
        car1.color = car2.color;
        car2.color = color3;
    }
    public static void main(String[] args) {
        CarTest cTest = new CarTest();
        HW11Car mazda = new HW11Car("silver", "v6", 3);
        HW11Car ford = new HW11Car("blue", "v6", 5);
        System.out.println("mazda's doors before " + mazda.doorsCount);
        cTest.changedoorsCount(mazda, 5);
        System.out.println("mazda's doors after " + mazda.doorsCount);
        System.out.println("mazda color: " + mazda.color);
        System.out.println("ford color: " + ford.color);
        cTest.changeColor(mazda, ford);
        System.out.println("after func: mazda color: " + mazda.color);
        System.out.println("after func: ford color: " + ford.color);
    }
    
}