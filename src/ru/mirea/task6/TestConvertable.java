package ru.mirea.task6;

import java.util.Scanner;

public class TestConvertable
{
    public static void main(String[] args)
    {
        System.out.println("Введите градусы Цельсия");
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();
        System.out.println("Введите 1 (Кельвин) или 2 (Фаренгейт):");
        int choose = sc.nextInt();
        switch (choose)
        {
            case 1:
                ConvertKelvin obj1 = new ConvertKelvin(temp);
                obj1.convert();
                System.out.println("Температура в Кельвинах: "+obj1.getTemperature());
                break;
            case 2:
                ConvertFarengeit obj2 = new ConvertFarengeit(temp);
                obj2.convert();
                System.out.println("Температура в Фаренгейтах: "+obj2.getTemperature());
                break;
        }
    }
}
