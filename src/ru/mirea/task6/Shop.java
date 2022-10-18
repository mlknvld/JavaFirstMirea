package ru.mirea.task6;

import java.util.Objects;

public class Shop implements Computer
{
    String[] computers;
    public Shop(int count)
    {
        computers = new String[count];
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

    public String toStringShop()
    {
        String str = "";
        for(int i = 0; i<computers.length; i++)
        {
            str = str+computers[i]+"\n";
        }
        return  str;
    }
}
