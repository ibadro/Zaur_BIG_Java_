package ОсновыJava.ПодробнееОМетодахиКлассах;
/*Как и методы, конструкторы также могут перегружаться, что дает возможность
создавать объекты различными способами. В качестве примера рассмотрим
следующую программу.
// Демонстрация перегрузки конструкторов*/
public class MyClass {
    int x;
    MyClass() { //Создание объектов разными способами
        System.out.println("Внутри MyClass(). ");
        x = 0;
    }
    MyClass(int i) { //Создание объектов разными способами
        System.out.println("Внутри MyClass (int) . ");
        x = i;
    }
    MyClass(double d) { //Создание объектов разными способами
        System.out.println("Внутри MyClass(double).");
        x = (int) d;
    }
    MyClass(int i, int j) { //Создание объектов разными способами
        System.out.println("Внутри MyClass(int, int).");
        x = i * j;
    }
}
class OverloadConsDemo {
    public static void main(String args[]) {
        MyClass tl = new MyClass();
        MyClass t2 = new MyClass(88);
        MyClass t3 = new MyClass(17.23);
        MyClass t4 = new MyClass(2, 4);
        System.out.println("tl.x: " + tl.x);
        System.out.println("t2.x : " + t2.x);
        System.out.println("t3.x : " + t3.x);
        System.out.println("t4.x: " + t4.x);
    }
}

/*В данном примере конструктор MyClass () перегружается четырежды. Во
всех перегруженных версиях этого конструктора объект типа MyClass создается
по-разному. Конкретный вариант конструктора выбирается на основании
параметров, которые указываются при выполнении оператора new. Перегружая
конструктор класса, вы предоставляете пользователю созданного вами класса
свободу в выборе способа конструирования объекта.*/