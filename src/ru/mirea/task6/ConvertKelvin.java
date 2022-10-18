package ru.mirea.task6;

public class ConvertKelvin implements Convertable
{
    private double temperature;
    public ConvertKelvin(double temperature)
    {this.temperature = temperature;}
    public void convert()
    {
        temperature += 273.15;
    }

    public double getTemperature() {return temperature;}
    public void setTemperature(double temperature) {this.temperature = temperature;}
}
