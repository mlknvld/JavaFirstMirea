package ru.mirea.task4;

import java.awt.*;

public class Circle extends Shape
{
    private double radius;
    public Circle() {}
    public Circle(double radius) {this.radius = radius;}
    public Circle(String color, boolean filled, double radius)
    {
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    @Override
    public String getType() {return "Фигура: круг";}

    @Override
    public double getArea() {return 3.14*radius*radius;}

    @Override
    public double getPerimetr() {return 2*3.14*radius;}

    @Override
    public String toString() {return "Круг: \n"+"радиус: "+ radius+"\n длина окружности: "+
            getPerimetr() + "\n площадь: " +  getArea();}
}
