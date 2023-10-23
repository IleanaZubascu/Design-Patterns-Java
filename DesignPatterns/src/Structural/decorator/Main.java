package Structural.decorator;


public class Main {
    public static void main(String[] args)
    {
        // Creating an object of Shape interface
        // inside the main() method
        Shape circle = new Circle();

        Shape redCircle
                = new RedShapeDecorator(new Circle());

        Shape redRectangle
                = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");

        circle.draw();

        System.out.println("\nCircle of red border");

        redCircle.draw();

        System.out.println("\nRectangle of red border");

        redRectangle.draw();
    }
}
