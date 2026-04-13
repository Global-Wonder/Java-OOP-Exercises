public class Vehicle {
    protected String brand;

    public Vehicle(String brand){
        this.brand = brand;
    
    }

    void startEngine(){
        System.out.println(brand + " vehicle engine is starting....");
    }
   
}

class Car extends Vehicle{
    public Car(String brand){
        super(brand);
    }

    @Override
    void startEngine(){
        super.startEngine();
        System.out.println(brand + " car: Vroom vroom!");
    }

}

class Motorcycle extends Vehicle{
    public Motorcycle(String brand){
        super(brand);
    }

    @Override
    void startEngine(){
        super.startEngine();
        System.out.println(brand + " motorcycle: Revvvvv!");
    }



}
class InheritanceDemo {
     public static void main(String[] args){
        Car car = new Car(" Toyota");
        Motorcycle bike = new Motorcycle("Harley");

        System.out.println("===Method Overriding Demo===");
        car.startEngine();
        System.out.println();
        bike.startEngine(); 

    }
}







