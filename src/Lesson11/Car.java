
package Lesson11;

public class Car {
    
    int price;
    String brand;
    String owner;
    
    Car(int price, String brand, String owner) {
    
        this.price = price;
        this.brand = brand;
        this.owner = owner;
        
    }
    
}

class CarCreation {

    
    void makePriceX2(Car car1) {
    
        car1.price *= 2;
        
    }
    
    void changeOwners(Car car1, Car car2) {
    
        String color = car1.owner;
        car1.owner = car2.owner;
        car2.owner = color;
    
    }
    
    public static void main(String[] args) {
        
        CarCreation objectForExecution = new CarCreation();
        
        Car firstCar = new Car(23000, "volvo", "James Bruck");
        Car secondCar = new Car(53000, "jaguar", "Phil Jones");
        
        System.out.println(firstCar.price + " " + firstCar.brand + " " + firstCar.owner);
        System.out.println(secondCar.price + " " + secondCar.brand + " " + secondCar.owner);
        
        System.out.println("price x2");
        
        objectForExecution.makePriceX2(firstCar);
        objectForExecution.makePriceX2(secondCar);
        System.out.println(firstCar.price + " " + firstCar.brand + " " + firstCar.owner);
        System.out.println(secondCar.price + " " + secondCar.brand + " " + secondCar.owner);
        
        objectForExecution.changeOwners(firstCar, secondCar);
        System.out.println("change owners");
        System.out.println(firstCar.price + " " + firstCar.brand + " " + firstCar.owner);
        System.out.println(secondCar.price + " " + secondCar.brand + " " + secondCar.owner);
        
        
    }

}
