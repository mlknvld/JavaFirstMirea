package ru.mirea.task4;

public class Memory
{
    private int time_access;
    private int capacity;
    public Memory()
    {}
    public Memory(int time_access, int capacity)
    {
        this.capacity = capacity;
        this.time_access = time_access;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTime_access() {
        return time_access;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setTime_access(int time_access) {
        this.time_access = time_access;
    }

    public String toStringMemory()
    {
        return "\n Характеристики памяти: \n объем: "+capacity
                +"\n время доступа: "+time_access;
    }

}
