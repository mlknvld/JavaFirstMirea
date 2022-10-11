package ru.mirea.task2;
import java.util.Objects;
public class Shop
{
    String[] computers;
    public Shop(int n)
    {
        computers = new String[n];
    }
    public void add(String name, int i)
    {
        computers[i] = name;
    }
    public void delete(String name)
    {
        for(int i = 0; i<computers.length; i++)
        {
            if(Objects.equals(computers[i], name))
            {
                computers[i] = "";
            }
        }
    }
    public boolean  poisk(String name)
    {
        for(int i = 0; i<computers.length; i++)
        {
            if(Objects.equals(computers[i], name))
            {
                return true;
            }
        }
        return false;

    }
}
