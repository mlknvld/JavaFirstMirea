package ru.mirea.task14;

import java.util.regex.Pattern;

public class IsStringOrNot
{
    public static void main(String[] args)
    {
        Pattern p1 = Pattern.compile("^abcdefghijklmnopqrstuv18340$");
        String str  = "abcdefghijklmnopqrstuv18340";
        System.out.println(str + ": " + p1.matcher(str).matches());

        str  = "abcdefghijklmnoasdfasdpqrstuv18340";
        System.out.println(str + ": " + p1.matcher(str).matches());

        str  = "123abcdefghijklmnopqrstuv18340";
        System.out.println(str + ": " + p1.matcher(str).matches());
    }
}
