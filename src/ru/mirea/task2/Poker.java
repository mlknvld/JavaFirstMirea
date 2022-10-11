package ru.mirea.task2;
import java.util.Random;
import java.util.Scanner;
public class Poker
{
    public static void main(String[] args)
    {
        String[] value = new String[]{"2","3","4","5","6","7","8","9","10","J","Q","К","A"};
        String[] mast = new String[]{"(пики)","(черви)","(бубны)","(трефы)"};
        String[] coloda = new String[52];
        int count = 0;
        for(int i = 0; i<mast.length; i++)
        {
            for (int j = 0; j<value.length; j++ )
            {
                coloda[count] = mast[i]+value[j];
                count++;
            }
        }


        System.out.println("Введите количество игроков");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rnd;

        for(int i  = 0; i < n; i++)
        {
            System.out.println("");
            for (int j = 0; j< 5; j++)
            {
                do
                {
                    rnd = new Random().nextInt(51);
                }
                while(coloda[rnd]=="");
                System.out.print(coloda[rnd]+"  ");
                coloda[rnd] = "";
            }
            System.out.println("");
        }
    }
}
