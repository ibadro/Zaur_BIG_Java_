package ОсновыJava.КлассыОбьектыМетоды;
// Добавление конструктора
class Vehicle7 {
    int passengers; // количество пассажиров
    int fuelcap; // емкость топливного бака
    int mpg; // потребление топлива в милях на галлон
    Vehicle7(int p, int f, int m) { // <----------Конструктор класса Vehicle
        passengers = p;
        fuelcap = f;
        mpg = m;
    }
        int range () { // Определение дальности поездки транспортного средства
            return mpg * fuelcap;
        }
        double fuelneeded ( int miles){ // Расчет объема топлива, необходимого транспортному  средству для преодоления заданного расстояния
            return (double) miles / mpg;
        }
    }

    // Определение дальности поездки транспортного средства
    class VehConsDemo {
        public static void main(String args[]) {
// Завершение создания объектов транспортных средств
            Vehicle7 minivan = new Vehicle7(7,16,21);
            Vehicle7 sportscar = new Vehicle7(2, 14, 12);
            double gallons;
            int dist = 252;
            gallons = minivan.fuelneeded(dist);
            System.out.println("Для преодоления " + dist + " миль мини-фургону требуется " + gallons + " галлонов топлива");
            gallons = sportscar.fuelneeded(dist);
            System.out.println("Для преодоления " + dist + " миль спортивному автомобилю требуется " + gallons + " галлонов топлива");


        }
    }
