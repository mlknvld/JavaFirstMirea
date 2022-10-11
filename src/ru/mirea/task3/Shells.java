package ru.mirea.task3;

import java.awt.*;
import java.util.Scanner;

public class Shells
{
    public static void main(String[] args)
    {
        System.out.println("введите число");
        Scanner sc = new Scanner(System.in);
        Double f = sc.nextDouble();
        Double d = Double.valueOf(f);
        System.out.println("введите строку");
        String k = sc.next();
        Double d1 = Double.parseDouble(k);
        System.out.println("число в float "+ d.floatValue());
        System.out.println("число в int "+ d.intValue());
        System.out.println("число в byte "+ d.byteValue());
        System.out.println("число в short "+ d.shortValue());
        System.out.println("число в long " + d.longValue());
        System.out.println("перевод в char не возможен");
        System.out.println("перевод в string не возможен");
        System.out.println("Значение double "+ d);
        String d4 = Double.toString(d);
        System.out.println("преобразование литерала "+d4);
    }
}
