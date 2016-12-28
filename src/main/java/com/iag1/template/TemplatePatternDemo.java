package com.iag1.template;

/**
 * In Template pattern, an abstract class exposes defined way(s)/template(s) to execute its methods. Its subclasses
 * can override the method implementation as per need but the invocation is to be in the same way as defined by an
 * abstract class. This pattern comes under behavior pattern category.
 * <p>
 * Implementation
 * We are going to create a Game abstract class defining operations with a template method set to be final so that
 * it cannot be overridden. Cricket and Football are concrete classes that extend Game and override its methods.
 * <p>
 * TemplatePatternDemo, our demo class, will use Game to demonstrate use of template pattern.
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}