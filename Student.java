public class Student {
    String name;
    int age;
    String major;

    public Student(String name, int age, String major){
        this.name = name;
        this.age = age;
        this.major = major;

    }
    
    void displayStudent(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Major: " + major);
    }

    public static void main(String[] args){
        Student std1 = new Student("Emmanuel",18,"Computer Science");
        Student std2 = new Student("Adepa", 19, "Mathematics");

        std1.displayStudent();
        std2.displayStudent();
    }

    


}
