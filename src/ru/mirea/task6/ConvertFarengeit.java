package ru.mirea.task6;

public class ConvertFarengeit implements Convertable
{
    private double temperature;
    public ConvertFarengeit(double temperature)
    {this.temperature = temperature;}
    public void convert()
    {
        temperature = temperature*9/5 + 32;
    }

    public double getTemperature() {return temperature;}
    public void setTemperature(double temperature) {this.temperature = temperature;}


}
