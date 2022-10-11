package ru.mirea.task2;

public class Circle
{
    private double x;
    private double y;
    private double r;
    public Circle()
    {}

    public Circle(double x, double y, double r)
    {
        this.x = x;
        this.y = y;
        this.r = r;
    }
    public void SetX(double x)
    {
        this.x = x;
    }
    public void SetY(double y)
    {
        this.y = y;
    }
    public void SetR(double r)
    {
        this.r = r;
    }

    public double GetX()
    {
        return x;
    }
    public double GetY()
    {
        return y;
    }
    public double GetR()
    {
        return r;
    }

    public double square()
    {
        return 3.14*r*r;
    }
    public double length()
    {
        return 2*3.14*r;
    }
    public String sravnenie(Circle circle2)
    {
        System.out.println();
        String result = "";
        if(r> circle2.r)
        {
            result="радиус первой окружности больше второй на "+(r-circle2.r);
        }
        else
        {
            if(r< circle2.r)
            {
                result="радиус первой окружности меньше второй на "+(circle2.r-r) +"; ";
            }
            else {result="радиусы первой и второй окружностей равны"+"; ";}
        }
        result = result + " разница координат центров окружностей: по x(x1-x2) " + (x-circle2.x) + " по у(y1-y2) " + (y-circle2.y);
        return result;
    }
}
