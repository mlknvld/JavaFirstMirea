package ru.mirea.task2;
import java.util.Scanner;
public class CircleTest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double x, y, r;
        System.out.println("Введите координату х центра первой окружности");
        x = sc.nextDouble();
        System.out.println("Введите координату у центра первой окружности");
        y = sc.nextDouble();
        System.out.println("Введите радиус первой окружности");
        r = sc.nextDouble();
        Circle c1 = new Circle(x, y, r);
        System.out.println("Площадь 1 окружности: ");
        System.out.printf("%.2f", c1.square());
        System.out.println();
        System.out.printf("Длина 1 окружности: ");
        System.out.printf("%.2f", c1.length());
        System.out.println();
        System.out.println("Введите координату х центра второй окружности");
        x = sc.nextDouble();
        System.out.println("Введите координату у центра второй окружности");
        y = sc.nextDouble();
        System.out.println("Введите радиус второй окружности");
        r = sc.nextDouble();
        Circle c2 = new Circle(x, y, r);
        System.out.println("Площадь 2 окружности: ");
        System.out.printf("%.2f", c2.square());
        System.out.println();
        System.out.printf("Длина 2 окружности: ");
        System.out.printf("%.2f", c2.length());
        System.out.println(c1.sravnenie(c2));
    }
}
