package com.company;

public class Trapezoid {
    private int lenghtA;
    private int lenghtB;
    private int height;

    public Trapezoid(int lenghtA, int lenghtB, int height) {
        this.lenghtA = lenghtA;
        this.lenghtB = lenghtB;
        this.height = height;
    }
    int getArea(){
        return (lenghtA + lenghtB) / 2 * height;
    }
}
