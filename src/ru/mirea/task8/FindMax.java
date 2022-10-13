package ru.mirea.task8;

import java.util.Scanner;
public class FindMax
{
    public static int findmax()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0)
        {
            return 0;
        }
        else
        {
            return Math.max(n, findmax());
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Максимум "+findmax());
    }
}
