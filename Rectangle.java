public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double calculateArea(){
        return length * width;
    }

    public double calculatePerimeter(){
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 15);

        System.out.println("Area: " + rectangle.calculateArea() + "cm^2");
        System.out.println("Perimeter is: " + rectangle.calculatePerimeter() + "cm");
    
    }
}
