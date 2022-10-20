package ru.mirea.task13;

import java.util.Scanner;

public class TestAddress
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Введите 1(разделитель ,) или 2(любой разделитель)");
        int n = sc.nextInt();
        Address address;
        Address[] addresses = new Address[4];
        for(int i = 0; i<4; i++)
        {
            System.out.println("Введите адрес");
            address = new Address(sc.next());
            address.convertaddress(n);
            addresses[i] = address;
        }
        for(int i = 0; i<4; i++)
        {
            addresses[i].print();
        }
    }
}
