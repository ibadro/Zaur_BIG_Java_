package Black_Belt.L02.Genenrics;

public class ParameterizedClass {



        public static void main(String[] args) {
            Info<Integer> info1 = new Info<>(5555);
            System.out.println(info1.toString());
            Info<Car> car = new Info<Car>();
            System.out.println(info1.getValue());
            Info<String> info2 = new Info<>("privet");
            System.out.println(info2.toString());
            System.out.println(info2.getValue());
        }
    }


    class Info <T> {
        private T value;

        public Info(T value) {
            this.value = value;
        }
        public Info(){}

        public T getValue() {
            return value;
        }

        @Override
        public String toString() {
            return "("+value+")" ;
        }
    }

    class Car {
        String color;

        public Car(String color) {
            this.color = color;
        }
    }
