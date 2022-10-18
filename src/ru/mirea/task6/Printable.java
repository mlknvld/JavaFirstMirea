package ru.mirea.task6;

import java.util.Scanner;

public interface Printable
{
    void print();

    public static void main(String[] args)
    {
        System.out.println("Введите количество печатной продукции:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Printable[] mass = new Printable[n];
        String name;
        for(int i = 0; i< n; i++)
        {
            System.out.println("Введите название книги/журнала:");
            name = sc.next();
            mass[i] = new Book(name);
        }
        System.out.println("Вывод:");
        for (int i = 0; i < n; i++)
        {
            mass[i].print();
        }
    }
}
