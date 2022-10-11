package ru.mirea.task3;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class MassFloatRand
{
    public static void main(String[] args)
    {
        System.out.println("Введите размерность массива");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double num[] = new double[n];
        System.out.println("Неотсортированный массив");
        for(int i = 0; i< n; i++)
        {
            num[i] = (Math.random() *20);
            System.out.println(num[i]);
        }
        System.out.println("Отсортированный массив");
        Arrays.sort(num);
        for(int i = 0; i< n; i++)
        {
            System.out.println(num[i]);
        }
        System.out.println("Неотсортированный массив");
        for(int i = 0; i<n; i++)
        {
            Random random = new Random();
            num[i] = random.nextDouble(10);
            System.out.println(num[i]);
        }
        System.out.println("Отсортированный массив");
        Arrays.sort(num);
        for(int i = 0; i< n; i++)
        {

            System.out.println(num[i]);
        }
    }
}
