package com.lzy.java.ch08;

import com.lzy.java.ch08.shapeExample.Circle;
import com.lzy.java.ch08.shapeExample.Shape;
import com.lzy.java.ch08.shapeExample.Square;
import com.lzy.java.ch08.shapeExample.Triangle;

import java.util.Random;

/**
 * @Author mbh
 * @Date 2020/4/16
 * @Desc Util tools
 */
public class Util {
    private Random rand = new Random();
    public Shape next() {
        switch (rand.nextInt(3)) {
            default:
            case 0: return new Triangle();
            case 1: return new Square();
            case 2: return new Circle();
        }
    }

    public static void main(String[] args) {
        Util u = new Util();
        System.out.println(u.rand.nextInt(3));
    }
}
