package ru.mirea.task2;

public class Ball
{
    private double x=0.0;
    private double y=0.0;
    public Ball(double x, double y)
    {this.x = x; this.y = y;}
    public Ball()
    {}

    public double getX()
    {return x;}
    public double getY()
    {return y;}
    public void setX(double x)
    {this.x = x;}
    public void setY(double y)
    {this.y = y;}
    public void setXY()
    {this.x = x; this.y = y;}
    public void move(double xDisp, double yDisp)
    {
        this.x = this.x+xDisp;
        this.y = this.y+yDisp;
    }
    public String toString()
    {
        return "Координаты мяча: "+x+" "+y;
    }
}
