package ru.mirea.task8;

import java.util.Scanner;

public class NumberLeftRight
{
    public static int recursion(int N, int temp)
    {
        if(N==0)
        {
            if(temp<10)
            {
                System.out.print(temp+" ");
                return 0;
            }
            System.out.print(temp%10+" ");
            recursion(N,temp/10);
            return 0;
        }
        temp = temp+N%10;
        if(N>10)
        {
            temp *=10;
        }
        recursion(N/10, temp);
        return 0;
    }
    public static void main(String[] args)
    {
        System.out.println("Введите натуральное число N");
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int temp = 0;
        recursion(N, temp);
    }
}
