package com.lzy.java.ch08.deepIntoPolymorphism;

/**
 * @Author mbh
 * @Date 2020/4/17
 * @Desc A deep understanding of polymorphism
 */
public class DeepIntoPolymorphism {
    /**
     * Animal take action
     */
    public static void animalAction(Animal animal) {
        animal.cry();
        animal.eat();
    }

    public static void main(String[] args) {
        // TODO: 1.Conditions of polymorphism
        // c1. Do subclasses need to extends superclass?

        // c2. Do we need upcasting？

        // c3. DO we need to override method succeed from superclass?

        // TODO: 2.Do fields of Class show polymorphism?

        Animal animal = new Bird();
        System.out.println(animal.field);
        System.out.println(animal.getField());

        // TODO: 3.Do static fields or static methods show polymorphism? -- only normal method calls show polymorphism

        Animal animal1 = new Bird();
        System.out.println(animal1.staticGet());

        // TODO: 4.What are the disadvantages of polymorphism ？

    }
}

/**
 * Superclass of all animals
 */
class Animal {
    public String field = "Field in Animal";

    /**
     * Return field of class
     *
     * @return field
     */
    public String getField() {
        return field;
    }

    public static String staticGet() {
        return "Static get in animal";
    }

    /**
     * Animal cry
     */
    public void cry() {
        System.out.println("Animal cry!");
    }

    /**
     * Animal eat
     */
    public void eat() {
        System.out.println("Animal eat something");
    }
}

/**
 * Class Cat extends class Animal
 */
class Cat extends Animal {

    @Override
    public void cry() {
        System.out.println("Miao, miao, miao~");
    }

    @Override
    public void eat() {
        System.out.println("Cat eat fish");
    }
}

/**
 * Class Dog extents Animal
 */
class Dog extends Animal {

    @Override
    public void cry() {
        System.out.println("Wang, wang, wang~");
    }

    @Override
    public void eat() {
        System.out.println("Dog eat bone");
    }
}

/**
 * Class Bird
 */
class Bird extends Animal {
    public String field = "Field in Bird";

    @Override
    public String getField() {
        return field;
    }

    public static String staticGet() {
        return "Static get in Bird";
    }

    @Override
    public void cry() {
        System.out.println("Ji, ji, ji~");
    }

}