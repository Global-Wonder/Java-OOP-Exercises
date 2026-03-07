public abstract class Shape{
    String color;

    abstract double calculateArea();

    public void displayColor(){
        System.out.println("Color: " + color);
    }

}   

class Circle extends Shape{
    double radius;

    Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    @Override
    double calculateArea(){
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape{
    double width, height;

    Rectangle(double width, double height, String color){
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    double calculateArea(){
        return width * height;
    }

}

class ShapeDemo{
    public static void main(String[] args) {
        Shape shape1 = new Circle(5, "Red");
        Shape shape2 = new Rectangle(4,6,"Blue");

        System.out.println("Circle area: " + shape1.calculateArea());
        System.out.println("Rectangle area: " + shape2.calculateArea());

        shape1.displayColor();
        shape2.displayColor();
    }
}