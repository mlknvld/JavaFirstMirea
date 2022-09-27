package ru.mirea.task1;
import java.util.Scanner;
public class MassSumSrZnach
{
    public static void main(String[] args)
    {
        System.out.println("введите размерность массива");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        int mid = 0;
        int num[] = new int[n];
        System.out.println("введите элементы массива");
        int i;
        for(i = 0; i<n; i++)
        {
            num[i] = scan.nextInt();
            sum = sum + num[i];
            mid = mid+num[i];
        }
        mid = mid/n;
        System.out.println("Сумма " + sum);
        System.out.println("Среднее арифметическое " + mid);
    }
}
