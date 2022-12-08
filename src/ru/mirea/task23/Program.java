package ru.mirea.task23;

import java.util.Scanner;

public class Program
{
    /// <summary>
    /// точка входа в программу
    /// </summary>
    static ArrayQueue q = new ArrayQueue();
    static void Add(String[] args)
    {
        if(args.length < 2)
        {
            Ussage();
            return;
        }
        for(int i = 1; i < args.length; i++)
        {
            q.enqueue(Integer.valueOf(args[i]));
            System.out.println("Added element: " + Integer.valueOf(args[i]));
        }
    }
    static void Dell(String[] args)
    {
        if (args.length < 2)
        {
            Ussage();
            return;
        }
        for(int i = 0; i<Double.valueOf(args[1]); i++)
        {
            System.out.println("Deleted element: " + q.dequeue());
        }
    }
    static void El(String[] args)
    {
        System.out.println("First element: " + q.element());
    }
    static void Clr()
    {
        q.clear();
        System.out.println("Cleared");
    }
    static void Ussage()
    {
        System.out.println("Ussage:");
        System.out.println("-----------------------------:-------------------");
        System.out.println("-A <element1> <element2> ... : Add elements      ");
        System.out.println("-D <Number or elements>      : Delete elements   ");
        System.out.println("-E                           : Show first element");
        System.out.println("-C                           : Clear Queue       ");
        System.out.println("q                            : Exit              ");
        System.out.println("-----------------------------:-------------------");
    }

    static void Main(String[] args)
    {
        System.out.println("Queue program.");
        String cmd = "";
        Scanner sc = new Scanner(System.in);
        do
        {
            cmd = sc.nextLine();
            args = cmd.split(" ");
            switch (args[0])
            {
                case "-A": Add(args);
                    break;
                case "-D":
                    Dell(args);
                    break;
                case "-E":
                    El(args);
                    break;
                case "-C":
                    Clr();
                    break;
                default: Ussage();
                    break;
            }
        } while (cmd != "q");
    }
}