public class Vehicle {
    private String brand;
    private int year;

    public Vehicle(String brand, int year){
        this.brand = brand;
        this.year = year;
    }

    public String getBrand(){
        return brand;
    }
    
    public int getYear(){
        return year;
    }

    void start(){
        System.out.println("The vehicle is starting");
    }

    void displayInfo(){
        System.out.println("Brand:" + brand);
        System.out.println("Year: " + year);

    }
   
}

class Car extends Vehicle{
    private int numberofDoors;


    public Car(String brand, int year, int numberofDoors){
        super(brand, year);
        this.numberofDoors = numberofDoors;
    }

    void honk(){
        System.out.println("Beep beep!");

    }

    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Number of Doors: " + numberofDoors);
    }

}

class Motorcycle extends Vehicle{
    private boolean hasSideCar;

    public Motorcycle(String brand, int year, boolean hasSideCar){
        super(brand, year);
        this.hasSideCar = hasSideCar;
    }

    void wheelie(){
        System.out.println("Doing a wheelie");
    }

    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Has sidecar: " + (hasSideCar ? "Yes" : "No"));
    }

}
class InheritanceDemo {
     public static void main(String[] args){
        System.out.println("=== Creating a Car ===");
        Car car = new Car(" Toyota", 2022, 4);
        car.start();
        car.honk();
        car.displayInfo();

        System.out.println("\n=== Creating a Motorcycle ===");
        Motorcycle motor = new Motorcycle(" Harley",2023, false);
        motor.start();
        motor.wheelie();
        motor.displayInfo();

        System.out.println("\n=== Polymorphism Demonstration ===");
        Vehicle vehicle1 = new Car(" Honda", 2021, 2);
        Vehicle vehicle2 = new Motorcycle(" Ducati", 2023, true);

        vehicle1.start();
        vehicle1.displayInfo();

        vehicle2.start();
        vehicle2.displayInfo();

    }
}







