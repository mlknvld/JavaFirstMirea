package ru.mirea.task20;

public class Test_Calculable
{
    public static void main(String[] args)
    {
        Calculable<Double> calc = new Calculable<>();
        System.out.println("numbers " + 5.8 + "  " + 7.9);
        System.out.println("sum " + calc.sum(5.8, 7.9));
        System.out.println("multiply " +calc.multiply(5.8, 7.9));
        System.out.println("subtraction " +calc.subtraction(5.8, 7.9));
        System.out.println("divide " +calc.divide(5.8, 7.9));
    }
}
