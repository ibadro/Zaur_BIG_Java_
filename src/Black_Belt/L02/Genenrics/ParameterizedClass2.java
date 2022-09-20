package Black_Belt.L02.Genenrics;

public class ParameterizedClass2 {

    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("privet", 23);
        System.out.println("Значения пары: value1 = " + pair1.getFirstValue() +
                ", value2 = " + pair1.getSecondValue());

        Pair<Integer, Double> pair2 = new Pair<>(23, 172.3);
        System.out.println("Значения пары: value1 = " + pair2.getFirstValue() +
                ", value2 = " + pair2.getSecondValue());

        PairWithOneType<String> pair3 = new PairWithOneType<>("За ВДВ!!!", "Слава ВДВ!!!");
        System.out.println("Значения пары: value1 = " + pair3.getFirstValue() +
                ", value2 = " + pair3.getSecondValue());
    }
}

class Pair<V1, V2> {

    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getFirstValue() {
        return value1;
    }

    public V2 getSecondValue() {

        return value2;
    }
}

class PairWithOneType<V> {

    private V value1;
    private V value2;

    public PairWithOneType(V value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V getFirstValue() {
        return value1;
    }

    public V getSecondValue() {
        return value2;
    }
}

