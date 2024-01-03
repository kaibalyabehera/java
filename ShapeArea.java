abstract class Shape {
        abstract double calculateArea();
    }
    
    class Circle extends Shape {
        private double radius;
    
        public Circle(double radius) {
            this.radius = radius;
        }
    
        @Override
        double  calculateArea() {
            return Math.PI * radius * radius;
        }
    }
    
    class Rectangle extends Shape {
        private double width;
        private double height;
    
        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }
    
        @Override
        double calculateArea() {
            return width * height;
        }
    }
    
    public class ShapeArea{
        public static void main(String[] args) {
            Circle circle = new Circle (5.0);
            Rectangle rectangle = new Rectangle(4.0, 6.0);
    
            double circleArea = circle.calculateArea();
            double rectangleArea = rectangle.calculateArea();
    
            System.out.println("Area of the Circle: " + circleArea);
            System.out.println("Area of the Rectangle: " + rectangleArea);
        }
    }
    
//OUTPUT-------------
//Area of the Circle: 78.53981633974483
//Area of the Rectangle: 24.0