package ru.mirea.task7;

public class Stroka
{
    private String stroka;
    public Stroka(String stroka)
    {
        this.stroka = stroka;
    }
    public int count()
    {
        return stroka.length();
    }
    public String str()
    {
        String st = "";
        for(int i = 0; i<stroka.length(); i++)
        {
            if(i%2!=0)
            {
                st = st + stroka.charAt(i);
            }
        }
        return st;
    }
    public String invert()
    {
        String newstr = "";
        for(int i = stroka.length()-1; i >=0 ; i--)
        {
            newstr+=stroka.charAt(i);
        }
        return newstr;
    }
}
