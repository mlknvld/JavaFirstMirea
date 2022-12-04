package ru.mirea.task17;

public class Employee
{
    private double cost_per_one_hour;
    private double hours_number;
    private double days_number;
    private double salary_per_month;

    public void setDays_number(float days_number) {
        this.days_number = days_number;
    }

    public void setCost_per_one_hour(float cost_per_one_hour) {
        this.cost_per_one_hour = cost_per_one_hour;
    }

    public void setHours_number(float hours_number) {
        this.hours_number = hours_number;
    }

    public double getCost_per_one_hour() {
        return cost_per_one_hour;
    }

    public double getDays_number() {
        return days_number;
    }

    public double getHours_number() {
        return hours_number;
    }

    public void setSalary_per_month() {
        this.salary_per_month = cost_per_one_hour * hours_number * days_number;
    }

    public double getSalary_per_month() {
        return salary_per_month;
    }

}
