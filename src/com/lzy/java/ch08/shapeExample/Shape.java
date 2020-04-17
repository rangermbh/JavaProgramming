package com.lzy.java.ch08.shapeExample;

/**
 * @Author mbh
 * @Date 2020/4/16
 * @Desc Class shape
 */
public class Shape {
    /**
     * To draw a shape
     */
    public void draw() {
        System.out.println("Shape.draw()");
    }

    /**
     * To erase a shape
     */
    public void erase() {
        System.out.println("Shape.erase()");
    }

    /**
     * To move a Shape
     */
    public void move() {
        System.out.println("Shape.move()");
    }

    /**
     * To set the color of a Shape
     */
    protected void setColor() {
        System.out.println("Shape.setColor()");
    }
}
