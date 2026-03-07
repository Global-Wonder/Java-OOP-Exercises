public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    void eat(){
        System.out.println(name + " is eating...");
    }

    void sleep(){
        System.out.println(name + " is sleeping...");    
    }

    void makeSound(){
        System.out.println("Some generic animal sound");
    }
    
}

class Dog extends Animal{
    private String breed;

    public Dog(String name, int age, String breed){
        super(name, age);
        this.breed = breed;
    }

    @Override
    void makeSound(){
        super.makeSound();
        System.out.println(getName() + " says: Woof woof!");
    }

    void fetch(){
        System.out.println(getName() + " is fetching water!");
    }

}

class Cat extends Animal{
    private boolean isIndoor;

    public Cat(String name, int age, boolean isIndoor){
        super(name, age);
        this.isIndoor = isIndoor;
    }

    @Override
    void makeSound(){
        super.makeSound();
        System.out.println(getName() + " says: Meow!");
    }

    void scratch(){
        System.out.println(getName() + " is scratching!");
    }
}

class Main{
    public static void main(String[] args){
            System.out.println("=== Creating a dog object=====");
            Dog dog = new Dog("Buddy", 3, "Golden Retriever");
            
            dog.eat();
            dog.sleep();
            dog.makeSound();
            dog.fetch();

            System.out.println("\n=== Creating a cat object====");
            Cat cat = new Cat("Whiskers", 2, true);

            cat.eat();
            cat.sleep();
            cat.makeSound();
            cat.scratch();


            System.out.println("\n=== Polymorphism ===");
            Animal[] animals = {dog, cat};

            for (Animal animal : animals){
                animal.makeSound();
            }
    }

}


