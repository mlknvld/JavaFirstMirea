package ru.mirea.task6;

public class Processor implements Computer
{
    private int frequency;
    private int cash_memory;
    private int bit_depth;
    public Processor()
    {}
    public Processor(int frequency, int cash_memory, int bit_depth)
    {
        this.bit_depth = bit_depth;
        this.cash_memory = cash_memory;
        this.frequency = frequency;
    }

    public int getBit_depth() {
        return bit_depth;
    }

    public int getCash_memory() {
        return cash_memory;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setBit_depth(int bit_depth) {
        this.bit_depth = bit_depth;
    }

    public void setCash_memory(int cash_memory) {
        this.cash_memory = cash_memory;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public String toStringProcessor()
    {
        return "\n Характеристики процессора: \n кэш-память: "+cash_memory
                +"\n тактовая частота: "+frequency
                +"\n разрядность: "+bit_depth;
    }
}
