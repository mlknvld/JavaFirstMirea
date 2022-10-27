package ru.mirea.task7;

import java.util.Scanner;

public interface MathCalculable
{
    public double PI();
    public double stepen(double n);
    public double module(double n);

    public static void main(String[] args)
    {
        System.out.println("Введите действительное число х");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Введите действительное число у");
        int y = sc.nextInt();
        MathFunc numb = new MathFunc(x, y);
        System.out.println("Введите степень");
        int step = sc.nextInt();
        System.out.println("Модуль комплексного числа: "+numb.module());
        System.out.println("Возведение в степень комплексного числа: \n"+numb.stepen(step));
    }

}
