package com.company;

public class Box {
    double widht;
    double heigth;
    double depth;

    Box(double width, double heigth, double depth) {
        this.widht = width;
        this.heigth = heigth;
        this.depth = depth;
    }

    double volume() {
        return widht * heigth * depth;
    }

    void foo() {
        System.out.println(this.volume());
    }

    void setDim(double w, double h, double d) {
        widht = w;
        heigth = h;
        depth = d;

    }

}
