package Alishev.ВложенныеКлассы;

public class Electrocar {
    private int id;

    // вложенный нестатический класс
    private class Motor{
        public void startMotor(){
            System.out.println("Motor " + id + " is starting");
        }


        }

        /// статический вложенный класс
    public static class Battery{
        public void charge(){
            System.out.println("charging");
        }
    }
    public Electrocar(int id){
        this.id=id;


    }
    public void start(){
        Motor motor=  new Motor();
        motor.startMotor();
        final int x =1;
        // влоденые классы
        class SomeClass{
            public void someMethod(){
                System.out.println(x);
                System.out.println(id);
            }
        }
        System.out.println("Electrocar " + id + " is starting");
    }
}
