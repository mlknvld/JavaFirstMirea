package ru.mirea.task1;
import java.util.Scanner;
public class Factorial
{
    public static int fact(int k)
    {
        int result = 1;
        for(int i =1; i<=k; i++)
        {
            result = result * i;
        }
        return result;
    }
    public static void main(String[] args)
    {
        System.out.println("введите число: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int factorial = fact(n);
        System.out.println("факториал этого числа: "+factorial);
    }
}
