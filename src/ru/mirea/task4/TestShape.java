package ru.mirea.task4;

import java.util.Scanner;

public class TestShape
{
    public static void main(String[] args)
    {
        System.out.println("Введите название фигуры c маленькой буквы:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        switch(str)
        {
            case "круг":
                System.out.println("Введите радиус круга:");
                double r = sc.nextDouble();
                Circle с2 = new Circle(r);
                System.out.println("Площадь круга: "+с2.getArea());
                System.out.println("Длина окружности: "+с2.getPerimetr());
                System.out.println(с2.toString());
                break;
            case "квадрат":
                System.out.println("Введите сторону квадрата:");
                double c1 = sc.nextDouble();
                Square sq = new Square(c1);
                System.out.println("Площадь квадрата: "+sq.getArea());
                System.out.println("Периметр квадрата: "+sq.getPerimetr());
                System.out.println(sq.toString());
                break;
            case "прямоугольник":
                System.out.println("Введите 1 сторону прямоугольника:");
                double a = sc.nextDouble();
                System.out.println("Введите 2  сторону прямоугольника:");
                double b = sc.nextDouble();
                Rectangle rect = new Rectangle(a, b);
                System.out.println("Площадь прямоугольника: "+rect.getArea());
                System.out.println("Периметр прямоугольника: "+rect.getPerimetr());
                System.out.println(rect.toString());
                break;
            default:
                System.out.println("Вы ввели неверное название");
                break;
        }
    }
}
