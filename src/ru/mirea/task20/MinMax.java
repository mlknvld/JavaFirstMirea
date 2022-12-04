package ru.mirea.task20;

interface MinimumMaximum<T extends Number>
{
    public T max();
    public T min();
}

class MinMax<T extends Number> implements MinimumMaximum<T>
{
    private T[] mass;

    public MinMax(T[] mass) {
        this.mass = mass;
    }

    @Override
    public T max()
    {
        if(mass[0] instanceof Integer)
        {
            int max1 = mass[0].intValue();
            for (int i = 0; i < mass.length; i++)
            {
                if(mass[i].intValue()>max1)
                {
                    max1 = mass[i].intValue();
                }
            }
            return (T) (Integer.valueOf(max1));
        }
        else if(mass[0] instanceof Float)
        {
            float max1 = mass[0].floatValue();
            for (int i = 0; i < mass.length; i++)
            {
                if(mass[i].floatValue()>max1)
                {
                    max1 = mass[i].floatValue();
                }
            }
            return (T) (Float.valueOf(max1));
        }
        else if(mass[0] instanceof Double)
        {
             double max1 = mass[0].doubleValue();
            for (int i = 0; i < mass.length; i++)
            {
                if(mass[i].doubleValue()>max1)
                {
                    max1 = mass[i].doubleValue();
                }
            }
            return (T) (Double.valueOf(max1));
        }
        return null;
    }

    @Override
    public T min()
    {
        if(mass[0] instanceof Integer)
        {
            int min1 = mass[0].intValue();
            for (int i = 0; i < mass.length; i++)
            {
                if(mass[i].intValue()<min1)
                {
                    min1 = mass[i].intValue();
                }
            }
            return (T) (Integer.valueOf(min1));
        }
        else if(mass[0] instanceof Float)
        {
            float min1 = mass[0].floatValue();
            for (int i = 0; i < mass.length; i++)
            {
                if(mass[i].floatValue()<min1)
                {
                    min1 = mass[i].floatValue();
                }
            }
            return (T) (Float.valueOf(min1));
        }
        else if(mass[0] instanceof Double)
        {
            double min1 = mass[0].doubleValue();
            for (int i = 0; i < mass.length; i++)
            {
                if(mass[i].doubleValue()<min1)
                {
                    min1 = mass[i].doubleValue();
                }
            }
            return (T) (Double.valueOf(min1));
        }
        return null;
    }
}
