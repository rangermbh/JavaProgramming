package com.lzy.java.ch08.polymorphic;

/**
 * @Author mbh
 * @Date 2020/4/17
 * @Desc Class animal
 */
class Animal {
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

class Polymorphic {

    /**
     * Cat take action
     */
    public static void catAction(Cat cat) {
        // TODO: Let a cat take actions
        cat.cry();
        cat.eat();
    }

    /**
     * Dog take action
     */
    public static void dogAction(Dog dog) {
        // TODO: Let a dog take actions
        dog.cry();
        dog.eat();
    }

    /**
     * Animals take different actions
     */
    public static void animalAction(Animal animal) {
        // TODO: Let animal take actions
        animal.cry();
        animal.eat();
    }

    public static void main(String[] args) {
        // 1.Why we need polymorphic? -- Reuse and decouple

        // TODO: m1:Take action one by one -- Too many codes
//        Cat cat = new Cat();
//        Dog dog = new Dog();
//        cat.cry();
//        dog.cry();

        // TODO: m2:Take action by method -- Too many methods for adding a new subclass
//        catAction(new Cat());
//        dogAction(new Dog());

        // TODO: m3:polymorphic -- Forget about different kinds of subclass, we only need to communication with superclass
        animalAction(new Cat());
        animalAction(new Dog());
    }
}