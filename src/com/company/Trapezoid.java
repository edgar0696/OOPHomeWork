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

    public Trapezoid() {

    }

    public int getLenghtA() {
        return lenghtA;
    }

    public void setLenghtA(int lenghtA) {
        this.lenghtA = lenghtA;
    }

    public int getLenghtB() {
        return lenghtB;
    }

    public void setLenghtB(int lenghtB) {
        this.lenghtB = lenghtB;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidthA() {
        return widthA;
    }

    public void setWidthA(int widthA) {
        this.widthA = widthA;
    }

    public int getWidthB() {
        return widthB;
    }

    public void setWidthB(int widthB) {
        this.widthB = widthB;
    }

    public int getArea(){
        return (lenghtA + lenghtB) / 2 * height;
    }

    public int getPerimetr (){
        return lenghtA + lenghtB + widthA + widthB;
    }

    @Override
    public String toString() {
        return "Trapezoid{" +
                "lenghtA=" + lenghtA +
                ", lenghtB=" + lenghtB +
                ", height=" + height +
                ", widthA=" + widthA +
                ", widthB=" + widthB +
                ", Area=" + getArea() +       // Как при выводе разбить строку что бы продолжение началось с нового рядка??
                ", Perimetr=" + getPerimetr() +
                '}';
    }
}
