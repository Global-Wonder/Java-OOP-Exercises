public class Car{
    String brand;
    double speed;

    
    void start(){
        System.out.println("The car is starting");

    }

    void displayInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);

    }

    
    public static void main(String[] args){
        Car car1 = new Car();
        Car car2 = new Car();

        car1.brand = "Toyota";
        car1.speed = 95;

        car2.brand = "Mercedes Benz";
        car2.speed = 120;

        car1.start();
        car1.displayInfo();

       car2.start();
       car2.displayInfo();
    }


}

