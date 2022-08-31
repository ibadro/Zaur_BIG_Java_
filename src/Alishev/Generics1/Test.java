package Alishev.Generics1;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

       ///////// Java5 ////////
        List animals = new ArrayList();
       // Animal ourAnimal = new Animal();
        animals.add("cat");
        animals.add("frog");
        animals.add("dog");
      //  animals.add(ourAnimal);


        String animal = (String) animals.get(1);
        System.out.println(animal);


        //////////// С появлением  generic//////
        List<String> animal55 = new ArrayList<String>();
        animal55.add("cat");
        animal55.add("frog");
        animal55.add("dog");

        String animals2 = animal55.get(1);


        //////// Java 7/////////
        List<String> animal555 = new ArrayList<>();
    }

}



