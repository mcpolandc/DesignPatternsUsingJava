package com.structural.bridge.complexdemos.shape2bridge.shapes;

import com.structural.bridge.complexdemos.shape2bridge.colors.Color;

public abstract class Shape {

    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract public void applyColor();
}
