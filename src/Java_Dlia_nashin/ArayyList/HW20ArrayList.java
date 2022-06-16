
package Java_Dlia_nashin.ArayyList;

import java.util.*;
// Создайте класс, в котором создайте метод abc. Инпут параметром данного метода будет n-oe количество параметров типа String
// Метод должен возвращать уже отсартированный обьект Arralist из неповторяющихся обьектов  типа String? взятых из параметра метода и выводить данный обьект на экран.
//Продемнострируйте данный метод.
public class  HW20ArrayList {
    
    void abc(String ... s) {
        
        ArrayList <String> list = new ArrayList<>();
        
        for(String ss:s) {
            if (!list.contains(ss)) {
                list.add(ss);
            }
        }
        
        Collections.sort(list); // sorted list
        System.out.println(list);

        
//        for (int i = 0; i < list.size(); i++) {
//
//            for (int j = i + 1; j < list.size(); j++) {
//
//                if (list.get(i) == list.get(j)) {
//                    list.remove(list.get(j));
//                }
//
//            }
//
//        }
        
    }

}

class Test {

    public static void main(String[] args) {        
        HW20ArrayList execute = new HW20ArrayList();
        execute.abc("1", "1", "2", "2", "3", "3", "ddd", "ddd", "dd", "dd", "d", "d");
    }

}
