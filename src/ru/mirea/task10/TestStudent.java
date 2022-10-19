package ru.mirea.task10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestStudent
{
    public static void main(String[] args)
    {
        System.out.println("Введите количество студентов");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String name, surname, group, specialist;
        int course;
        Student[] students = new Student[count];
        for(int i = 0; i<count; i++)
        {
            System.out.println("Введите имя");
            name = sc.next();
            System.out.println("Введите фамилию");
            surname = sc.next();
            System.out.println("Введите группу");
            group = sc.next();
            System.out.println("Введите курс");
            course = sc.nextInt();
            System.out.println("Введите специальность");
            specialist= sc.next();
            students[i] = new Student(name, surname, group, specialist, course);
        }
        for(int i = 0; i < count; i++)
        {
            System.out.println(i+1+"ый студент:");
            System.out.println("имя: "+ students[i].getName());
            System.out.println("фамилия: "+students[i].getSurname());
            System.out.println("курс: "+students[i].getCourse());
            System.out.println("группа: "+students[i].getGroup());
            System.out.println("специальность: "+students[i].getSpecialist());
            System.out.println("-------------------------------");
        }
        List<String> names = new ArrayList<>();
        List<String> surnames = new ArrayList<>();
        for(int i = 0; i<count; i++)
        {
            names.add(students[i].getName());
            surnames.add(students[i].getSurname());
        }
        List<String> merge = new ArrayList<>();
        for(int i = 0; i<count; i++)
        {
            merge.add(names.get(i));
            merge.add(surnames.get(i));
        }
        for (int i = 0; i<2*count; i++)
        {
            System.out.print(merge.get(i)+"  ");
        }

    }
}
