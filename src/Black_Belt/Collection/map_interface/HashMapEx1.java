package Black_Belt.Collection.map_interface;
import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(1000, "Oleg Akulov");
        map1.put(2365, "Ivan Pulov");
        map1.put(6789, "Mariya Sidorova");
        map1.put(15369, "Nikolay Petrov");
        map1.putIfAbsent(1000, "Nikolay Petrov");

      //  System.out.println(map1);
      //  System.out.println(map1.get(1000));
     //   System.out.println(map1.get(1001));
   //     map1.remove(15369);
    //    System.out.println(map1);
        System.out.println(map1.containsValue("Ivan Pulov"));
        System.out.println(map1.containsKey(600));
        System.out.println(map1.keySet());
        System.out.println(map1.values());

        Map<String,String> map2 = new HashMap<>();
        map2.putIfAbsent("Saha", "Dobryi");
        map2.putIfAbsent("Miha", "Umnyi");
        System.out.println(map2);




    }
}
