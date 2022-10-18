package ru.mirea.task4;

public class Plane extends Transport
{
    public Plane(double way, int count_passengers, double amount_goods)
    {
        super(way, count_passengers, amount_goods);
        this.setSpeed(926);
        this.setCost_passenger(30000);
        this.setCost_one_kilo(1000);
    }
}
