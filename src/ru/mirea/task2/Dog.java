package ru.mirea.task2;

public class Dog
{
    private String name;
    private int age;
    public Dog(String name, int age)
    {
        this.age = age;
        this.name = name;
    }
    public void SetName()
    {this.name = name;}

    public String GetName()
    {return name;}

    public void SetAge()
    {this.age = age;}

    public int GetAge()
    {return age;}

    public int convertation()
    {
        return age*7;
    }

    public String ToString()
    {
        return "имя собаки: "+name+"; возраст собаки: "+age+"; человеческий возраст: "+convertation();
    }
}
