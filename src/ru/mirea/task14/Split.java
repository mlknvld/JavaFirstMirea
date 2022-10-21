package ru.mirea.task14;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Split
{
    public static void main(String args[])
    {
        Split test = new Split();
        System.out.println("введите строку:");
        Scanner sc = new Scanner(System.in);
        String toParse = sc.next();
        System.out.println("введите разделитель:");
        String del = sc.next();
        StringTokenizer st = new StringTokenizer(toParse,del);
        while(st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }
    }
}
