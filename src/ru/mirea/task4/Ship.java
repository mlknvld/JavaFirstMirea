package ru.mirea.task4;

public class Ship extends Transport
{
    public Ship(double way, int count_passengers, double amount_goods)
    {
        super(way, count_passengers, amount_goods);
        this.setSpeed(80);
        this.setCost_passenger(20000);
        this.setCost_one_kilo(200);
    }
}
