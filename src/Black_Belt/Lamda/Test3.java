package Black_Belt.Lamda;

import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.function.Consumer;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<Car> ourCars = creatThreeCars(() ->
                new Car("Nissan Tiida", "Silver Metallic", 1.6));
        System.out.println("ourCars = " + ourCars);
        changeCar(ourCars.get(0),
                car -> {
                    car.color = "red";
                    car.engine = 2.4;
                    System.out.println("upgraded car = " + car);
                });
        System.out.println("ourCars = " + ourCars);

    }

    public static ArrayList<Car> creatThreeCars(Supplier<Car> carSupplier) {
        ArrayList<Car> a1 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            a1.add(carSupplier.get());
        }
        return a1;
    }

    public static void changeCar(Car car, Consumer<Car> carConsumer) {
        carConsumer.accept(car);
    }
}

class Car {
    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}