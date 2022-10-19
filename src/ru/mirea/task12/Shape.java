package ru.mirea.task12;

import java.awt.*;

public abstract class Shape
{
    protected Color color;
    protected int[] position;
    public Shape()
    {}
    public Shape(Color color, int[] position)
    {
        this.color = color;
        this.position = position;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setPosition(int[] position) {
        this.position = position;
    }

    public int getPositionfirst() {
        return position[0];
    }
    public int getPositionsecond() { return position[1]; }

    public Color getColor() {
        return color;
    }

}
