package ru.mirea.task7;

public class MathFunc
{
    private int x;
    private int y;
    public MathFunc(int a, int b)
    {
        this.x = a;
        this.y = b;
    }

    public double PI()
    {
        return 3.14;
    }

    public String stepen(int step)
    {
        double phi1 = Math.atan(x);
        double phi2 = Math.atan(y);
        double r = module();
        double R = Math.pow(r,step);
        double Phi1 = step*phi1;
        double Phi2 = step*phi2;
        double X = R * Math.cos(Phi1);
        double Y = R * Math.sin(Phi2);
        String str = "Действительная часть х: " + X + " Действительная часть у: " + Y;
        return str;
    }

    public double module()
    {
       return Math.sqrt(x*x+y*y);
    }
}
