package ru.mirea.task9;

import java.util.Scanner;

public class TestClass
{
    public static void main(String[] args)
    {
        System.out.println("Введите количество учеников");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int ID;
        Student[] St_mass = new Student[count];
        for (int i = 0; i<count; i++)
        {
            System.out.println("Введите ID ученика");
            ID = sc.nextInt();
            St_mass[i] = new Student();
            St_mass[i].setiDNumber(ID);
        }

        for (int i = 1; i < St_mass.length; i++)
        {
            for (int j = i; j > 0; j--)
            {
                if(St_mass[j].getiDNumber() < St_mass[j-1].getiDNumber())
                {
                    Student temp2 = St_mass[j];
                    St_mass[j] = St_mass[j-1];
                    St_mass[j-1] = temp2;
                }
                else
                {break;}
            }
        }

        for(int i = 0; i < count; i++)
        {
            System.out.println(St_mass[i].getiDNumber());
        }
    }
}
