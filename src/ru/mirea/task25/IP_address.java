package ru.mirea.task25;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class IP_address
{
    public static void main(String[] args)
    {
        printFind("127.0.0.1", "255.255.255.0", "abc.def.gha.bcd", "1300.6.7.8");
    }

    private static void printFind(String... lines)
    {
        Pattern p = Pattern.compile("((0|1\\d{0,2}|2([0-4][0-9]|5[0-5]))\\.){3}(0|1\\d{0,2}|2([0-4][0-9]|5[0-5]))");
        for (String s : lines)
        {
            Matcher m = p.matcher(s);
            if (m.find())
            {
                System.out.println(m.group());
            }
            else
            {
                System.out.println("Not found");
            }
        }
    }
}
