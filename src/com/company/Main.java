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

        System.out.println("");
        System.out.println("                ↓--------------- Constructor class --------------↓");

        Trapezoid t1 = new Trapezoid(11,5,7,8,12);
            int areaT1 = t1.getArea();
        System.out.println("Trapezium area = " + areaT1);

        Trapezoid t2 = new Trapezoid(15,7,12,13,17);
        int areaT2 = t2.getArea();
        System.out.println("Trapezium area = " + areaT2);
        System.out.println("Пример как вывести areaT1 и areaT2 за один раз - " + areaT1 + " and " + areaT2);

        System.out.println();
        System.out.println("                  ↓--------------- Class method --------------↓");
        System.out.println("Perimeter of the trapezoid = " + t2.getPerimetr());


    }
}
