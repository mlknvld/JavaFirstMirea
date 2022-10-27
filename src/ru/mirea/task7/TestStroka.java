package ru.mirea.task7;

import java.util.Scanner;

interface TestStroka
{
    public static void main(String[] args)
    {
        System.out.println("Введите строку");
        Scanner sc = new Scanner(System.in);
        Stroka str = new Stroka(sc.next());
        System.out.println("Количество символов в строке " + str.count());
        System.out.println("Символы на нечетных местах в строке " + str.str());
        System.out.println("Инвертировали строку " + str.invert());
    }
}
