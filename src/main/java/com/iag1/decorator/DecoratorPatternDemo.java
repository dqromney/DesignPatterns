package com.iag1.decorator;

/**
 * Decorator pattern allows a user to add new functionality to an existing object without altering its structure.
 * This type of design pattern comes under structural pattern as this pattern acts as a wrapper to existing class.
 * <p>
 * This pattern creates a decorator class which wraps the original class and provides additional functionality
 * keeping class methods signature intact.
 * <p>
 * We are demonstrating the use of decorator pattern via following example in which we will decorate a shape with
 * some color without alter shape class.
 * <p>
 * Implementation
 * We're going to create a Shape interface and concrete classes implementing the Shape interface. We will then create
 * an abstract decorator class ShapeDecorator implementing the Shape interface and having Shape object as its instance
 * variable.
 * <p>
 * RedShapeDecorator is concrete class implementing ShapeDecorator.
 * <p>
 * DecoratorPatternDemo, our demo class will use RedShapeDecorator to decorate Shape objects.
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {

        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
