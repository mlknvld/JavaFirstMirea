package ru.mirea.task20;

public class Test_MinMax
{
    public static void main(String[] args)
    {
        Integer[] mass1 = new Integer[]{2, 4, 8, 5, 8, 1};
        MinMax<Integer> mass = new MinMax<>(mass1);
        System.out.println("numbers 2, 4, 8, 5, 8, 1");
        System.out.println("max " + mass.max());
        System.out.println("min " +mass.min());
    }
}
