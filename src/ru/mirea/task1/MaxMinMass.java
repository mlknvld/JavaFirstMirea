package ru.mirea.task1;
import java.util.Scanner;
public class MaxMinMass
{
    public static void main(String[] args)
    {
        System.out.println("введите размерность массива");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        int num[] = new int[n];
        System.out.println("введите элементы массива");
        int i;
        i = 0;
        sum = 0;
        int max = 0;
        int min=0;
        do {
            num[i] = scan.nextInt();
            if(i==0)
            {
                min=num[i];
            }
            if(min>num[i])
            {
                min=num[i];
            }
            if(num[i]>max)
            {
                max = num[i];
            }
            sum = sum + num[i];
            i++;
        } while (i<n);
        System.out.println("Сумма " + sum);
        i = 0;
        sum = 0;
        while(i<n)
        {
            sum = sum+num[i];
            i++;
        }
        System.out.println("Сумма " + sum);
        System.out.println("Минимальный элемент " + min);
        System.out.println("Максимальный элемент " + max);
    }
}
