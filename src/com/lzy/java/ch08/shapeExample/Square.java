package com.lzy.java.ch08.shapeExample;

/**
 * @Author mbh
 * @Date 2020/4/16
 * @Desc Class square
 */
public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Square.erase()");
    }

    @Override
    public void move() {
        System.out.println("Square.move()");
    }
}
