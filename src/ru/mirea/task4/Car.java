package ru.mirea.task4;

public class Car extends Transport
{
    public Car(double way, int count_passengers, double amount_goods)
    {
        super(way, count_passengers, amount_goods);
        this.setSpeed(80);
        this.setCost_passenger(500);
        this.setCost_one_kilo(300);
    }
}
