package ru.mirea.task4;

public class Phone
{
    private int number;
    private String model;
    private double weight;

    public void setModel(String model) {this.model = model;}
    public void setNumber(int number) {this.number = number;}
    public void setWeight(double weight) {this.weight = weight;}
    public double getWeight() {return weight;}
    public int getNumber() {return number;}
    public String getModel() {return model;}
    public Phone() {}
    public Phone(int number, String model, double weight)
    {
        this(number, model);
        this.weight = weight;
    }
    public Phone(int number, String model)
    {
        this.number = number;
        this.model = model;
    }
    public void receiveCall(String name)
    {
        System.out.println("Звонит " + name);
    }
    public void receiveCall(String name, int number)
    {
        System.out.println("Звонит " + name+"; Номер телефона: "+number);
    }
    public void sendMessage(int ... numbers)
    {
        System.out.println("Номера телефонов, которым будет отправлено сообщение: ");
        for(int x: numbers)
        {
           System.out.println(x);
        }
    }

}

