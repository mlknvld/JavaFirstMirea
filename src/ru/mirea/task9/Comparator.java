package ru.mirea.task9;

import java.util.Scanner;

public interface Comparator
{
    public static void main(String[] args)
    {
        System.out.println("введите количество учеников");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        double point;
        String name;
        SortingStudentsByGPA[] mass = new SortingStudentsByGPA[count];
        for (int i = 0; i < count; i++)
        {
            System.out.println("введите имя");
            name = sc.next();
            System.out.println("введите баллы");
            point = sc.nextDouble();
            mass[i] = new SortingStudentsByGPA(point, name);
        }
        mass[0].quickSort(mass, 0, mass.length-1);
        for(int i = count-1; i>=0; i--)
        {
            System.out.println("баллы: "+mass[i].getPoints() +" имя: "+ mass[i].getName());
        }
    }
}
