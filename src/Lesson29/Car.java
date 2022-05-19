package Lesson29;

import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.function.Consumer;
// Supplier - Поставщик
// Consumer - Потребитель

public class Car {

    String model;
    String color;
    double engine;

    Car(String model, String color, double engine) {

        this.model = model;
        this.color = color;
        this.engine = engine;

    }

    @Override
    public String toString() {
        return "Our car is " + model + ", color is " + color + ", engine is " + engine;
    }

}

class Test10 {

    // Supplier
    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {

        ArrayList<Car> a1 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            a1.add(carSupplier.get()); // у Supplier всего 1 метод абстрактный метод гет
            // а вот что делает этот метод гет, мы будет описывать в лямбда выражении
            // когда будем вызывать его

        }
        return a1;

    }

    // Consumer
//    public static void changeCar(Car car, Consumer<Car> consumer) {
//
//        consumer.accept(car);
//
//    }

    public static void main(String[] args) {

        ArrayList<Car> ourCars = createThreeCars(() -> new Car("nissan tiida", "silver", 1.6));
        System.out.println(ourCars);

        // тут мы задаем локику консьюмер методу аксепт
//        changeCar(ourCars.get(0), car -> { // вызвал метод и внутри него сказал, как он дожен выглядеть
//            car.color = "red";
//            car.engine = 2.4;
//            System.out.println("updated car: " + car);
//        });
// shift alt f - выравнивание кода
        

        // другая техника работы с консьюмером
        Consumer<Car> consumer = car -> { 
            car.color = "red";
            car.engine = 2.4;
            System.out.println("updated car: " + car);
        };
        consumer.accept(ourCars.get(0));

        System.out.println(ourCars);
    }

}
