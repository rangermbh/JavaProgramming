package com.lzy.java.ch08.shapeExample;

/**
 * @Author mbh
 * @Date 2020/4/16
 * @Desc
 */
public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Circle.erase()");
    }

    @Override
    protected void setColor() {
        System.out.println("Circle.setColor()");
    }
}
