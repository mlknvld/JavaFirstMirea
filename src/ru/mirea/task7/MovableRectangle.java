package ru.mirea.task7;

public class MovableRectangle
{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;
    public MovableRectangle(MovablePoint p1, MovablePoint p2)
    {
        this.topLeft = p1;
        this.bottomRight = p2;
    }

    public String toString()
    {
        return "\nКоординаты точки:"+"\nпо х: "+topLeft.getX()+"\nпо у: "+topLeft.getY()
                +"\nКоординаты точки:"+"\nпо x: "+bottomRight.getX()+"\nпо у: "+bottomRight.getY();
    }

    public boolean SpeedTest()
    {
        if(topLeft.getxSpeed()== bottomRight.getxSpeed() & topLeft.getySpeed()== bottomRight.getySpeed())
        {
            return true;
        }
        else {return false;}
    }

}
