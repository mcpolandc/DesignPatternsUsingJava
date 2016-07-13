package com.structural.bridge.complexdemos.shape1nobridge;

import com.structural.bridge.complexdemos.shape1nobridge.shapes.BlueCircle;
import com.structural.bridge.complexdemos.shape1nobridge.shapes.Circle;
import com.structural.bridge.complexdemos.shape1nobridge.shapes.RedSquare;
import com.structural.bridge.complexdemos.shape1nobridge.shapes.Square;

/*
*
*   This example instantiates some shapes
*
*   Some inheritance is used here in that the circles and squares extend a base shape
*
*   This is obviously not scalable as each time we want a new type or colour of shape we need to create new classes
*
*   We will solve this problem using a bridge over the next few examples
*
* */

public class Shape1NoBridge {

    public static void main(String [] args) {

        Circle circle = new BlueCircle();
        Square square = new RedSquare();

        circle.applyColour();
        square.applyColour();

    }
}
