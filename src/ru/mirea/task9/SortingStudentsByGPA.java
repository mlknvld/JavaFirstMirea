package ru.mirea.task9;

import java.util.Scanner;

public class SortingStudentsByGPA
{
    private double points;
    private String name;

    public SortingStudentsByGPA(double points, String name) {this.points = points; this.name = name;}
    public void setPoints(double points) {this.points = points;}
    public double getPoints() {return points;}

    public String getName() {
        return name;
    }

    public static void quickSort(SortingStudentsByGPA[] array, int low, int high)
    {
        if (array.length == 0)
            return;

        if (low >= high)
            return;


        int middle = low + (high - low) / 2;
        double opora = array[middle].getPoints();


        int i = low, j = high;
        while (i <= j) {
            while (array[i].getPoints() < opora) {
                i++;
            }

            while (array[j].getPoints() > opora) {
                j--;
            }

            if ( i<=j) {
                SortingStudentsByGPA temp = array[i];
                array[i] = array[j];
                array[j]  = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }


}
