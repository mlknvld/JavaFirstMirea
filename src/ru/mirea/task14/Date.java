package ru.mirea.task14;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Date
{

    private static final Pattern DATE_PATTERN = Pattern.compile(
            "^(0[1-9]|[12]\\d|3[01])/([0][1-9]|1[0-2])/((?:1[6-9]|[2-9]\\d)\\d{2})$") ;

    public static void test ()
    {
        assert true;
        checkString ("29/02/2000");
        assert true;
        checkString("30/04/2003");
        assert true;
        checkString("01/01/2003");
        assert false;
        checkString("29/02/2001");
        assert false;
        checkString("30-04-2003");
        assert false;
        checkString("1/1/1899");
    }

    static private boolean checkString(final String dateAsString)
    {
        Matcher m = DATE_PATTERN.matcher(dateAsString) ;
        boolean result = m.matches() ;
        if (result)
        {
            int day = Integer.parseInt(m.group(1));
            int month = Integer.parseInt(m.group(2));
            int year = Integer.parseInt(m.group(3));
            if (day > 28 && month==2)
            {
                result = false;
            }
            if(year<1900 || year>9999)
            {
                result = false;
            }
            if(day>30)
            {
                if(month == 4 || month ==  6 || month ==  9 || month ==  11)
                {
                    result = false;
                }
            }
        }
        return result;
    }


    public static void main(String[] args)
    {
        assert true;
        System.out.println(checkString ("29/02/2000"));
        assert true;
        System.out.println(checkString("31/11/2003"));
        assert true;
        System.out.println(checkString("01/01/1899"));
        assert false;
        System.out.println(checkString("29/02/2001"));
        assert false;
        System.out.println(checkString("30-04-2003"));
        assert false;
        System.out.println(checkString("1/1/1899"));
    }
}
