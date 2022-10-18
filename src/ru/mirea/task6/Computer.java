package ru.mirea.task6;

import ru.mirea.task4.Memory;
import ru.mirea.task4.Monitor;
import ru.mirea.task4.Processor;

import java.util.Random;
import java.util.Scanner;

public interface Computer
{
    public enum Marks
    {ACER, APPLE, ASUS, INTEL, LENOVO}

    public static void main(String[] args)
    {
        System.out.println("Введите количество компьютеров");
        Scanner sc = new Scanner(System.in);
        int count = 0;
        count = sc.nextInt();
        Marks computer = Marks.APPLE;;
        Random rnd = new Random();
        int n;
        Marks[] computers = new Marks[count];
        Monitor[] monitors = new Monitor[count];
        Memory[] memories = new Memory[count];
        Processor[] processors = new Processor[count];
        Shop shop = new Shop(count);
        for(int i = 0; i < count; i++)
        {
            n = rnd.nextInt(5);
            switch (n) {
                case 0 -> computer = Marks.ACER;
                case 1 -> computer = Marks.APPLE;
                case 2 -> computer = Marks.ASUS;
                case 3 -> computer = Marks.INTEL;
                case 4 -> computer = Marks.LENOVO;
            }
            computers[i] = computer;
            shop.add(String.valueOf(computers[i]), i);
            System.out.println("Введите характеристики для памяти компьютера:");
            System.out.println("Время доступа ");
            int time_access = sc.nextInt();
            System.out.println("Объём ");
            int capacity = sc.nextInt();
            memories[i] = new Memory(time_access, capacity);
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
            monitors[i]= new Monitor(diagonal, matrix_resolution, ratio_sides);
            System.out.println("Введите характеристики для процессора компьютера:");
            System.out.println("Частота ");
            int frequency = sc.nextInt();
            System.out.println("Кэш-память ");
            int cash_memory = sc.nextInt();
            System.out.println("Разрядность ");
            int bit_depth = sc.nextInt();
            processors[i] = new Processor(frequency, cash_memory, bit_depth);
        }
        System.out.println("Вывод данных:");
        for (int i = 0; i < count; i++)
        {
            System.out.println("Марка компьютера: "+computers[i]);
            System.out.println(memories[i].toStringMemory());
            System.out.println(monitors[i].toStringMonitor());
            System.out.println(processors[i].toStringProcessor());
            System.out.println();
        }

        String name;
        System.out.println("Введите название компьютера, который хотите удалить");
        name = sc.next();
        shop.delete(name);
        for(int i = 0; i<count; i++)
        {
            System.out.println(shop.toStringShop());
        }
        System.out.println("Введите название компьютера, который хотите найти");
        name = sc.next();
        boolean p = shop.poisk(name);

        if(p==true)
        { System.out.println("Компьютер найден");}
        else { System.out.println("Компьютер не найден");}
    }
}
