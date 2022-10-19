package ru.mirea.task12;

import ru.mirea.task5.Shape;

import java.awt.*;

public class Rectangle extends Shape
{
    private int width;
    private int height;
    public Rectangle()
    {super();}
    public Rectangle(Color color, int[] position, int width, int height)
    {
        super(color, position);
        this.height = height;
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void paintrectangle(Graphics g)
    {
        g.fillRect(position[0], position[1], width, height);
        //g.setColor();
    }
}
