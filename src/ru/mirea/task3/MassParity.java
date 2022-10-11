package ru.mirea.task3;

import java.util.Random;
import java.util.Scanner;

public class MassParity
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        boolean fl = true;
        int n;
        while(true)
        {
            try
            {
                System.out.println("введите размер массива");
                n = sc.nextInt();
                break;
            }
            catch(Exception e)
            {
                System.out.println("Повторите ввод");
                sc.next();
            }
        }
        int[] mass = new int[n];
        int count = 0;
        for(int i = 0; i < n; i++)
        {
            Random random = new Random();
            mass[i] = random.nextInt(n);
            if(mass[i]%2==0)
            {count++;}
            System.out.println(mass[i]+" ");
        }
        int[] parity = new int[count];
        int j = 0;
        for(int i = 0; i < n; i++)
        {
            if(mass[i]%2==0)
            {
                parity[j] = mass[i];
                j++;
            }
        }
        System.out.println("массив четных чисел");
        for(int i = 0; i < count; i++)
        {
            System.out.println(parity[i]);
        }
    }
}
