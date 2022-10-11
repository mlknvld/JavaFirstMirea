package ru.mirea.task3;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Mass4
{
    public static void main(String[] args)
    {
        int num[] = new int[4];
        for(int i = 0; i < 4 ; i++)
        {
            num[i] = (int)(Math.random() *89 + 10);
            System.out.print(num[i]+" ");
        }
        boolean b = true;
        for (int i = 0; i < 4 ; i++)
        {
            if(num[i]<num[i+1])
            {
                b = true;
            }
            else
            {
                b = false;
                break;
            }
        }
        System.out.println("");
        if(b==true)
        {System.out.println("Последовательность является строго возрастающей");}
        else {System.out.println("Последовательность не является строго возрастающей");}
    }

}
