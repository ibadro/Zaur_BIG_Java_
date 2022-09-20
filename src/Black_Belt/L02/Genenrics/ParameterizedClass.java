package Black_Belt.L02.Genenrics;

public class ParameterizedClass {

    public static void main(String[] args) {
        Info<Integer> info1 = new Info<>(5555);
        System.out.println(info1.toString());

        System.out.println(info1.getValue());
        Info<String> info2 = new Info<>("privet");
        System.out.println(info2.toString());
        System.out.println(info2.getValue());
        Info<Car> car = new Info<Car>();
        System.out.println(car);
    }
}


/**
 * @param <T> мы не знаем какая информация будет
 */
class Info<T> { // конструктор
    private T value;

    public Info(T value) {
        this.value = value;
    }

    @Override // его овверайд метод
    public String toString() {
        return "(" + value + ")";
    }

    public Info() {
    }

    public T getValue() {
        return value;
    }

}

class Car {
    String color;

    public Car(String color) {
        this.color = color;
    }
}
