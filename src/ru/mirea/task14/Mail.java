package ru.mirea.task14;
import java.util.regex.Pattern;
public class Mail
{
    public static void main(String[] args)
    {
        Pattern p1 = Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)$");
        String str  = "user@example.com";
        System.out.println(str + ": " + p1.matcher(str).matches());

        str  = "root@localhost";
        System.out.println(str + ": " + p1.matcher(str).matches());

        str  = "myhost@@@com.ru";
        System.out.println(str + ": " + p1.matcher(str).matches());

        str  = "@my.ru";
        System.out.println(str + ": " + p1.matcher(str).matches());

        str  = "Julia String";
        System.out.println(str + ": " + p1.matcher(str).matches());
    }
}
