package ru.mirea.task12;

import ru.mirea.task5.Shape;

import java.awt.*;

public class Circle extends Shape
{
    private int radius;
    public Circle()
    {super();}
    public Circle(Color color, int[] position, int radius)
    {
        super(color, position);
        this.radius = radius;
    }

    public int getRadius()
    {
        return radius;
    }

    public void setRadius(int radius)
    {
        this.radius = radius;
    }

    public void paintcircle(Graphics g)
    {
        g.fillOval(position[0], position[1], radius, radius);
    }
}
