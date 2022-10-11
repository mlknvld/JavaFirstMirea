package ru.mirea.task3;

import java.util.Scanner;

public class Report
{

    static public void generateReport(Employee[] e)
    {
        String str = "";
        System.out.println();
        for(int i = 0; i < e.length; i++)
        {
           str = String.format("%15s%15.2f", e[i].getSalary());
           System.out.printf("%.2f", str);
        }
    }

        public static void main(String[] args)
        {
            System.out.println("Введите количество сотрудников");
            Scanner sc = new Scanner(System.in);
            int count = sc.nextInt();
            Employee[] empls = new Employee[count];
            String fn="";
            int s = 0;
            Employee e = new Employee();
            for(int i =0; i < count; i++)
            {
                System.out.println("Введите полное фио");
                fn = sc.next();
                System.out.println("Введите зарплату");
                s = sc.nextInt();
                e = new Employee(fn, s);
                empls[i] = e;
            }
            generateReport(empls);
        }
}
