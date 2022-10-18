package ru.mirea.task6;

public class Monitor implements Computer
{
    private double diagonal;
    private int[] matrix_resolution;
    private int[] ratio_sides;
    public Monitor()
    {}
    public Monitor(double diagonal, int[] matrix_resolution, int[] ratio_sides)
    {
        this.diagonal = diagonal;
        this.matrix_resolution = matrix_resolution;
        this.ratio_sides = ratio_sides;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public void setMatrix_resolution(int[] matrix_resolution) {
        this.matrix_resolution = matrix_resolution;
    }

    public void setRatio_sides(int[] ratio_sides) {
        this.ratio_sides = ratio_sides;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public int[] getMatrix_resolution() {
        return matrix_resolution;
    }

    public int[] getRatio_sides() {
        return ratio_sides;
    }

    public String toStringMonitor()
    {
        return "\n Характеристики монитора: \n соотношение сторон: "+ratio_sides[0]
                +" : "+ratio_sides[1] +"\n разрешение: "+matrix_resolution[0]
                +" : "+matrix_resolution[1]+ "\n диагональ: "+diagonal;
    }
}
