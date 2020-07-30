package com.company;

public class Trapezoid {
    private int lenghtA;
    private int lenghtB;
    private int height;
    private int widthA;
    private int widthB;

    public Trapezoid(int lenghtA, int lenghtB, int height, int widthA, int widthB) {
        this.lenghtA = lenghtA;
        this.lenghtB = lenghtB;
        this.height = height;
        this.widthA = widthA;
        this.widthB = widthB;
    }

    public int getArea(){
        return (lenghtA + lenghtB) / 2 * height;
    }

    public int getPerimetr (){
        return lenghtA + lenghtB + widthA + widthB;
    }
}
