package ОсновыJava.КлассыОбьектыМетоды;
/*
Добавление параметризированного метода, в котором выполняется
расчет объема топлива, необходимого транспортному средству
для преодоления заданного расстояния.
*/
public class Vehicle66 {
    int passengers1; // количество пассажиров
    int fuelcap1; // емкость топливного бака
    int mpg1; // потребление топлива в милях на галлон
    // Определение дальности поездки транспортного средства
    int range() { return mpg1 * fuelcap1; }
    // Расчет количества топлива, необходимого транспортному средству для преодоления заданного расстояния
    double fuelneeded(int miles) {
        return (double) miles / mpg1;
    }
}
class CompFuel {
    public static void main(String args[]) {
        Vehicle66 minivan2 = new Vehicle66();
        Vehicle66 sportscar2 = new Vehicle66();
        double gallons;
        int dist = 252;
// Присваивание значений полям объекта minivan
        minivan2.passengers1 = 7;
        minivan2.fuelcap1 = 16;
        minivan2.mpg1 = 21;
// Присваивание значений полям объекта sportscar
        sportscar2.passengers1 = 2;
        sportscar2.fuelcap1 = 14;
        sportscar2.mpg1 = 12;
        gallons = minivan2.fuelneeded(dist);
        System.out.println("Для преодоления " + dist +  " миль мини-фургону требуется " + gallons + " галлонов топлива");
        gallons = sportscar2.fuelneeded(dist);
        System.out.println("Для преодоления " + dist + " миль спортивному автомобилю требуется " + gallons + " галлонов топлива");
    }
}