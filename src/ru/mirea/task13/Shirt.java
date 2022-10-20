package ru.mirea.task13;

public class Shirt
{
    private String number;
    private String name;
    private String color;
    private String size;
    public Shirt(String number, String name, String color, String size)
    {
        this.color = color;
        this.name = name;
        this.number = number;
        this.size = size;
    }
    public String getName() {return name;}
    public String getColor() {return color;}
    public String getNumber() {return number;}
    public String getSize() {return size;}
    public void setName(String name) {this.name = name;}
    public void setColor(String color) {this.color = color;}
    public void setNumber(String number) {this.number = number;}
    public void setSize(String size) {this.size = size;}
    public void toStr()
    {
        System.out.println("\nнаименование товара:"+name+ "\nартикул:"+number
                + "\nцвет:"+color+ "\nразмер:"+size);
        System.out.println("-------------------------");
    }
}
