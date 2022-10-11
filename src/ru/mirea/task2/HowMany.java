package ru.mirea.task2;
import java.util.Scanner;
public class HowMany
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите в строку слова");
        String words = sc.nextLine();
        int count = 0;
        if(words.length()!=0)
        {
            for(int i = 0; i < words.length(); i++)
            {
                if(words.charAt(i) == ' ')
                {
                    count++;
                }
            }
            count++;
        }
        System.out.println("Вы ввели " + count + " слов");
    }
}
