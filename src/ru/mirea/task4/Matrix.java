package ru.mirea.task4;

public class Matrix
{
    private float[][] matrix;
    private int line;
    private int column;

    public Matrix() {}
    public Matrix(float[][] matrix, int line, int column)
    {
        this.matrix = matrix;
        this.line = line;
        this.column = column;
    }

    public void setColumn(int column) {this.column = column;}
    public void setMatrix(float[][] matrix) {this.matrix = matrix;}
    public void setLine(int line) {this.line = line;}
    public int getColumn() {return column;}
    public int getLine() {return line;}
    public float[][] getMatrix() {return matrix;}

    public Matrix summary(Matrix matrix2)
    {
        float[][] new_matr = new float[getLine()][getColumn()];
        Matrix new_matrix = new Matrix(new_matr, getLine(), getColumn());
        for(int i = 0; i < new_matrix.getLine(); i++)
        {
            for(int j = 0; j < new_matrix.getLine(); j++)
            {
                new_matr[i][j] = matrix[i][j] + matrix2.getMatrix()[i][j];
            }
        }
        return new_matrix;
    }

    public Matrix proizvedenie(float number)
    {
        System.out.println("Умножение матрицы на число:");
        float[][] new_matr = new float[getLine()][getColumn()];
        Matrix new_matrix = new Matrix(new_matr, getLine(), getColumn());
        for(int i = 0; i < new_matrix.getLine(); i++)
        {
            for(int j = 0; j < new_matrix.getLine(); j++)
            {
                new_matr[i][j] = matrix[i][j] * number;
            }
        }
        return new_matrix;
    }

    public void printMatrix()
    {
        System.out.println();
        for(int i = 0; i < line; i++)
        {
            for(int j = 0; j < column; j++)
            {
                System.out.print(matrix[i][j]+ "  ");
            }
            System.out.println();
        }
    }
}
