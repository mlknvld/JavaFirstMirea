package ru.mirea.task2;

import java.util.Scanner;

public class TestDog
{
    public void add(Dog dog1, int i)
    {
        mass[i] = dog1;
    }
    static Dog[] mass;
    public static void main(String[] args)
    {
        System.out.println("Введите количество собак");
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        int age;
        String name;
        mass = new Dog[count];
        for(int i = 0; i<count; i++)
        {
            System.out.println("Введите имя " + (i+1) + " собаки");
            name = input.next();
            System.out.println("Введите возраст " + (i+1) + " собаки");
            age = input.nextInt();
            Dog dog1 = new Dog(name, age);
            mass[i] = dog1;
            System.out.println(dog1.ToString());
        }
    }
}
