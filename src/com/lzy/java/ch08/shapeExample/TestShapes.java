package com.lzy.java.ch08.shapeExample;

import com.lzy.java.ch08.Util;

/**
 * @Author mbh
 * @Date 2020/4/16
 * @Desc To test polymorphism in shape examples
 */
public class TestShapes {

    public static void main(String[] args) {
        Util util = new Util();
        Shape[] sarr = new Shape[9];
        // Random upcasting
        for (int i = 0; i < sarr.length; i++) {
            sarr[i] = util.next();
        }
        for (Shape shape : sarr) {
            shape.setColor();
//            shape.move();
        }
    }
}
