package ОсновыJava.Наследование;
// Простая иерархия классов
// Класс, описывающий двумерные объекты
 class TwoDShape {
    double width;
    double height;
    void showDim() {
        System.out.println("Ширина и высота      " + width + " и " + height);
    }
}
    // Подкласс для представления треугольников,
// производный от класса TwoDShape
    class Triangle extends TwoDShape { //Класс Triangle наследует класс TwoDShape
        String style;
        double area() {
            return width * height / 2; //Из класса Triangle можно обращаться к членам класса TwoDShape так, как если бы это  были его собственные члены
        }
        void showStyle()    {
            System.out.println("Треугольник " + style);
        }
    }
class Shapes {
    public static void main(String args[]) {
        Triangle tl = new Triangle();
        Triangle t2 = new Triangle();
        tl.width = 4.0;
        tl.height = 4.0;
        tl.style = "закрашенный";
        t2.width = 8.0;
        t2.height = 12.0;
        t2.style = "контурный";
        System.out.println("Информация о tl: ");
        tl.showStyle();
        tl.showDim();
        System. out .println ("Площадь - " + tl.area());
        System.out.println();
        System.out.println("Информация о t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Площадь - " + t2.area());
    }

}
