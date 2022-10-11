package ru.mirea.task2;
import java.util.Scanner;
public class TestAuthor
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите имя:");
        String name = scan.nextLine();
        System.out.println("введите почту:");
        String email = scan.nextLine();
        System.out.println("введите пол:");
        char gender = scan.next().charAt(0);
        Author author = new Author(name, email, gender);
        author.setEmail(email);
        System.out.println("имя: " + author.getName());
        System.out.println("почта: " + author.getEmail());
        System.out.println("пол: " + author.toString());
    }
}
