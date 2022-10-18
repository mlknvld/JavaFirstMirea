package ru.mirea.task4;

import java.util.Scanner;

public class TestPhone
{
    public static Phone creation()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер телефона");
        int n = sc.nextInt();
        System.out.println("Введите модель телефона");
        String s = sc.next();
        System.out.println("Введите вес телефона");
        int w = sc.nextInt();
        Phone p  = new Phone(n, s, w);
        return p;
    }

    public static void vyvod(Phone p)
    {
        System.out.println();
        System.out.println("Модель телефона " + p.getModel());
        System.out.println("Номер телефона " + p.getNumber());
        System.out.println("Вес телефона " + p.getWeight());
        System.out.println();
    }

    public static void ring(Phone p)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя звонящего: ");
        String nam = sc.nextLine();
        System.out.println("Введите номер звонящего: ");
        int number = sc.nextInt();
        System.out.println("Вызов метода receiveCall с 1 параметром: ");
        p.receiveCall(nam);
        System.out.println("Вызов метода receiveCall с 2 параметрами: ");
        p.receiveCall(nam, number);
    }
    public static void main(String[] args)
    {
        Phone p1 = creation();
        Phone p2 = creation();
        Phone p3 = creation();
        vyvod(p1);
        vyvod(p2);
        vyvod(p3);
        ring(p1);
        ring(p2);
        ring(p3);
        int[] u = {p1.getNumber(), p2.getNumber(), p3.getNumber()};
        p1.sendMessage(u);
    }
}
