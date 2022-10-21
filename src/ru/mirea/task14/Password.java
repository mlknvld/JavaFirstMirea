package ru.mirea.task14;
import java.util.regex.Pattern;
public class Password
{
    public static void main(String[] args)
    {
        Pattern p1 = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[A-Za-z0-9_]{8,}$");
        String str  = "F032_Password";
        System.out.println(str + ": " + p1.matcher(str).matches());

        str  = "TrySpy1";
        System.out.println(str + ": " + p1.matcher(str).matches());

        str  = "smart_pass";
        System.out.println(str + ": " + p1.matcher(str).matches());

        str  = "A007";
        System.out.println(str + ": " + p1.matcher(str).matches());

    }
}
