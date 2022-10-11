package ru.mirea.task2;
import java.util.Scanner;
public class MassString
{
    public static void main(String[] args)
    {   System.out.println("Введите количество элементов в массиве");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] mass = new String[n];
        System.out.println("Введите элементы в массиве");
        for(int i = 0; i<mass.length; i++)
        {
            mass[i] = sc.next();
        }
        String p="";
        for(int i = 0; i<mass.length/2; i++)
        {
            p=mass[i];
            mass[i] = mass[mass.length-i-1];
            mass[mass.length-i-1] = p;
        }
        for(int i = 0; i<mass.length; i++)
        {
            System.out.print(mass[i]+" ");
        }
    }
}
