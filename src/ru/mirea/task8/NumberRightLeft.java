package ru.mirea.task8;

import java.util.Scanner;

public class NumberRightLeft
{
    static public int vyvod(int N)
    {
        if(N<10)
        {
            System.out.print(N+" ");
            return N;
        }
        System.out.print(N%10+" ");
        vyvod(N/10);
        return 0;
    }

    public static void main(String[] args)
    {
        System.out.println("Введите натуральное число N");
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        vyvod(N);
    }
}
