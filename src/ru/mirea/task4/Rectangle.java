package ru.mirea.task4;

import java.awt.*;

public class Rectangle extends Shape
{
    private double width;
    private double length;
    public Rectangle()
    {}
    public Rectangle(double width, double length)
    { this.length = length; this.width = width;}
    public Rectangle(String color, boolean filled, double width, double length)
    {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public void setWidth(double width) {this.width = width;}
    public double getLength() {return length;}
    public double getWidth() {
        return width;
    }

    @Override
    public double getArea() {return length*width;}

    @Override
    public double getPerimetr() {return (width+length)*2;}
    @Override
    public String getType() {return "Фигура: прямоугольник";}


    @Override
    public String toString() {return "Четырехугольник: \n"+"длина: "+ length +
            "\n ширина:" + width +"\n периметр: "+
            getPerimetr() + "\n площадь: " +  getArea();}
}
