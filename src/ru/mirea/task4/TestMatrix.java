package ru.mirea.task4;

import java.util.Scanner;

public class TestMatrix
{
    public static Matrix creation()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество строк");
        int n  = sc.nextInt();
        System.out.println("Введите количество столбцов");
        int m = sc.nextInt();
        float[][] matr = new float[n][m];
        for(int i = 0; i < n; i++)
        {
            System.out.println("Введите элементы строки");
            for(int j = 0; j<m; j++)
            {
                matr[i][j] = sc.nextFloat();
            }
        }
        Matrix object = new Matrix(matr, n, m);
        return object;
    }



    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Matrix matrix1 = creation();
        System.out.println("Исходная матрица: ");
        matrix1.printMatrix();
        System.out.println("Введите данные для второй матрицы: ");
        Matrix matrix2 = creation();
        System.out.println("Вторая матрица: ");
        matrix2.printMatrix();
        if(matrix1.getLine()== matrix2.getLine() && matrix1.getColumn()==matrix2.getColumn())
        {
            System.out.println("Результат сложения матриц: ");
            matrix1.summary(matrix2).printMatrix();
        }
        else {System.out.println("Невозможно произвести сложение матриц");}
        System.out.println("Введите число, на которое хотите умножить исходную матрицу");
        float number = sc.nextFloat();
        matrix1.proizvedenie(number).printMatrix();
    }
}
