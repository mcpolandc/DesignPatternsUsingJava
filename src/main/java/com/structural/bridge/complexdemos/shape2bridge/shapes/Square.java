package com.structural.bridge.complexdemos.shape2bridge.shapes;

import com.structural.bridge.complexdemos.shape2bridge.colors.Color;

public class Square extends Shape {

    public Square(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        color.applyColor();
    }
}
