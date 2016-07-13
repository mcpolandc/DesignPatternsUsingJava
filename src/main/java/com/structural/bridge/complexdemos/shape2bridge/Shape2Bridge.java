package com.structural.bridge.complexdemos.shape2bridge;

import com.structural.bridge.complexdemos.shape2bridge.colors.Blue;
import com.structural.bridge.complexdemos.shape2bridge.colors.Color;
import com.structural.bridge.complexdemos.shape2bridge.colors.Red;
import com.structural.bridge.complexdemos.shape2bridge.shapes.Circle;
import com.structural.bridge.complexdemos.shape2bridge.shapes.Shape;
import com.structural.bridge.complexdemos.shape2bridge.shapes.Square;


/*
*
*   In our previous example we saw that we had a problem in that our shapes and colors were completely coupled meaning
*   that every time we wanted a new colour, we needed a new Shape class with that colour
*
*   Now with the introduction of the concept of Composition we have separated our concerns. We now pass a Color object as
*   a constructor argument of a Shape.
*
*   This now means that any new Color that we want, the Shape classes are unaffected.
*
*   Similarly, any new Shape that we want, the Color classes are unaffected.
*
* */

public class Shape2Bridge {

    public static void main(String[] args) {

        Color blue = new Blue();
        Shape square = new Square(blue);

        Color red = new Red();
        Shape circle = new Circle(red);

        square.applyColor();
        circle.applyColor();
    }
}
