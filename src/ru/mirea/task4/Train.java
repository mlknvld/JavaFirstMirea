package ru.mirea.task4;

public class Train extends Transport
{
    public Train(double way, int count_passengers, double amount_goods)
    {
        super(way, count_passengers, amount_goods);
        this.setSpeed(70);
        this.setCost_passenger(5000);
        this.setCost_one_kilo(400);
    }
}
