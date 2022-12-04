package ru.mirea.task22;

import java.util.Scanner;
import java.util.Stack;

public class RPN
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strings = str.split(" ");
        Stack<Double> stack = new Stack<Double>();
        for(int i = 0; i < strings.length; i++)
        {
            if(isNumber(strings[i]))
            {
                stack.push(Double.parseDouble(strings[i]));
            }
            else
            {
                double tmp1 = stack.pop();
                double tmp2 = stack.pop();
                switch (strings[i])
                {
                    case "+":
                        stack.push(tmp1+tmp2);
                        break;
                    case "-":
                        stack.push(tmp1-tmp2);
                        break;
                    case "*":
                        stack.push(tmp1*tmp2);
                        break;
                    case "/":
                        stack.push(tmp1/tmp2);
                        break;
                }
            }
        }

        if(!stack.isEmpty())
        {
            System.out.println(stack.pop());
        }
        else
        {
            System.out.println("Ошибка");
        }
    }

    private static boolean isNumber(String string)
    {
        try
        {
            Double.parseDouble(string);
            return true;
        }
        catch (NumberFormatException ex)
        {
            return false;
        }
    }
}
