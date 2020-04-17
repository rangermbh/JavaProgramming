package com.lzy.java.ch08.shapeExample;

/**
 * @Author mbh
 * @Date 2020/4/16
 * @Desc Class triangle
 */
public class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Triangle.draw()");
    }

    @Override
    public void erase() {
        System.out.println(("Triangle.erase()"));
    }
}
