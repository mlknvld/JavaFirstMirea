package ru.mirea.task25;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Expressions
{
    public static void main(String[] args)
    {
        System.out.println(checkExpression("((3*+*5)*–*9*×*4"));
    }


    private static boolean checkExpression(String input) {
        Pattern pattern = Pattern.compile("\\([\\d+/*-]*\\)");
        Matcher matcher = pattern.matcher(input);
        do
        {
            input = matcher.replaceAll("");
            matcher = pattern.matcher(input);
        } while (matcher.find());
        return input.matches("[\\d+/*-]*");
    }
}

