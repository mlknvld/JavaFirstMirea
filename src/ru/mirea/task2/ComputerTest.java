package ru.mirea.task2;
import java.util.Scanner;
import java.util.Scanner;

public class ComputerTest
{
    public static void main(String[] args)
    {

        System.out.println("Введите количество компьютеров");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String name="";
        Shop shop = new Shop(n);
        for(int i = 0; i<n; i++)
        {
            System.out.println("Введите название компьютера");
            name = sc.next();
            shop.add(name, i);
        }
        for(int i = 0; i<n; i++)
        {
            System.out.println(shop.computers[i]);
        }
        System.out.println("Введите название компьютера, который хотите удалить");
        name = sc.next();
        shop.delete(name);
        for(int i = 0; i<n; i++)
        {
            System.out.println(shop.computers[i]);
        }
        System.out.println("Введите название компьютера, который хотите найти");
        name = sc.next();
        boolean p = shop.poisk(name);
        if(p==true)
        { System.out.println("Компьютер найден");}
        else { System.out.println("Компьютер не найден");}
    }
}
