package com.structural.bridge.complexdemos.shape2bridge.shapes;

import com.structural.bridge.complexdemos.shape2bridge.colors.Color;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        color.applyColor();
    }
}
