class Shape {
    public double getArea() {
        return 0.0; // Default implementation for the base class
    }
}

class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Square extends Shape {
    private int length;

    public Square(int length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * length;
    }
}

class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        Square square = new Square(6);
        Rectangle rectangle = new Rectangle(6, 8);

        System.out.println("Area of Circle: " + circle.getArea());
        System.out.println("Area of Square: " + square.getArea());
        System.out.println("Area of Rectangle: " + rectangle.getArea());
    }
}



//--------OUTPUT--------


// Area of Circle: 50.26548245743669
// Area of Square: 36.0   
// Area of Rectangle: 48.0




