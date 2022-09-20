package Black_Belt.stream;
import java.util.ArrayList;
import java.util.List;

public class ParallelStream {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(10.0);
        list.add(5.0);
        list.add(1.0);
        list.add(0.25);

        double sumResult =  list.parallelStream()
               .reduce((accumulator, element) -> accumulator + element).get();

       System.out.println("sumResult = " + sumResult);

        double divisionResult =  list.stream()// parallelStream дает неверное решение!!!!
                .reduce((accumulator, element) -> accumulator / element).get();

        System.out.println("divisionResult = " + divisionResult);
    }
}