package com.company;

public class Main {

    public static void main(String[] args) {
     //Вычисление площи Трапеции!
        // Формула S = (a+b)/2*h

        int lenghtA = 11;
        int lenghtB = 5;
        int height = 7;
        int area = (lenghtA + lenghtB) / 2 * height;
        System.out.println("Trapezium area = " + area);

        Trapezoid t1 = new Trapezoid(11,5,7);
            int areaT1 = t1.getArea();
        System.out.println("Trapezium area = " + areaT1);


    }
}
