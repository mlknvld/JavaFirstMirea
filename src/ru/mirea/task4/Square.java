package ru.mirea.task4;

import java.awt.*;

public class Square extends Rectangle
{
    public Square()
    {}
    public Square(double side)
    {this.setLength(side);
    this.setWidth(side);}
    public Square(String color, boolean filled, double side)
    {
        super(color, filled, side, side);
    }
    public void setSide(double side) {super.setLength(side); super.setWidth(side);}
    public double getSide() {return super.getLength();}


    @Override
    public String toString() {return super.toString();}
    public double getArea() {return super.getArea();}

    public double getPerimetr() {return super.getPerimetr();}
    @Override
    public String getType() {return "Фигура: квадрат";}
}
