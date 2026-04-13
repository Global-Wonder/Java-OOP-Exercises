public class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public double calculateAnnualSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }
}

class FullTimeEmployee extends Employee{
    private double bonus;

    public FullTimeEmployee(String name, double Salary, double bonus){
        super(name, Salary);
        this.bonus = bonus;
    }

    @Override
    public double calculateAnnualSalary(){
        return (salary * 12) + bonus;

    }

}

class PartTimeEmployee extends Employee{
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, int hoursWorked, double hourlyRate){
        super(name,0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateAnnualSalary(){
        return hoursWorked * hourlyRate * 52;

    }
}

class EmployeeDemo{
    public static void main(String[] args){
        FullTimeEmployee fullTime = new FullTimeEmployee("Emmanuel",4000, 10000);
        PartTimeEmployee partTime = new PartTimeEmployee("Sharon",15, 20);

        System.out.println("FULL-TIME EMPLOYEE:");
        System.out.println("Name: " + fullTime.getName());
        System.out.println("Monthly Salary: $" + 4000);
        System.out.println("Annual Bonus: $" + 10000);
        System.out.println("Annual Salary: $" + fullTime.calculateAnnualSalary());

        System.out.println("\nPART-TIME EMPLOYEE:");
        System.out.println("Name: " + partTime.getName());
        System.out.println("Hours per week: " + 20);
        System.out.println("Hourly Rate: " + 15);
        System.out.println("Annual Salary: $" + partTime.calculateAnnualSalary());
        
        System.out.println("\n=== SALARY DIFFERENCE ===");
        System.out.println(fullTime.getName() + " earns: $" + fullTime.calculateAnnualSalary() + " per year");
        System.out.println(partTime.getName() + " earns: $" + partTime.calculateAnnualSalary() + " per year");
        System.out.println("Difference: $" + (fullTime.calculateAnnualSalary() - partTime.calculateAnnualSalary()));

    }
}
