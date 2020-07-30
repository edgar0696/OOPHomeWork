package com.company;

public class Main {

    public static void main(String[] args) {
     //Вычисление площи и периметра Трапеции!
        // Формула S = (a+b)/2*h and P = a + b + c + d

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
        System.out.println();

// Почему при изменении t2.setLenghtB(15) - площа при выводе остается не изменной System.out.println(t2.getArea());
        System.out.println("↓(Change trapezoid properties)↓");
        t2.setLenghtA(20);
        System.out.println("Trapezium area = " + t2.getArea());
        t2.setLenghtB(15);
        System.out.println("lenghtB = " + t2.getLenghtB());

        System.out.println();
        System.out.println("                   ↓-----Выводим данные через toString-----↓");
        System.out.println(t2.toString());

        Trapezoid t3 = new Trapezoid();
        t3.setLenghtA(8);
        t3.setLenghtB(9);
        t3.setHeight(10);
        t3.setWidthA(11);
        t3.setWidthB(12);
        System.out.println(t3.toString());
        System.out.println("                          ↑----Пустой Конструктор---↑");

    }
}
