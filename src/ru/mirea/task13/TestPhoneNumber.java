package ru.mirea.task13;

import java.util.Scanner;

public class TestPhoneNumber
{
    public static void main(String[] args)
    {
        System.out.println("Введите номер телефона");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        PhoneNumber number = new PhoneNumber(str);
        number.convertphone();
        System.out.println("Номер телефона в новом формате: "+number.getPhone());
    }
}
