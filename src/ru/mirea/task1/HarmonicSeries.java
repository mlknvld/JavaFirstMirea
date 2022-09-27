package ru.mirea.task1;

public class HarmonicSeries
{
    public static void main(String[] args)
    {
        double num[] = new double[10];
        for(int i = 0; i< 10; i++)
        {
            num[i] = 1.0/(i+1);
            System.out.printf("%.2f", num[i] );
            System.out.printf("   ");
        }
    }
}
