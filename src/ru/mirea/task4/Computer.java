package ru.mirea.task4;

import ru.mirea.task5.RandomShape;

import java.util.Random;
import java.util.Scanner;

public class Computer
{
    public enum Marks
    {ACER, APPLE, ASUS, INTEL, LENOVO}

    public static void main(String[] args)
    {
        Marks computer = Marks.APPLE;;
        Random rnd = new Random();
        int n = rnd.nextInt(5);
        switch (n)
        {
            case 0:
                computer = Marks.ACER;
                break;
            case 1:
                computer = Marks.APPLE;
                break;
            case 2:
                computer = Marks.ASUS;
                break;
            case 3:
                computer  = Marks.INTEL;
                break;
            case 4:
                computer = Marks.LENOVO;
                break;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите характеристики для памяти компьютера:");
        System.out.println("Время доступа ");
        int time_access = sc.nextInt();
        System.out.println("Объём ");
        int capacity = sc.nextInt();
        Memory memory = new Memory(time_access, capacity);
        System.out.println("Введите характеристики для монитора компьютера:");
        System.out.println("Диагональ ");
        double diagonal = sc.nextDouble();
        System.out.println("Разрешение ");
        int[] matrix_resolution = new int[2];
        System.out.println("1 - ");
        matrix_resolution[0] = sc.nextInt();
        System.out.println("2 - ");
        matrix_resolution[1] = sc.nextInt();
        System.out.println("Соотношение сторон ");
        int[] ratio_sides = new int[2];
        System.out.println("1 - ");
        ratio_sides[0] = sc.nextInt();
        System.out.println("2 - ");
        ratio_sides[1] = sc.nextInt();
        Monitor monitor = new Monitor(diagonal, matrix_resolution, ratio_sides);
        System.out.println("Введите характеристики для процессора компьютера:");
        System.out.println("Частота ");
        int frequency = sc.nextInt();
        System.out.println("Кэш-память ");
        int cash_memory = sc.nextInt();
        System.out.println("Разрядность ");
        int bit_depth = sc.nextInt();
        Processor processor = new Processor(frequency, cash_memory, bit_depth);
        System.out.println("Марка компьютера: "+computer);
        System.out.println(memory.toStringMemory());
        System.out.println(monitor.toStringMonitor());
        System.out.println(processor.toStringProcessor());
    }
}
