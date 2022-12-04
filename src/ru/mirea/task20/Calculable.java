package ru.mirea.task20;

interface Operations<T extends Number>
{
    public T sum(T a, T b);
    public T divide(T a, T b);
    public T multiply(T a, T b);
    public T subtraction(T a, T b);
}


public class Calculable<T extends Number> implements Operations<T>
{

    public Calculable() {   }
    @Override
    public T sum(T a, T b)
    {
        if(a instanceof Integer)
            return (T) (Integer.valueOf(a.intValue() + b.intValue()));
        else if(a instanceof Double)
            return (T) (Double.valueOf(a.doubleValue() + b.doubleValue()));
        else if(a instanceof Float)
            return (T) (Float.valueOf(a.floatValue() + b.floatValue()));

        return null;
    }

    @Override
    public T multiply(T a, T b)
    {
        if(a instanceof Integer)
            return (T) (Integer.valueOf(a.intValue() * b.intValue()));
        else if(a instanceof Double)
            return (T) (Double.valueOf(a.doubleValue() * b.doubleValue()));
        else if(a instanceof Float)
            return (T) (Float.valueOf(a.floatValue() * b.floatValue()));

        return null;
    }

    @Override
    public T divide(T a, T b)
    {
        if(a instanceof Integer)
            return (T) (Integer.valueOf(a.intValue() / b.intValue()));
        else if(a instanceof Double)
            return (T) (Double.valueOf(a.doubleValue() / b.doubleValue()));
        else if(a instanceof Float)
            return (T) (Float.valueOf(a.floatValue() / b.floatValue()));

        return null;
    }

    @Override
    public T subtraction(T a, T b)
    {
        if(a instanceof Integer)
            return (T) (Integer.valueOf(a.intValue() - b.intValue()));
        else if(a instanceof Double)
            return (T) (Double.valueOf(a.doubleValue() - b.doubleValue()));
        else if(a instanceof Float)
            return (T) (Float.valueOf(a.floatValue() - b.floatValue()));

        return null;
    }
}