package ru.mirea.task5;

import java.awt.*;

public class Square extends Shape
{
    private int side;
    public Square()
    {super();}
    public Square(Color color, int[] position, int side)
    {
        super(color, position);
        this.side = side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void paintsquare(Graphics g)
    {
        g.fillRect(position[0], position[1], side, side);
    }

}
