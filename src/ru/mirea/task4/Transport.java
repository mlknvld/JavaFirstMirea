package ru.mirea.task4;

abstract class Transport
{
    public Transport(double way, int count_passengers, double amount_goods)
    {
        this.amount_goods = amount_goods;
        this.count_passengers = count_passengers;
        this.way = way;
    }
    private double time;
    private double cost_passengers;
    private double cost_passenger;
    private int count_passengers;
    private double cost_one_kilo;
    private double amount_goods;
    private double cost_goods;
    private double speed;
    private double way;

    public void setCost_goods() {this.cost_goods = cost_one_kilo*amount_goods;}
    public double getCost_goods() {return cost_goods;}

    public void setTime() {this.time = way/speed;}
    public double getTime() {return time;}

    public void setAmount_goods(double amount_goods) {this.amount_goods = amount_goods;}
    public double getAmount_goods() {return amount_goods;}

    public void setCost_passengers() {this.cost_passengers = cost_passenger*count_passengers;}
    public double getCost_passengers() {return cost_passengers;}

    public void setCost_one_kilo(double cost_one_kilo) {this.cost_one_kilo = cost_one_kilo;}
    public double getCost_one_kilo() {return cost_one_kilo;}

    public void setCost_passenger(double cost_passenger) {this.cost_passenger = cost_passenger;}
    public double getCost_passenger() {return cost_passenger;}

    public void setCount_passengers(int count_passengers) {this.count_passengers = count_passengers;}
    public int getCount_passengers() {return count_passengers;}

    public double getSpeed() {return speed;}
    public void setSpeed(double speed) {this.speed = speed;}

    public double getWay() {return way;}
    public void setWay(double way) {this.way = way;}
}
